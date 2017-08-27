package com.kree.keehoo.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.kree.keehoo.MyGdxGame;
import com.kree.keehoo.entities.InstructionsMonit;
import com.kree.keehoo.entities.Other.Stomach;
import com.kree.keehoo.entities.Other.StomachComparator;
import com.kree.keehoo.entities.Plama1;
import com.kree.keehoo.entities.Results.Constants;
import com.kree.keehoo.entities.Results.Result;
import com.kree.keehoo.entities.buttons.*;

public class GameplayScreen extends AbstractScreen {

    public Stomach stomach;
    private StomachComparator stomachComparator;

    public GameplayScreen(MyGdxGame game) {
        super(game);
        init();
    }

    @Override
    protected void init() {
        System.out.println("Gameplayscreen init method");
        initStomach();
        initBackgroundImage();
        initButtons();
        showInstructions();
    }

    private void initStomach() {
        System.out.println("Initializing stomach");
        stomach = new Stomach();
        stomachComparator = new StomachComparator();
    }

    private void showInstructions() {
        InstructionsMonit instructionsMonit = new InstructionsMonit();
        stage.addActor(instructionsMonit);

    }

    private void initButtons() {
        initOkButton();
        initStrawberry();
        initBattery();
        initAtom();
        initChoco();
        initPepper();
        initSnow();
        initClover();
        initCloud();

    }

    private void initCloud() {
        stage.addActor(new CloudButton(this));
    }

    private void initClover() {
        stage.addActor(new CloverButton(this));
    }

    private void initSnow() {
        stage.addActor(new SnowButton(this));
    }

    private void initPepper() {
        stage.addActor(new PepperButton(this));
    }

    private void initChoco() {
        stage.addActor(new ChocolateButton(this));
    }

    private void initAtom() {
        stage.addActor(new AtomButton(this));
    }

    private void initBattery() {
        BatteryButton batteryButton = new BatteryButton(this);
        stage.addActor(batteryButton);
    }

    private void initStrawberry() {
        StrawberryButton strawberryButton = new StrawberryButton(this);
        stage.addActor(strawberryButton);
    }

    private void initBackgroundImage() {
        background = new Image(new Texture("u85_normal.png"));
        background.setTouchable(Touchable.disabled);
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
                switch (stomach.isStomachFull()) {
                    case 0:
                        System.out.println("Stomach is full, show result!");
                        if (stomachComparator.compare()) {
                            showResult();
                        }
                        break;
                    case 1:
                        System.out.println("Stomach not full");
                        showStomachNotFullYet();
                        break;
                    case 2:
                        System.out.println("Fifth chamber not installed");
                        fifthChamberNotInstalled();
                        break;
                }


                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }

    public void fifthChamberNotInstalled() {
        Result not_full_yet = new Result(Constants.FIFTH_CHAMBER_NOT_INSTALLED);
        stage.addActor(not_full_yet);
    }

    private void showStomachNotFullYet() {
        Result not_full_yet = new Result(Constants.STOMACH_NOT_FULL_YET);
        stage.addActor(not_full_yet);
    }

    private void showResult() {
        showGreenHandleButton();


    }

    private void showGreenHandleButton() {
        GreenHandleButton greenHandleButton = new GreenHandleButton(this);
        stage.addActor(greenHandleButton);
        greenHandleButton.setZIndex(0);

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

    public Stomach getStomach() {
        if (stomach != null) {
            return stomach;
        }
        return new Stomach();
    }

    public void showArrowAndGloveButton() {
        showArrow();
        showShakeMyHand();
        showInvisibleButtonThatActuallyShowsTheFinalResult();

    }

    private void showInvisibleButtonThatActuallyShowsTheFinalResult() {
        Button invisibleButton = new Button(new Button.ButtonStyle());
        invisibleButton.setHeight(100);
        invisibleButton.setWidth(100);
        invisibleButton.setPosition(MyGdxGame.WIDTH - 360, MyGdxGame.HEIGHT - 600);
        invisibleButton.setDebug(true);
        stage.addActor(invisibleButton);

        invisibleButton.addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("SHOW FINAL RESULT AND RESET THE GAME");
                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }

    private void showShakeMyHand() {
        ShakeMyHandImage shakeMyHandImage = new ShakeMyHandImage();
        stage.addActor(shakeMyHandImage);
    }

    private void showArrow() {
        System.out.println("Should add arrow to the stage");
        ArrowImage arrowImage = new ArrowImage();
        stage.addActor(arrowImage);
    }
}
