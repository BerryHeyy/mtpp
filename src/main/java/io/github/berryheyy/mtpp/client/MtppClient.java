package io.github.berryheyy.mtpp.client;

import io.github.berryheyy.mtpp.network.PacketManager;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class MtppClient implements ClientModInitializer {

    static int INCREMENTOR = 1;

    @Override
    public void onInitializeClient() {
        ClientPlayNetworking.registerGlobalReceiver(PacketManager.SPAWN_RIFT_PARTICLE_PACKET_ID, ((client, handler, buf, responseSender) -> {
            BlockPos pos = buf.readBlockPos();

            client.execute(() ->{
                Random random = new Random(System.currentTimeMillis()/INCREMENTOR);

                client.world.addParticle(random.nextFloat() > 0.5f ? ParticleTypes.ENCHANT : ParticleTypes.ENCHANTED_HIT, pos.getX(), pos.getY(), pos.getZ(), random.nextFloat(), random.nextFloat(), random.nextFloat());
                INCREMENTOR++;
            });
        }));

        ClientPlayNetworking.registerGlobalReceiver(PacketManager.RIFT_EFFECT_CLIENT_PACKET_ID, ((client, handler, buf, responseSender) -> {




        }));
    }
}
