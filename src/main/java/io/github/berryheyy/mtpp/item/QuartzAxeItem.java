package io.github.berryheyy.mtpp.item;

import io.github.berryheyy.mtpp.Config;
import io.github.berryheyy.mtpp.ModToolMaterials;
import io.github.berryheyy.mtpp.Mtpp;
import net.minecraft.item.AxeItem;

public class QuartzAxeItem extends AxeItem {

    public QuartzAxeItem() {
        super(ModToolMaterials.QUARTZ, (float) Config.QUARTZ_AXE_ATTACK-1, (float) Config.QUARTZ_AXE_ATTACK_SPEED-4, new Settings().group(Mtpp.ITEM_GROUP));
    }
}
