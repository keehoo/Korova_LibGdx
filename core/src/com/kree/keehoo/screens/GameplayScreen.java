package com.kree.keehoo.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.kree.keehoo.MyGdxGame;
import com.kree.keehoo.entities.InstructionsMonit;
import com.kree.keehoo.entities.Plama1;
import com.kree.keehoo.entities.buttons.BatteryButton;
import com.kree.keehoo.entities.buttons.OkButton;
import com.kree.keehoo.entities.buttons.StrawberryButton;

public class GameplayScreen extends AbstractScreen {

    public GameplayScreen(MyGdxGame game) {
        super(game);
        init();
    }

    @Override
    protected void init() {
        System.out.println("Gameplayscreen init method");
        initBackgroundImage();
        initButtons();
        showInstructions();
    }

    private void showInstructions() {
        InstructionsMonit instructionsMonit = new InstructionsMonit();
        stage.addActor(instructionsMonit);

    }

    private void initButtons() {
        initOkButton();
        initStrawberry();
        initBattery();

    }

    private void initBattery() {
        BatteryButton batteryButton = new BatteryButton();
        stage.addActor(batteryButton);
    }

    private void initStrawberry() {
        StrawberryButton strawberryButton = new StrawberryButton();
        stage.addActor(strawberryButton);
    }

    private void initBackgroundImage() {
        background = new Image(new Texture("u85_normal.png"));
        stage.addActor(background);
    }

    private void showPlama1() {
        Plama1 plama1 = new Plama1();
        stage.addActor(plama1);
        plama1.setZIndex(0);
    }


    private void initOkButton() {
        Sprite sprite = new Sprite(new Texture("u105_normal.png"));
        OkButton okButton = new OkButton(new SpriteDrawable(sprite));
        stage.addActor(okButton);
        okButton.addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("CLICKED OK BUTTON");
                System.out.println("X: " + x);
                System.out.println("Y: " + y);


                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }

    @Override
    public void render(float delta) {
        //System.out.println("GamePlayScreen render()");
        super.render(delta);
        update();
        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();
    }

    private void update() {
        //System.out.println("Gameplayscreen update()");
        stage.act();

    }
}
