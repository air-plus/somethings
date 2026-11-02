package somethings;

import mindustry.mod.Mod;
import mindustry.type.Item;

class ModItems {
    public static Item exampleItem;

    public static void load() {
        exampleItem = new Item("example-item");
    }
}

public class SomethingsMod extends Mod {
    @Override
    public void loadContent() {
        ModItems.load();
    }
}
