package somethings.content;

import static mindustry.content.TechTree.*;
import mindustry.content.*;

public class STTechTree {
    public static void load() {
        STPlanets.alpha.techTree = nodeRoot("alpha", Blocks.coreShard, () -> {
            node(STBlocks.zAlloyMixer, () -> {});

            nodeProduce(STItems.zAlloy, () -> {});
        });
    }
}
