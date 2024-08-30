package net.pitan76.nextupdates.block.v119;

import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;
import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.block.CompatibleMaterial;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.util.IdentifierUtil;

import java.util.function.Supplier;

import static net.pitan76.nextupdates.NextUpdates.registry;

public class Blocks {

    public static RegistryResult<Block> OCHRE_FROGLIGHT;
    public static RegistryResult<Block> VERDANT_FROGLIGHT;
    public static RegistryResult<Block> PEARLESCENT_FROGLIGHT;
    public static RegistryResult<Block> FROGSPAWN;

    public static void init() {
        OCHRE_FROGLIGHT = register("ochre_froglight", () -> new PillarBlock(CompatibleBlockSettings.of(CompatibleMaterial.STONE).mapColor(MapColor.PALE_YELLOW).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.FROGLIGHT)));
        VERDANT_FROGLIGHT = register("verdant_froglight", () -> new PillarBlock(CompatibleBlockSettings.of(CompatibleMaterial.STONE).mapColor(MapColor.LICHEN_GREEN).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.FROGLIGHT)));
        PEARLESCENT_FROGLIGHT = register("pearlescent_froglight", () -> new PillarBlock(CompatibleBlockSettings.of(CompatibleMaterial.STONE).mapColor(MapColor.PINK).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.FROGLIGHT)));
        FROGSPAWN = register("frogspawn", () -> new FrogspawnBlock(CompatibleBlockSettings.of(CompatibleMaterial.STONE).mapColor(MapColor.WATER_BLUE).breakInstantly().nonOpaque().noCollision().sounds(BlockSoundGroup.FROGSPAWN).pistonBehavior(PistonBehavior.DESTROY)));
    }
    
    public static RegistryResult<Block> register(String id, Supplier<Block> block) {
        return registry.registerBlock(IdentifierUtil.id(id), block);
    }

}
