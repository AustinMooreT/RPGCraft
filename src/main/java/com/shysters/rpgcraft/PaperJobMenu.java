package com.shysters.rpgcraft;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;

public class PaperJobMenu extends Screen {

    private final ResourceLocation BLANK_CARD = new ResourceLocation("rpgcraft","textures/blank_card_128x128.png");
    
    public PaperJobMenu() {
	super(new StringTextComponent("Job Menu"));
    }

    /*
      TODO I don't know what half of this function does.
      My ide is complaining about deprecated methods, so that's something I'll have to look at.
      I just copied this from the death screen code.
    */
    public void render(MatrixStack ms, int i1, int i2, float f) {
	//Renders jobmenu text and dead red gradient
	this.fillGradient(ms, 0, 0, this.width, this.height, 2130706433, 2130706433);
	renderFubuki(ms, 150, 100);
	drawCenteredString(ms, this.font, this.title, this.width / 2, this.height / 2, 16777215);
	super.render(ms, i1, i2, f);
    }

    private void renderFubuki(MatrixStack ms, int x, int y) {
	RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
	this.minecraft.getTextureManager().bind(this.BLANK_CARD);
	RenderSystem.pushMatrix();
	//float xscale = ((float)x)/256.0F;
	//float yscale = ((float)y)/256.0F;
	//RenderSystem.scalef(xscale, yscale, 0);
	int i = (this.width - 128) / 2;
	int j = (this.height - 128) / 2;
	this.blit(ms, i, j, 0, 0, 128, 128);
	RenderSystem.popMatrix();
    }

    //TODO figure out what d1, d2, and i are.
    public boolean mouseClicked(double d1, double d2, int i) {
	return super.mouseClicked(d1, d2, i);
    }
    
    public void tick() {
	super.tick();
    }

    
}
