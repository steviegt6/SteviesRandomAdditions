package io.github.steviegt6.steviesrandomadditions;

import io.github.steviegt6.steviesrandomadditions.client.loaders.EnchantmentLoader;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class SteviesRandomAdditions implements ModInitializer {
    public static final String ModID = "steviesrandomadditions";

    @Override
    public void onInitialize() {
        // Loader classes handle the initialization/loading of most of our content.
        // They also house finalized fields for whatever they're loading.
        EnchantmentLoader.Load();;
    }

    public static Identifier GetModIDIdentifier(String input) {
        return new Identifier(ModID, input);
    }

    public static String GetModIDString(String input) {
        return GetModIDIdentifier(input).toString();
    }
}
