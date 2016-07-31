package webrsb;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.block.ChangeBlockEvent;
import org.spongepowered.api.event.filter.cause.First;
import org.spongepowered.api.event.item.inventory.UseItemStackEvent;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;

public class UseItemStackListener {
    @Listener
    public void PlayerUseItemEvent(UseItemStackEvent event, @First Player player) {
        player.sendMessage(Text.of(TextColors.GOLD, "You Use Item Stack"));
    }
}
