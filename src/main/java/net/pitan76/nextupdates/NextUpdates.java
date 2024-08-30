package net.pitan76.nextupdates;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.pitan76.mcpitanlib.api.registry.CompatRegistry;
import net.pitan76.mcpitanlib.api.util.IdentifierUtil;
import net.pitan76.nextupdates.block.Blocks;
import net.pitan76.nextupdates.item.Items;

public class NextUpdates implements ModInitializer {

    public static final String MOD_ID = "nextupdates";
    public static final String MOD_NAME = "Next Updates";

    public static CompatRegistry registry = CompatRegistry.create(MOD_ID);

    @Override
    public void onInitialize() {
        Blocks.init();
        Items.init();
    }

    public Identifier id(String path) {
        return IdentifierUtil.id(MOD_ID, path);
    }

    public Identifier vanillaId(String path) {
        return IdentifierUtil.id(path);
    }
}
