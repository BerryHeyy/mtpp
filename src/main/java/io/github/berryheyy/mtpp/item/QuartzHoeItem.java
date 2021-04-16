package io.github.berryheyy.mtpp.item;

import io.github.berryheyy.mtpp.Config;
import io.github.berryheyy.mtpp.ModToolMaterials;
import io.github.berryheyy.mtpp.Mtpp;
import net.minecraft.item.HoeItem;

public class QuartzHoeItem extends HoeItem {

    public QuartzHoeItem() {
        super(ModToolMaterials.QUARTZ, Config.QUARTZ_HOE_ATTACK-1, (float) Config.QUARTZ_HOE_ATTACK_SPEED-4, new Settings().group(Mtpp.ITEM_GROUP));
    }
}
