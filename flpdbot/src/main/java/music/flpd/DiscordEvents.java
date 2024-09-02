package music.flpd;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;

public class DiscordEvents implements EventListener {
    @Override
    public void onEvent(GenericEvent e) {

        if (e instanceof ReadyEvent){
            System.out.println("bot is ready");
        }
    }

}
