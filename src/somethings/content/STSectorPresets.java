package somethings.content;

import mindustry.type.SectorPreset;

public class STSectorPresets {
    public static SectorPreset loadingSite;

    public static void load() {
        loadingSite = new SectorPreset("loading-site", STPlanets.alpha, 0) {{
            alwaysUnlocked = true;
            captureWave = 10;
            difficulty = 1;
        }};
    }
}
