package com.kree.keehoo.entities.buttons;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.kree.keehoo.MyGdxGame;

public class BatteryButton extends AbstractIngredientButton {

    private static final int WIDTH = 62;
    private static final int HEIGHT = 55;
    private static final int Y = 500;
    private static final int X = MyGdxGame.WIDTH - 100;
    public final String value = "battery";
    private static final String BATTERY = "bateryjka_u103_normal.png";

    public BatteryButton() {
        super(new SpriteDrawable(new Sprite(new Texture(BATTERY))));

        setX(X);
        setY(Y);
        setDebug(true);
        setWidth(WIDTH);
        setHeight(HEIGHT);

        this.addListener(new ClickListener() {
                             @Override
                             public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                                 System.out.println("CLICKED OK STRAWBERRY");
                                 System.out.println("X: " + x);
                                 System.out.println("Y: " + y);
                                 return super.touchDown(event, x, y, pointer, button);
                             }
                         }


        );

    }
}
