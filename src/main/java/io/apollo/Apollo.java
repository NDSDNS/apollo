/*⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤
 Copyright (C) 2020-2021 developed by Icovid and Apollo Development Team

 Apollo.java is part of Apollo Client. 9/3/20, 8:54 PM

 Apollo.java can not be copied and/or distributed without the express
 permission of Icovid

 Contact: Icovid#3888 @ https://discord.com
 ⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤*/

package io.apollo;

import io.apollo.events.bus.EventBus;
import io.apollo.modulemanager.ModuleManager;
import lombok.Getter;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/** Main class for Apollo; holds all instances used through out client.
 * @author Icovid | Icovid#3888
 * @since 1.0.0 **/
public class Apollo {

    // Apollo information used for display title and credits info.
    public static final String NAME = "Apollo", VERSION = "b0.1", MCVERSION = "1.8.9";
    public static final String[] DEVELOPERS = {"Icovid", "Nora", "isXander"};

    public static final File apolloDirectory = new File(System.getProperty("user.dir") + "/" + NAME.toLowerCase());
    public static final File settingsFile = new File(System.getProperty("user.dir") + "/" + NAME.toLowerCase() + "/settings.json");

    // Public client instance used to retrieve any aspect of Apollo.
    public static final Apollo INSTANCE = new Apollo();
    public static final EventBus EVENT_BUS = new EventBus();
    @Getter private final ModuleManager moduleManager;
//    @Getter private final SettingManager settingManager; TODO: might make settings save in constructor.

    // Main constructor used to instantiate all aspects of Apollo.
    public Apollo() {
        if (!apolloDirectory.exists()) { try { apolloDirectory.mkdirs();  } catch (Exception ignored) { } log("Created Apollo Directory: " + apolloDirectory.getAbsolutePath()); }
        this.moduleManager = new ModuleManager(settingsFile);
//        this.settingManager = new SettingManager(settingsFile); TODO: might make settings save in constructor.
    }

    /** Log Apollo instance stats after construction. **/
    public void postInitialisation() { log("Apollo Initiation Finished with 0 Modules and 0 Settings! "); }

    /** Used to log Apollo messages to console.
     * @param message any string to be displayed in console. **/
    public static void log (String... message) { for (String out : message)  System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Apollo] " + out); }

}
