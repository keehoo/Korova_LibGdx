package com.kree.keehoo.entities.buttons;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.kree.keehoo.MyGdxGame;
import com.sun.org.apache.bcel.internal.generic.GETFIELD;

public class ArrowImage extends Image{

    private static Texture arrow = new Texture("u112_normal.png");

    private static final int WIDTH = 104;
    private static final int HEIGHT = 20;
    private static final int Y = MyGdxGame.HEIGHT - 600;
    private static final int X = MyGdxGame.WIDTH - 250;


    public ArrowImage() {
        super(arrow);
        this.setOrigin(WIDTH/2, HEIGHT/2);
        this.setSize(WIDTH, HEIGHT);
        this.setPosition(X, Y);
    }

}


