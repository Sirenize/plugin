package plugin.plugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import plugin.plugin.items.ItemManager;

public class commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command!");
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("givescythe")) {
            player.getInventory().addItem(ItemManager.scythe);
        }

        return true;
    }
}
