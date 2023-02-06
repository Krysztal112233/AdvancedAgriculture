package dev.krysztal.advagri.foundation.api.event;

import java.util.Arrays;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;

@SuppressWarnings("unused")
public class SolarTermChangeEvent {

  public static Event<SeasonChange> EVENT = EventFactory.createArrayBacked(
    SeasonChange.class,
    listeners ->
      (minecraftServer, serverWorld) ->
        Arrays
          .stream(listeners)
          .forEach($ -> $.interact(minecraftServer, serverWorld))
  );

  @FunctionalInterface
  public interface SeasonChange {
    public void interact(
      MinecraftServer minecraftServer,
      ServerWorld serverWorld
    );
  }
}
