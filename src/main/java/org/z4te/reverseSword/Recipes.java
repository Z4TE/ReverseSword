package org.z4te.reverseSword;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

public class Recipes {

    public static void init(){
        createRecipeReverseDiamondSword();
        createRecipeReverseGoldenSword();
        createRecipeReverseIronSword();
        createRecipeReverseNetheriteSword();
        createRecipeReverseStoneSword();
        createRecipeReverseWoodenSword();
    }

    private static void createRecipeReverseDiamondSword() {
        ShapedRecipe recipe = new ShapedRecipe(Keys.REVERSE_DIAMOND_SWORD, ItemManager.reverseDiamondSword);
        recipe.shape("S","D","D");
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('S', Material.STICK);

        Bukkit.addRecipe(recipe);
    }

    private static void createRecipeReverseGoldenSword() {
        ShapedRecipe recipe = new ShapedRecipe(Keys.REVERSE_GOLDEN_SWORD, ItemManager.reverseGoldenSword);
        recipe.shape("S","D","D");
        recipe.setIngredient('D', Material.GOLD_INGOT);
        recipe.setIngredient('S', Material.STICK);

        Bukkit.addRecipe(recipe);
    }

    private static void createRecipeReverseIronSword() {
        ShapedRecipe recipe = new ShapedRecipe(Keys.REVERSE_IRON_SWORD, ItemManager.reverseIronSword);
        recipe.shape("S","D","D");
        recipe.setIngredient('D', Material.IRON_INGOT);
        recipe.setIngredient('S', Material.STICK);

        Bukkit.addRecipe(recipe);
    }

    private static void createRecipeReverseNetheriteSword() {
        ShapedRecipe recipe = new ShapedRecipe(Keys.REVERSE_NETHERITE_SWORD, ItemManager.reverseNetheriteSword);
        recipe.shape("S","D","D");
        recipe.setIngredient('D', Material.NETHERITE_INGOT);
        recipe.setIngredient('S', Material.STICK);

        Bukkit.addRecipe(recipe);
    }

    private static void createRecipeReverseStoneSword() {

        RecipeChoice.MaterialChoice cobblestones = new RecipeChoice.MaterialChoice(
                Material.COBBLESTONE,
                Material.COBBLED_DEEPSLATE,
                Material.BLACKSTONE
        );

        ShapedRecipe recipe = new ShapedRecipe(Keys.REVERSE_STONE_SWORD, ItemManager.reverseStoneSword);
        recipe.shape("S","D","D");
        recipe.setIngredient('D', cobblestones);
        recipe.setIngredient('S', Material.STICK);

        Bukkit.addRecipe(recipe);
    }

    private static void createRecipeReverseWoodenSword() {

        // 将来に木の種類が増えたらここに書き足さないといけないの？は～つっかえ
        RecipeChoice.MaterialChoice planks = new RecipeChoice.MaterialChoice(
                Material.ACACIA_PLANKS,
                Material.BAMBOO_PLANKS,
                Material.BIRCH_PLANKS,
                Material.CHERRY_PLANKS,
                Material.CRIMSON_PLANKS,
                Material.DARK_OAK_PLANKS,
                Material.JUNGLE_PLANKS,
                Material.MANGROVE_PLANKS,
                Material.OAK_PLANKS,
                Material.PALE_OAK_PLANKS,
                Material.SPRUCE_PLANKS,
                Material.WARPED_PLANKS
        );

        ShapedRecipe recipe = new ShapedRecipe(Keys.REVERSE_WOODEN_SWORD, ItemManager.reverseWoodenSword);
        recipe.shape("S","D","D");
        recipe.setIngredient('D', planks);
        recipe.setIngredient('S', Material.STICK);

        Bukkit.addRecipe(recipe);
    }


}
