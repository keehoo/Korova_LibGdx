package com.kree.keehoo.entities.buttons;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;

public class StrawberryButton extends AbstractIngredientButton {


    private static final int WIDTH = 58;
    private static final int HEIGHT = 56;
    private static final int Y = 500;
    private static final int X = 500;
    public final String value = "strawberry";
    private static final String STRAWBERRY = "truskawka_u99_normal.png";

    public StrawberryButton() {
        super(new SpriteDrawable(new Sprite(new Texture(STRAWBERRY))));
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

    public void removeListener() {
        this.clearListeners();
    }
}
