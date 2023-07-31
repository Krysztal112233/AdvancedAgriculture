package dev.krysztal.advagri.foundation.component;

import dev.krysztal.advagri.foundation.season.Season;
import dev.onyxstudios.cca.api.v3.component.ComponentV3;
import dev.onyxstudios.cca.api.v3.component.sync.AutoSyncedComponent;

public interface SeasonalComponent extends ComponentV3, AutoSyncedComponent {
    Season getSeason();

    void setSeason(Season season);
}
