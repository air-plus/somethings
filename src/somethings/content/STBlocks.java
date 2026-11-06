package somethings.content;

import mindustry.world.blocks.production.GenericCrafter;
import mindustry.type.*;
import mindustry.content.*;
import mindustry.world.draw.*;

public class STBlocks {
    public static GenericCrafter zAlloyMixer;

    public static void load() {
        zAlloyMixer = new GenericCrafter("z-alloy-mixer") {
            {
                health = 8000;
                size = 2;
                craftTime = 120f;
                requirements(Category.crafting, ItemStack.with(
                        Items.copper, 4000,
                        Items.lead, 4000,
                        Items.silicon, 2000,
                        Items.surgeAlloy, 800
                ));
                consumeItems(ItemStack.with(
                        Items.surgeAlloy, 2,
                        Items.silicon, 1
                ));
                consumeLiquid(Liquids.slag, 2f);
                consumePower(1.8f);
                outputItem = new ItemStack(STItems.zAlloy, 2);
                drawer = new DrawMulti(
                new DrawDefault(),
                new DrawArcSmelt(),
                new DrawLiquidTile(Liquids.slag)
                );
            }
        };
    }
}
