package somethings;

import mindustry.mod.Mod;
import somethings.content.*;

public class SomethingsMod extends Mod {
    @Override
    public void loadContent() {
        STItems.load();
        STBlocks.load();
    }
}
