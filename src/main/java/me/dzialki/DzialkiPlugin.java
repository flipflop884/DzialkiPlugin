
package me.dzialki;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class DzialkiPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("DzialkiPlugin uruchomiony!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("dzialka")) {

            if (args.length == 0) {
                sender.sendMessage("§cUżycie: /dzialka oplata <kwota>");
                return true;
            }

            if (args[0].equalsIgnoreCase("oplata")) {

                if (args.length < 2) {
                    sender.sendMessage("§cPodaj kwotę!");
                    return true;
                }

                try {
                    int kwota = Integer.parseInt(args[1]);
                    sender.sendMessage("§aUstawiono opłatę działki na §e" + kwota);
                } catch (NumberFormatException e) {
                    sender.sendMessage("§cTo nie jest liczba!");
                }
                return true;
            }
        }
        return false;
    }
}
