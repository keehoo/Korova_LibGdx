package com.kree.keehoo.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.kree.keehoo.MyGdxGame;

public class Plama2 extends Image {

    public static final String U_65_NORMAL = "u67_normal.png";

    public Plama2() {
        super(new Texture(U_65_NORMAL));

        this.setX(MyGdxGame.WIDTH * 0.1f);
        this.setY(MyGdxGame.HEIGHT * 0.6f);
        this.setZIndex(0);
    }


}