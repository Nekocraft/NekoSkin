package com.nekocraft.skin.listener;

import com.nekocraft.skin.NekoSkin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.SpoutPlayer;

public class NekoSkinPlayerListener implements Listener {
	@EventHandler
	public void onPlayerTeleport(PlayerTeleportEvent event) {
		SpoutPlayer sPlayer = SpoutManager.getPlayer(event.getPlayer());
		setPlayerOptions(sPlayer);
	}

	@EventHandler
	public void onPlayerJoin(final PlayerJoinEvent event) {
		SpoutPlayer sPlayer = SpoutManager.getPlayer(event.getPlayer());
		setPlayerOptions(sPlayer);
	}

	public void setPlayerOptions(SpoutPlayer player) {
		if (player.getSkin() != NekoSkin.plugin.getSkinurl(player.getName()))
			player.setSkin(NekoSkin.plugin.getSkinurl(player.getName()));
		if (player.getCape() != NekoSkin.plugin.getCloakurl(player.getName()))
			player.setCape(NekoSkin.plugin.getCloakurl(player.getName()));
	}
}
