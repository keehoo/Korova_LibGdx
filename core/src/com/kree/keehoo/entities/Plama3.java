package com.kree.keehoo.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.kree.keehoo.MyGdxGame;

public class Plama3 extends Image {

    public static final String U_65_NORMAL = "u69_normal.png";

    public Plama3() {
        super(new Texture(U_65_NORMAL));

        this.setX(MyGdxGame.WIDTH * 0.08f);
        this.setY(MyGdxGame.HEIGHT * 0.29f);
        this.setZIndex(0);
    }


}
