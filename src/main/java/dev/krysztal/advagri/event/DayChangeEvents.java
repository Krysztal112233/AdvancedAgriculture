package dev.krysztal.advagri.event;

import dev.krysztal.advagri.foundation.AdvAgriGameRules;
import dev.krysztal.advagri.foundation.AdvAgriSolarTerm;
import dev.krysztal.advagri.foundation.api.event.SolarTermChangeEvent;
import dev.krysztal.advagri.foundation.api.event.server.DayChangeEvent.DayChange;
import dev.krysztal.advagri.foundation.persistent.SolarTermPersistentState;

public class DayChangeEvents {

  public static DayChange changeSolarTerm = (minecraftServer, serverWorld) -> {
    if (serverWorld.isClient()) return;

    var solarTermPersistentState = SolarTermPersistentState.get(serverWorld);

    // Get length of year
    var termLength =
      serverWorld.getGameRules().getInt(AdvAgriGameRules.LENGTH_OF_YEAR) /
      AdvAgriSolarTerm.values().length;

    // Check should increase solar term.
    if (termLength != 0 && serverWorld.getTimeOfDay() % termLength != 0) return;

    solarTermPersistentState.incSeason();
    SolarTermPersistentState.set(serverWorld, solarTermPersistentState);

    // Emit SolarTermChangeEvent.
    SolarTermChangeEvent.EVENT.invoker().interact(minecraftServer, serverWorld);
  };
}
