package io.github.berryheyy.mtpp.item;

import io.github.berryheyy.mtpp.Config;
import io.github.berryheyy.mtpp.ModToolMaterials;
import io.github.berryheyy.mtpp.Mtpp;
import net.minecraft.item.SwordItem;

public class QuartzSwordItem extends SwordItem {

    public QuartzSwordItem() {
        super(ModToolMaterials.QUARTZ, Config.QUARTZ_SWORD_ATTACK-1, (float) Config.QUARTZ_SWORD_ATTACK_SPEED-4, new Settings().group(Mtpp.ITEM_GROUP));
    }
}
