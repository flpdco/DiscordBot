package music.flpd;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.EnumSet;

public class Main {

    private static final String token
            = "MTA1NTQ5MTA2MDM5NjIwODEzOA.G5I7tv.CYSwpT50yT0k2GO7F0BFu-2_M5kgmWOWi_uqVc";

    public static void main(String[] args) {
        JDABuilder builder = JDABuilder.createDefault(token);

        builder.setActivity(Activity.listening("Perfect H3art"));
        builder.addEventListeners(new DiscordEvents());

        builder .addEventListeners(new botcommands());
        builder.enableIntents(GatewayIntent.GUILD_MESSAGES);

        builder.build();
    }
}