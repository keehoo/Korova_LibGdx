package com.kree.keehoo.entities.buttons;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.kree.keehoo.entities.Results.Constants;
import com.kree.keehoo.screens.GameplayScreen;

public class GreenHandleButton extends Button {

    private static final int WIDTH = 127;
    private static final int HEIGHT = 119;
    private static final int Y = 200;
    private static final int X = 560;
    private static final String GREEN_HANDLE = "u57_normal.png";

    public GreenHandleButton(final GameplayScreen gps) {
        super(new SpriteDrawable(new Sprite(new Texture(GREEN_HANDLE))));
        setX(X);
        setY(Y);
        setDebug(Constants.DEBUG);
        setWidth(WIDTH);
        setHeight(HEIGHT);

        this.addListener(new ClickListener() {
                             @Override
                             public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                                 System.out.println("Should show arrow");
                                 gps.showArrowAndGloveButton();
                                 return super.touchDown(event, x, y, pointer, button);
                             }
                         }
        );
    }
}
