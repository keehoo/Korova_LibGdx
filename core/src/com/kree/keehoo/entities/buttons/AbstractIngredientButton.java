package com.kree.keehoo.entities.buttons;

import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.kree.keehoo.entities.Other.PlamaController;
import com.kree.keehoo.entities.Results.Constants;
import com.kree.keehoo.screens.GameplayScreen;

public abstract class AbstractIngredientButton extends Button {


    protected GameplayScreen gameplayScreen;
    private PlamaController plamaController;

    public AbstractIngredientButton(Drawable drawable) {
        super(drawable);
        this.setDebug(Constants.DEBUG);
        if (plamaController != null) {
            plamaController = getNewPlamaController();
        }
    }


    void showFifthChamberNotInstalled() {
        gameplayScreen.fifthChamberNotInstalled();
        System.out.println("Stomach size" + gameplayScreen.stomach.size());

    }

    public PlamaController getNewPlamaController() {
        return new PlamaController(gameplayScreen);
    }

    public void updatePlamas() {
        if (plamaController == null) {
            plamaController = new PlamaController(gameplayScreen);
        }
        plamaController.updatePlamaStatus();
    }
}
