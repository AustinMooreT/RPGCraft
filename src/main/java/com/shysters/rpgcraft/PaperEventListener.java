package com.shysters.rpgcraft;

import net.minecraft.item.Items;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PaperEventListener {

    private Runnable reaction;

    public PaperEventListener(Runnable reaction) {
	this.reaction = reaction;
    }

    @SubscribeEvent
    public void rightClickListener(PlayerInteractEvent pie) {
	//TODO add a check to make sure we are on the client side
	if(pie.getItemStack().getItem().equals(Items.PAPER)) {
	    reaction.run();
	}
    }
}
