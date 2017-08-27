package com.kree.keehoo.entities.buttons;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.kree.keehoo.MyGdxGame;

public class ShakeMyHandImage extends Image {

    private static Texture arrow = new Texture("shake_image_u109_normal.png");

    private static final int WIDTH = 96;
    private static final int HEIGHT = 17;
    private static final int Y = MyGdxGame.HEIGHT - 550 - HEIGHT;
    private static final int X = MyGdxGame.WIDTH - 250;


    public ShakeMyHandImage() {
        super(arrow);
        this.setOrigin(WIDTH/2, HEIGHT/2);
        this.setSize(WIDTH, HEIGHT);
        this.setPosition(X, Y);
    }
}
