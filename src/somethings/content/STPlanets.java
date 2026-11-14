package somethings.content;

import mindustry.type.Planet;
import mindustry.maps.generators.BlankPlanetGenerator;
import mindustry.graphics.g3d.*;
import arc.graphics.Color;
import mindustry.game.Team;

public class STPlanets {
    public static Planet psiStar, alpha;

    public static void load() {
        psiStar = new Planet("psi", null, 2.5f) {{
            bloom = true;
            accessible = false;

            meshLoader = () -> new SunMesh(
                this, 5, 4, 0.5, 2, 1.5, 1, 1.2f,
                Color.valueOf("ffaa00"),
                Color.valueOf("ffdd55"),
                Color.valueOf("ffffcc")
            );
        }};

        alpha = new Planet("alpha", psiStar, 1f, 2) {{
            alwaysUnlocked = true;
            iconColor = Color.valueOf("697723");
            startSector = 1;

            generator = new BlankPlanetGenerator();
            meshLoader = () -> new NoiseMesh(
                this, 1, 5, 1f, 3, 0.5f, 1f, 1f,
                Color.valueOf("697723"),
                Color.valueOf("00477d"),
                1, 0.5f, 1f, 0.5f
            );
            cloudMeshLoader = () -> new HexSkyMesh(
                this, 2, 1f, 0.15f, 5,
                Color.valueOf("ffffff").a(0.7f),
                4, 0.5f, 1.2f, 0.4f
            );
            ruleSetter = r -> {
                r.waveTeam = Team.derelict;
            };
        }};
    }
}
