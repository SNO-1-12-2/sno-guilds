package io.github.eikefabricio.snoguilds.api.guild;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

@Getter
@Setter
public class GuildPlayer {

    private Player player;
    private Guild guild;
    private GuildRole guildRole;

    public static GuildPlayer at(Player player) {
        GuildPlayer guildPlayer = new GuildPlayer();



        return guildPlayer;
    }

    public void promote() {
        getGuild().promote(this);
    }

    public void demote() {
        getGuild().demote(this);
    }

    public void kick() {
        getGuild().kick(this);
    }

    public void exit() {
        getGuild().getPlayers().remove(this);
    }

}
