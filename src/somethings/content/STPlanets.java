package somethings.content;

import mindustry.type.Planet;
import mindustry.graphics.g3d.*;
import arc.graphics.Color;

public class STPlanets {
    public static Planet psiStar, alpha;

    public static void load() {
        psiStar = new Planet("psi", null, 2.5f, 0) {
            {
                accessible = false;
                lightColor = Color.red;
            }
        };

        alpha = new Planet("alpha", psiStar, 1f, 1) {
            {
                meshLoader = () -> new NoiseMesh(
                this,
                114514,
                4,
                1f,
                3,
                0.8f,
                1f,
                1f,
                Color.valueOf("2a5a8c"),
                Color.valueOf("4a7c3f"),
                4,
                0.5f,
                1f,
                0.5f
                );
            }
        };
    }
}
