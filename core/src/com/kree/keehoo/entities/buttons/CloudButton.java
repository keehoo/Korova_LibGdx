package com.kree.keehoo.entities.buttons;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.kree.keehoo.entities.Results.Constants;
import com.kree.keehoo.screens.GameplayScreen;

public class CloudButton extends AbstractIngredientButton {


    private static final int WIDTH = 126;
    private static final int HEIGHT = 69;
    private static final int Y = 500;
    static final int X = CloverButton.X - Constants.HORIZONTAL_PADDING - WIDTH;
    public final String value = "cloud";
    private static final String TEXTURE = "chmura_u91_normal.png";


    public CloudButton(final GameplayScreen gameplayScreen) {
        super(new SpriteDrawable(new Sprite(new Texture(TEXTURE))));
        this.gameplayScreen = gameplayScreen;
        setX(X);
        setY(Y);
        setDebug(Constants.DEBUG);
        setWidth(WIDTH);
        setHeight(HEIGHT);
        addButtonListener(gameplayScreen);
    }

    private void addButtonListener(final GameplayScreen gameplayScreen) {
        this.addListener(new ClickListener() {
                             @Override
                             public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                                 if (gameplayScreen.stomach.size() != 4) {
                                     gameplayScreen.stomach.addIngredient(value);

                                     //debug info
                                     System.out.println("Stomach size: " + gameplayScreen.stomach.size());
                                 }
                                 else {
                                     showFifthChamberNotInstalled();
                                 }
                                 return super.touchDown(event, x, y, pointer, button);
                             }
                         }
        );
    }

}
