package com.kree.keehoo.entities.buttons;

import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

public class OkButton extends Button {


    public OkButton(Drawable drawable) {
        super(drawable);
        this.setDebug(true);
        this.setX(400);
        this.setY(400);
        this.setWidth(50);
        this.setHeight(50);

    }
}
