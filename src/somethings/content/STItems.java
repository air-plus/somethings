package somethings.content;

import mindustry.type.Item;
import arc.graphics.Color;

public class STItems {
    public static Item zAlloy;

    public static void load() {
        zAlloy = new Item("z-alloy", Color.orange) {
            {
                charge = 1f;
                cost = 1.25f;
                explosiveness = 0.7f;
                flammability = 0.3f;
            }
        };
    }
}
