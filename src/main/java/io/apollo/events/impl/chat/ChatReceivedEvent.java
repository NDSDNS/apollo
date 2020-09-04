/*⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤
 Copyright (C) 2020-2021 developed by Icovid and Apollo Development Team

 ChatReceivedEvent.java is part of Apollo Client. 9/3/20, 8:54 PM

 ChatReceivedEvent.java can not be copied and/or distributed without the express
 permission of Icovid

 Contact: Icovid#3888 @ https://discord.com
 ⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤*/

package io.apollo.events.impl.chat;

import io.apollo.events.CancelableEvent;
import lombok.Getter;
import net.minecraft.util.IChatComponent;

/** Fired when the client receives a chat packet and it is not an action bar packet.
 * <p>If you want the action bar, see the {@link ActionBarEvent} class.</p>
 * @author Nora Cos | Nora#0001
 * @since 1.0.0 **/
public class ChatReceivedEvent extends CancelableEvent {

    @Getter private final IChatComponent chatComponent;

    /** Fired when the client receives a chat packet and it is not an action bar packet.
     * @param chatComponent chat component from the packet **/
    public ChatReceivedEvent(IChatComponent chatComponent) {
        this.chatComponent = chatComponent;
    }
}
