package com.shysters.rpgcraft;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("rpgcraft")
public class RPGCraft {
    
    /**
       This is the entry point for for the whole rpgcraft mod.
       All event registration should happen in some form or another here.
    **/
    public RPGCraft() {
	PaperEventListener p = new PaperEventListener(() -> {
		Minecraft.getInstance().setScreen(new PaperJobMenu());
	});
	MinecraftForge.EVENT_BUS.register(p);
    }

}
