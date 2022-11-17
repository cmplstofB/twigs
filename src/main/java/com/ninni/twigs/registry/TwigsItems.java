package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static com.ninni.twigs.Twigs.TAB;

@SuppressWarnings("unused")
public class TwigsItems {
    //logo
    public static final Item TWIGS = register("twigs", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC).fireproof()));

    //lamps
    public static final Item lAMP = register("lamp", new BlockItem(TwigsBlocks.LAMP, new FabricItemSettings().group(TAB)));
    public static final Item SOUL_LAMP = register("soul_lamp", new BlockItem(TwigsBlocks.SOUL_LAMP, new FabricItemSettings().group(TAB)));
    public static final Item CRIMSON_SHROOMLAMP = register("crimson_shroomlamp", new BlockItem(TwigsBlocks.CRIMSON_SHROOMLAMP, new FabricItemSettings().group(TAB)));
    public static final Item WARPED_SHROOMLAMP = register("warped_shroomlamp", new BlockItem(TwigsBlocks.WARPED_SHROOMLAMP, new FabricItemSettings().group(TAB)));

    //basalt blocks
    public static final Item POLISHED_BASALT_BRICKS = register("polished_basalt_bricks", new BlockItem(TwigsBlocks.POLISHED_BASALT_BRICKS, new FabricItemSettings().group(TAB)));
    public static final Item SMOOTH_BASALT_BRICKS = register("smooth_basalt_bricks", new BlockItem(TwigsBlocks.SMOOTH_BASALT_BRICKS, new FabricItemSettings().group(TAB)));
    public static final Item SMOOTH_BASALT_BRICK_STAIRS = register("smooth_basalt_brick_stairs", new BlockItem(TwigsBlocks.SMOOTH_BASALT_BRICK_STAIRS, new FabricItemSettings().group(TAB)));
    public static final Item SMOOTH_BASALT_BRICK_SLAB = register("smooth_basalt_brick_slab", new BlockItem(TwigsBlocks.SMOOTH_BASALT_BRICK_SLAB, new FabricItemSettings().group(TAB)));
    public static final Item SMOOTH_BASALT_BRICK_WALL = register("smooth_basalt_brick_wall", new BlockItem(TwigsBlocks.SMOOTH_BASALT_BRICK_WALL, new FabricItemSettings().group(TAB)));
    public static final Item CHISELED_SMOOTH_BASALT_BRICKS = register("chiseled_smooth_basalt_bricks", new BlockItem(TwigsBlocks.CHISELED_SMOOTH_BASALT_BRICKS, new FabricItemSettings().group(TAB)));

    //bricks
    public static final Item MIXED_BRICKS = register("mixed_bricks", new BlockItem(TwigsBlocks.MIXED_BRICKS, new FabricItemSettings().group(TAB)));
    public static final Item CHISELED_BRICKS = register("chiseled_bricks", new BlockItem(TwigsBlocks.CHISELED_BRICKS, new FabricItemSettings().group(TAB)));
    public static final Item CRACKED_BRICKS = register("cracked_bricks", new BlockItem(TwigsBlocks.CRACKED_BRICKS, new FabricItemSettings().group(TAB)));
    public static final Item MOSSY_BRICKS = register("mossy_bricks", new BlockItem(TwigsBlocks.MOSSY_BRICKS, new FabricItemSettings().group(TAB)));
    public static final Item MOSSY_BRICK_STAIRS = register("mossy_brick_stairs", new BlockItem(TwigsBlocks.MOSSY_BRICK_STAIRS, new FabricItemSettings().group(TAB)));
    public static final Item MOSSY_BRICK_SLAB = register("mossy_brick_slab", new BlockItem(TwigsBlocks.MOSSY_BRICK_SLAB, new FabricItemSettings().group(TAB)));
    public static final Item MOSSY_BRICK_WALL = register("mossy_brick_wall", new BlockItem(TwigsBlocks.MOSSY_BRICK_WALL, new FabricItemSettings().group(TAB)));

    //decorated blackstone bricks
    public static final Item TWISTING_POLISHED_BLACKSTONE_BRICKS = register("twisting_polished_blackstone_bricks", new BlockItem(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS, new FabricItemSettings().group(TAB)));
    public static final Item TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS = register("twisting_polished_blackstone_brick_stairs", new BlockItem(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS, new FabricItemSettings().group(TAB)));
    public static final Item TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB = register("twisting_polished_blackstone_brick_slab", new BlockItem(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB, new FabricItemSettings().group(TAB)));
    public static final Item TWISTING_POLISHED_BLACKSTONE_BRICK_WALL = register("twisting_polished_blackstone_brick_wall", new BlockItem(TwigsBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL, new FabricItemSettings().group(TAB)));
    public static final Item WEEPING_POLISHED_BLACKSTONE_BRICKS = register("weeping_polished_blackstone_bricks", new BlockItem(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS, new FabricItemSettings().group(TAB)));
    public static final Item WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS = register("weeping_polished_blackstone_brick_stairs", new BlockItem(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS, new FabricItemSettings().group(TAB)));
    public static final Item WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB = register("weeping_polished_blackstone_brick_slab", new BlockItem(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB, new FabricItemSettings().group(TAB)));
    public static final Item WEEPING_POLISHED_BLACKSTONE_BRICK_WALL = register("weeping_polished_blackstone_brick_wall", new BlockItem(TwigsBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL, new FabricItemSettings().group(TAB)));

    //misc
    //TODO recipe because pebbles are missing
    public static final Item ROCKY_DIRT = register("rocky_dirt", new BlockItem(TwigsBlocks.ROCKY_DIRT, new FabricItemSettings().group(TAB)));

    private static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(Twigs.MOD_ID, id), item);
    }
}
