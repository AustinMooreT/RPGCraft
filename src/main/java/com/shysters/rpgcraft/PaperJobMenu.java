package com.shysters.rpgcraft;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;

public class PaperJobMenu extends Screen {

    private final ResourceLocation FUBUKI_TEST = new ResourceLocation("rpgcraft","textures/fubuki_test.png");
    private final int FUBUKI_WIDTH = 256;
    private final int FUBUKI_HEIGHT = 256;
    
    public PaperJobMenu() {
	super(new StringTextComponent("Job Menu"));
    }

    /*
      TODO I don't know what half of this function does.
      My ide is complaining about deprecated methods, so that's something I'll have to look at.
      I just copied this from the death screen code.
    */
    public void render(MatrixStack ms, int i1, int i2, float f) {

	// Renders Fubuki?
	renderFubuki(ms);

	//Renders jobmenu text and dead red gradient
	this.fillGradient(ms, 0, 0, this.width, this.height, 1615855616, -1602211792);
	RenderSystem.pushMatrix();
	RenderSystem.scalef(2.0F, 2.0F, 2.0F);
	drawCenteredString(ms, this.font, this.title, this.width / 2 / 2, 30, 16777215);
	RenderSystem.popMatrix();
	
	super.render(ms, i1, i2, f);
    }

    private void renderFubuki(MatrixStack ms) {
	RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
	this.minecraft.getTextureManager().bind(this.FUBUKI_TEST);
	int i = (this.width - this.FUBUKI_WIDTH) / 2;
	int j = (this.height - this.FUBUKI_HEIGHT) / 2;
	this.blit(ms, i, j, 0, 0, this.FUBUKI_WIDTH, this.FUBUKI_HEIGHT);
    }

    //TODO figure out what d1, d2, and i are.
    public boolean mouseClicked(double d1, double d2, int i) {
	return super.mouseClicked(d1, d2, i);
    }
    
    public void tick() {
	super.tick();
    }

    
}
