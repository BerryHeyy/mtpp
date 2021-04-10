package io.github.berryheyy.mtpp.data;

import io.github.berryheyy.mtpp.Reference;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.util.Identifier;

import java.util.Dictionary;
import java.util.Hashtable;

public class ItemModelGenerator {
    public static Dictionary<Identifier, JsonUnbakedModel> MODELS = new Hashtable<>();

    public static void registerItemModel(String itemName) {
        JsonUnbakedModel model = JsonUnbakedModel.deserialize(
                "{\n" +
                        "  \"parent\": \"item/generated\",\n" +
                        "  \"textures\": {\n" +
                        "     \"layer0\": \"" + Reference.MOD_ID + ":item/" + itemName + "\"\n" +
                        "  }\n" +
                        "}"
        );

        model.id = new Identifier(Reference.MOD_ID, "item/" + itemName).toString();

        MODELS.put(new Identifier(Reference.MOD_ID, "item/" + itemName), model);
    }

    public static void registerItemModelHandheld(String itemName) {
        JsonUnbakedModel model = JsonUnbakedModel.deserialize(
                "{\n" +
                        "  \"parent\": \"minecraft:item/handheld\",\n" +
                        "  \"textures\": {\n" +
                        "     \"layer0\": \"" + Reference.MOD_ID + ":item/" + itemName + "\"\n" +
                        "  }\n" +
                        "}"
        );

        model.id = new Identifier(Reference.MOD_ID, "item/" + itemName).toString();

        MODELS.put(new Identifier(Reference.MOD_ID, "item/" + itemName), model);
    }

    public static void registerBlockItemModel(String blockName) {
        JsonUnbakedModel model = JsonUnbakedModel.deserialize(
                "{\n" +
                        "  \"parent\": \"" + Reference.MOD_ID + ":block/" + blockName + "\"\n" +
                        "}"
        );

        model.id = new Identifier(Reference.MOD_ID, "item/" + blockName).toString();

        MODELS.put(new Identifier(Reference.MOD_ID, "item/" + blockName), model);
    }

}
