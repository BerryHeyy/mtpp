package io.github.berryheyy.mtpp.registry;

import io.github.berryheyy.mtpp.Reference;
import net.minecraft.block.entity.BlockEntityType;
import io.github.berryheyy.mtpp.entity.block.InfusingBlockEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {

    public static final BlockEntityType<InfusingBlockEntity> INFUSING_BLOCK_ENTITY = Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            new Identifier(Reference.MOD_ID, "infuser"),
            BlockEntityType.Builder.create(InfusingBlockEntity::new, ModBlocks.INFUSING_BLOCK).build(null)
    );

    public static void init() {

    }

}
