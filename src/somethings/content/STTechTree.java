package somethings.content;

import mindustry.content.*;

public class STTechTree {
    public static void load() {
        alpha.techTree = nodeRoot("alpha", coreShard, () -> {
            node(STBlocks.zAlloyMixer, () -> {});

            nodeProduce(STItems.zAlloy, () -> {});
        });
    }
}
