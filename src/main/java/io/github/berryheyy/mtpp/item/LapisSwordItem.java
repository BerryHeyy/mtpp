package io.github.berryheyy.mtpp.item;

import io.github.berryheyy.mtpp.Config;
import io.github.berryheyy.mtpp.ModToolMaterials;
import io.github.berryheyy.mtpp.Mtpp;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class LapisSwordItem extends SwordItem {

    public LapisSwordItem() {
        super(ModToolMaterials.LAPIS, Config.LAPIS_SWORD_ATTACK-1, (float) Config.LAPIS_SWORD_ATTACK_SPEED-4, new Item.Settings().group(Mtpp.ITEM_GROUP));
    }
}
