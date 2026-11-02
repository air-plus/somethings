package somethings;

import mindustry.mod.Mod;

public class SomethingsMod extends Mod {
    @Override
    public void loadContent() {
        ModItems.load();
    }
}
