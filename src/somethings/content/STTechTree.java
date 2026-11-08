package somethings.content;

import static mindustry.content.TechTree.*;
import mindustry.content.*;
import mindustry.type.*;

public class STTechTree {
    public static void load() {
        STPlanets.alpha.techTree = nodeRoot("alpha", Blocks.coreShard, () -> {
            node(STBlocks.zAlloyMixer, ItemStack.with(
                Items.silicon, 1000,
                Items.surgeAlloy, 500
            ), () -> {});

            nodeProduce(STItems.zAlloy, () -> {});
        });
    }
}
