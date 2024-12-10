package org.z4te.reverseSword;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class ItemManager {
    public static ItemStack reverseDiamondSword;
    public static ItemStack reverseGoldenSword;
    public static ItemStack reverseIronSword;
    public static ItemStack reverseNetheriteSword;
    public static ItemStack reverseStoneSword;
    public static ItemStack reverseWoodenSword;

    public static void init() {
        createReverseDiamondSword();
        createReverseGoldenSword();
        createReverseIronSword();
        createReverseNetheriteSword();
        createReverseStoneSword();
        createReverseWoodenSword();
    }

    private static void createReverseDiamondSword() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.WHITE + "Reverse Diamond Sword");
        meta.getPersistentDataContainer().set(Keys.REVERSE_DIAMOND_SWORD, PersistentDataType.BOOLEAN, true);

        item.setItemMeta(meta);

        reverseDiamondSword = item;
    }

    private static void createReverseGoldenSword() {
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.WHITE + "Reverse Golden Sword");
        meta.getPersistentDataContainer().set(Keys.REVERSE_GOLDEN_SWORD, PersistentDataType.BOOLEAN, true);

        item.setItemMeta(meta);

        reverseGoldenSword = item;
    }

    private static void createReverseIronSword() {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.WHITE + "Reverse Iron Sword");
        meta.getPersistentDataContainer().set(Keys.REVERSE_IRON_SWORD, PersistentDataType.BOOLEAN, true);

        item.setItemMeta(meta);

        reverseIronSword = item;
    }

    private static void createReverseNetheriteSword() {
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.WHITE + "Reverse Netherite Sword");
        meta.getPersistentDataContainer().set(Keys.REVERSE_NETHERITE_SWORD, PersistentDataType.BOOLEAN, true);

        item.setItemMeta(meta);

        reverseNetheriteSword = item;
    }

    private static void createReverseStoneSword() {
        ItemStack item = new ItemStack(Material.STONE_SWORD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.WHITE + "Reverse Stone Sword");
        meta.getPersistentDataContainer().set(Keys.REVERSE_STONE_SWORD, PersistentDataType.BOOLEAN, true);

        item.setItemMeta(meta);

        reverseStoneSword = item;
    }

    private static void createReverseWoodenSword() {
        ItemStack item = new ItemStack(Material.WOODEN_SWORD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.WHITE + "Reverse Wooden Sword");
        meta.getPersistentDataContainer().set(Keys.REVERSE_WOODEN_SWORD, PersistentDataType.BOOLEAN, true);

        item.setItemMeta(meta);

        reverseWoodenSword = item;
    }

}
