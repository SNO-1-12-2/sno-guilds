package io.github.eikefabricio.snoguilds.api.guild;

import io.github.eikefabricio.snoguilds.api.guild.event.GuildPromotePlayerEvent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class Guild {

    private String name;
    private Set<GuildPlayer> players;
    private Player owner;
    private int xp;
    private int level;
    private int maxMembers;

    public void promote(GuildPlayer guildPlayer) {
        GuildPromotePlayerEvent guildPromotePlayerEvent = new GuildPromotePlayerEvent(
            guildPlayer,
            guildPlayer.getGuildRole(),
            guildPlayer.getGuildRole().getNext(),
    this
        );

        Bukkit.getPluginManager().callEvent(guildPromotePlayerEvent);

        if (!guildPromotePlayerEvent.isCancelled()) {
            guildPlayer.setGuildRole(guildPlayer.getGuildRole().getNext());
        }

    }

    public void demote(GuildPlayer guildPlayer) {

    }

    public void kick(GuildPlayer guildPlayer) {

    }

}
