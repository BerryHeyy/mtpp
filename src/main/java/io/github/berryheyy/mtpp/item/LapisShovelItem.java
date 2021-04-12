package io.github.berryheyy.mtpp.item;

import io.github.berryheyy.mtpp.Config;
import io.github.berryheyy.mtpp.ModToolMaterials;
import io.github.berryheyy.mtpp.Mtpp;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class LapisShovelItem extends ShovelItem {

    public LapisShovelItem() {
        super(ModToolMaterials.LAPIS, (float) Config.LAPIS_SHOVEL_ATTACK-1, (float) Config.LAPIS_SHOVEL_ATTACK_SPEED-4, new Item.Settings().group(Mtpp.ITEM_GROUP));
    }
}
