package io.github.berryheyy.mtpp.item;

import io.github.berryheyy.mtpp.Config;
import io.github.berryheyy.mtpp.ModToolMaterials;
import io.github.berryheyy.mtpp.Mtpp;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;

public class LapisAxeItem extends AxeItem {

    public LapisAxeItem() {
        super(ModToolMaterials.LAPIS, (float) Config.LAPIS_AXE_ATTACK-1, (float) Config.LAPIS_AXE_ATTACK_SPEED-4, new Item.Settings().group(Mtpp.ITEM_GROUP));
    }
}
