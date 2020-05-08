package io.github.eikefabricio.snoguilds.api.guild.event;

import io.github.eikefabricio.snoguilds.api.guild.Guild;
import io.github.eikefabricio.snoguilds.api.guild.GuildPlayer;
import io.github.eikefabricio.snoguilds.api.guild.GuildRole;
import io.github.eikefabricio.snoguilds.api.guild.event.model.GuildEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GuildDemotePlayerEvent extends GuildEvent {

    private GuildPlayer guildPlayer;
    private GuildRole oldGuildRole;
    private GuildRole newGuildRole;
    private Guild guild;

}
