package plugin.plugin.items;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack scythe;

    public static void init() {
        createScythe();
    }

    private static void createScythe() {
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§dDragon Scythe");
        List<String> lore = new ArrayList<>();
        lore.add("§7Granted to the server as a gift from §kzkaizite");
        meta.setLore(lore);
        meta.isUnbreakable();
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        scythe = item;
    }
}