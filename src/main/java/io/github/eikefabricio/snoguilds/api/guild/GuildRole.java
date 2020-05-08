package io.github.eikefabricio.snoguilds.api.guild;

public enum GuildRole {

    RECRUIT(0),
    MEMBER(1),
    OFFICER(2),
    LEADER(3);

    private final int index;

    GuildRole(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static GuildRole getByIndex(int index) {
        for (GuildRole guildRole : values()) {
            if (guildRole.getIndex() == index) {
                return guildRole;
            }
        }

        return null;
    }

    public static GuildRole getNext(GuildRole guildRole) {
        GuildRole nextGuildRole = getByIndex(guildRole.getIndex() + 1);

        return nextGuildRole == null ? GuildRole.LEADER : nextGuildRole;
    }

    public GuildRole getNext() {
        return getNext(getByIndex(this.getIndex()));
    }

}
