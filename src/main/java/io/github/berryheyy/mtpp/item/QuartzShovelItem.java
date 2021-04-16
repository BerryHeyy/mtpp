package io.github.berryheyy.mtpp.item;

import io.github.berryheyy.mtpp.Config;
import io.github.berryheyy.mtpp.ModToolMaterials;
import io.github.berryheyy.mtpp.Mtpp;
import net.minecraft.item.ShovelItem;

public class QuartzShovelItem extends ShovelItem {

    public QuartzShovelItem() {
        super(ModToolMaterials.QUARTZ, (float) Config.QUARTZ_SHOVEL_ATTACK-1, (float) Config.QUARTZ_SHOVEL_ATTACK_SPEED-4, new Settings().group(Mtpp.ITEM_GROUP));
    }
}
