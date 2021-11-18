package club.therepo.modules;

import club.therepo.util.XMaterial;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class InvSeeModule extends Module{

    public InvSeeModule() {
        super(false, true, "invsee", XMaterial.CHEST);
    }

    @Override
    public boolean execute(Player player, Player other, World world) {
        if(!super.execute(player, other, world)) {
            return false;
        }
        if(player.getName().equals(other.getName())) return false;
        player.openInventory(other.getInventory());
        return true;
    }
}