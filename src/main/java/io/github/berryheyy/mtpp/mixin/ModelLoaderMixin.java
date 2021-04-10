package io.github.berryheyy.mtpp.mixin;

import io.github.berryheyy.mtpp.Reference;
import io.github.berryheyy.mtpp.data.ItemModelGenerator;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ModelLoader.class)
public class ModelLoaderMixin {

    @Inject(method = "loadModelFromJson", at = @At(value = "INVOKE", target = "Lnet/minecraft/resource/ResourceManager;getResource(Lnet/minecraft/util/Identifier;)Lnet/minecraft/resource/Resource;"), cancellable = true)
    public void loadModelFromJson(Identifier id, CallbackInfoReturnable<JsonUnbakedModel> cir) {
        if (!Reference.MOD_ID.equals(id.getNamespace())) return;

        JsonUnbakedModel model = ItemModelGenerator.MODELS.get(id);

        if (model != null) {
            cir.setReturnValue(model);
            cir.cancel();
        }
    }

}
