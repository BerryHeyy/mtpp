package io.github.berryheyy.mtpp.item;

import io.github.berryheyy.mtpp.Config;
import io.github.berryheyy.mtpp.ModToolMaterials;
import io.github.berryheyy.mtpp.Mtpp;
import net.minecraft.item.PickaxeItem;

public class QuartzPickaxeItem extends PickaxeItem {

    public QuartzPickaxeItem() {
        super(ModToolMaterials.QUARTZ, Config.QUARTZ_PICKAXE_ATTACK-1, (float) Config.QUARTZ_PICKAXE_ATTACK_SPEED-4, new Settings().group(Mtpp.ITEM_GROUP));
    }

}
