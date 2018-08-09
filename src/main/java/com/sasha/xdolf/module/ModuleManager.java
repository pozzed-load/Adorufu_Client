package com.sasha.xdolf.module;

import com.sasha.eventsys.SimpleEventHandler;
import com.sasha.eventsys.SimpleListener;
import com.sasha.xdolf.misc.ModuleState;
import com.sasha.xdolf.events.XdolfModuleToggleEvent;

import java.util.ArrayList;

/**
 * Created by Sasha on 08/08/2018 at 11:52 AM
 **/
public class ModuleManager implements SimpleListener {

    public static ArrayList<XdolfModule> moduleRegistry = new ArrayList<>();

    @SimpleEventHandler
    public void onModToggle(XdolfModuleToggleEvent e){
        if (e.getToggleState() == ModuleState.ENABLE){
            e.getToggledModule().onEnable();
            if (!e.getToggledModule().isRenderable()) {
                XdolfModule.displayList.add(e.getToggledModule());
            }
            return;
        }
        e.getToggledModule().onDisable();
        if (!e.getToggledModule().isRenderable()){
            XdolfModule.displayList.remove(e.getToggledModule());
        }
    }

    public static XdolfModule getModuleByName(String key) {
        for (XdolfModule m : moduleRegistry) {
            if (m.getModuleName().equalsIgnoreCase(key)) return m;
        }
        return null;
    }

    public static void tickModules(){
        moduleRegistry.forEach(XdolfModule::onTick);
    }

}