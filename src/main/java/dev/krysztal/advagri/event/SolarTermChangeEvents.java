package dev.krysztal.advagri.event;

import dev.krysztal.advagri.api.event.SolarTermChangeEvent;

public class SolarTermChangeEvents {

  public static final SolarTermChangeEvent.SeasonChange changeTemp = (
    minecraftServer,
    serverWorld
  ) -> {
    // TODO: Change weather.
  };
}
