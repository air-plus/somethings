package somethings.content;

import mindustry.type.Planet;
import mindustry.maps.generators.BlankPlanetGenerator;
import mindustry.graphics.g3d.*;
import arc.graphics.Color;

public class STPlanets {
    public static Planet psiStar, alpha;

    public static void load() {
        psiStar = new Planet("psi", null, 2.5f, 0) {{
            accessible = false;
            alwaysUnlocked = true;
            lightColor = Color.red;
            meshLoader = () -> new SunMesh(
                this, 5, 5, 0.5,
                1.0, 2.0, 1.0, 1.0f,
                Color.valueOf("4a0d05"),
                Color.valueOf("7a1a0a"),
                Color.valueOf("c43a1c"),
                Color.valueOf("f06b2e"),
                Color.valueOf("ffc24a"),
                Color.valueOf("fff0b0")
            );
        }};

        alpha = new Planet("alpha", psiStar, 1f, 2) {{
            generator = new BlankPlanetGenerator();
            alwaysUnlocked = true;
            iconColor = Color.valueOf("33ff33");
            meshLoader = () -> new NoiseMesh(
                this, 114514, 4, 1f,
                3, 0.8f, 1f, 1f,
                Color.valueOf("2a5a8c"),
                Color.valueOf("4a7c3f"),
                1, 0.5f, 1f, 0.5f
            );
            cloudMeshLoader = () -> new HexSkyMesh(
                this, 114514, 1f, 1.15f, 3,
                Color.valueOf("ffffff"),
                2, 0.7f, 1.5f, 0.5f
            );
        }};
    }
}
