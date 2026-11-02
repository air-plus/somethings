package somethings;

import mindustry.mod.Mod;

public class ModItems {
    public static Item example-item;

    public static void load() {
        example-item = new Item("example-item");
    }
}

public class SomethingsMod extends Mod {
    @Override
    public void loadContent() {
        ModItems.load();
    }
}
