package io.github.berryheyy.mtpp.registry;

import io.github.berryheyy.mtpp.Reference;
import net.minecraft.client.MinecraftClient;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModParticleTypes {

    public static final DefaultParticleType RIFT = Registry.register(Registry.PARTICLE_TYPE, new Identifier(Reference.MOD_ID, "rift"), new DefaultParticleType(true));

    public static void init() {

    }

}
