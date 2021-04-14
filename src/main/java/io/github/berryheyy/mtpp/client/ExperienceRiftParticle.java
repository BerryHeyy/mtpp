package io.github.berryheyy.mtpp.client;

import io.github.berryheyy.mtpp.Reference;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.particle.SpriteBillboardParticle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ExperienceRiftParticle extends SpriteBillboardParticle {
    static final Identifier SPRITE = new Identifier(Reference.MOD_ID, "particle/experience_rift");

    public ExperienceRiftParticle(ClientWorld clientWorld, double x, double y, double z) {
        this(clientWorld, x, y, z, 0, 0, 0);
    }
    public ExperienceRiftParticle(ClientWorld world, double x, double y, double z, double vx, double vy, double vz) {
        super(world, x, y, z, vx, vy, vz);

    }

    @Override
    public ParticleTextureSheet getType() {
        return null;
    }
}
