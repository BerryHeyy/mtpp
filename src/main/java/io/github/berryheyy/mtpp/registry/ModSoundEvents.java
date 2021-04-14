package io.github.berryheyy.mtpp.registry;

import io.github.berryheyy.mtpp.Reference;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSoundEvents {

    public static final Identifier RIFT_OPEN_ID = new Identifier(Reference.MOD_ID, "rift_open");
    public static final SoundEvent RIFT_OPEN = new SoundEvent(RIFT_OPEN_ID);

    public static void init() {
        Registry.register(Registry.SOUND_EVENT, RIFT_OPEN_ID, RIFT_OPEN);
    }

}
