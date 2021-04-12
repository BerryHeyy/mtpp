package io.github.berryheyy.mtpp.item;

import io.github.berryheyy.mtpp.Config;
import io.github.berryheyy.mtpp.ModToolMaterials;
import io.github.berryheyy.mtpp.Mtpp;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class LapisHoeItem extends HoeItem {

    public LapisHoeItem() {
        super(ModToolMaterials.LAPIS, Config.LAPIS_HOE_ATTACK-1, (float) Config.LAPIS_HOE_ATTACK_SPEED-4, new Item.Settings().group(Mtpp.ITEM_GROUP));
    }
}
