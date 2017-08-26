package com.kree.keehoo.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.kree.keehoo.MyGdxGame;
import com.kree.keehoo.entities.Plama1;
import com.kree.keehoo.entities.Player;

public class GameplayScreen extends AbstractScreen {


    private Image background;

    private Player player;
    private Button playerButton;

    public GameplayScreen(MyGdxGame game) {
        super(game);
        init();
    }


    @Override
    protected void init() {
        System.out.println("Gameplayscreen init method");
        initBackgroundImage();

        initPlayer();
       initPlayerButton();

    }

    private void initBackgroundImage() {
        background = new Image(new Texture("u85_normal.png"));
        stage.addActor(background);
    }

    private void initPlayerButton() {
        System.out.println("Init player");
        playerButton = new Button(new Button.ButtonStyle());
        playerButton.setWidth(460);
        playerButton.setHeight(360);
        playerButton.setX(10);
        playerButton.setY(170);
        playerButton.setDebug(true);
        stage.addActor(playerButton);

        playerButton.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                player.reactOnClick();
                showPlama1();

                System.out.println("CLICK");
                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }

    private void showPlama1() {
        Plama1 plama1 = new Plama1();
        plama1.setX(MyGdxGame.WIDTH * 0.1f);
        plama1.setY(MyGdxGame.HEIGHT* 0.6f);
        stage.addActor(plama1);
        plama1.setZIndex(0);

    }

    private void initPlayer() {
        player = new Player();
        stage.addActor(player);
    }

    @Override
    public void render(float delta) {
        System.out.println("GamePlayScreen render()");
        super.render(delta);

        update();

        spriteBatch.begin();

        stage.draw();

        spriteBatch.end();
    }

    private void update() {
        System.out.println("Gameplayscreen update()");
        stage.act();

    }
}
