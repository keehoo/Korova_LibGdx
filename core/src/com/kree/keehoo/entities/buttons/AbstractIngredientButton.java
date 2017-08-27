package com.kree.keehoo.entities.buttons;

import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.kree.keehoo.screens.GameplayScreen;

public abstract class AbstractIngredientButton extends Button {


    protected GameplayScreen gameplayScreen;

    public AbstractIngredientButton(Drawable drawable)
    {
        super(drawable);

    }


    void showFifthChamberNotInstalled() {
        gameplayScreen.fifthChamberNotInstalled();
        System.out.println("Stomach size" + gameplayScreen.stomach.size());

    }
}
