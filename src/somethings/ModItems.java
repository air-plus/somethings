package somethings;

import arc.graphics.Color;
import mindustry.type.Item;

public class ModItems {
    public static Item exampleItem;

    public static void load() {
        exampleItem = new Item("example-item", Color.red);
    }
}
