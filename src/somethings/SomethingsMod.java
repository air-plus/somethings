package somethings;

import arc.graphics.Color;
import mindustry.mod.Mod;
import mindustry.type.Item;

public class SomethingsMod extends Mod {
    @Override
    public void loadContent() {
        ModItems.load();
    }
}

class ModItems {
    public static Item exampleItem;

    public static void load() {
        exampleItem = new Item("example-item", Color.red);
    }
}
