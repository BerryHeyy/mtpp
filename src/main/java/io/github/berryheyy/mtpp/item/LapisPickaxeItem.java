package io.github.berryheyy.mtpp.item;

import io.github.berryheyy.mtpp.Config;
import io.github.berryheyy.mtpp.ModToolMaterials;
import io.github.berryheyy.mtpp.Mtpp;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class LapisPickaxeItem extends PickaxeItem {

    public LapisPickaxeItem() {
        super(ModToolMaterials.LAPIS, Config.LAPIS_PICKAXE_ATTACK-1, (float) Config.LAPIS_PICKAXE_ATTACK_SPEED-4, new Item.Settings().group(Mtpp.ITEM_GROUP));
    }

}
