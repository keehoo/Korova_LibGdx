package com.kree.keehoo.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;
import com.kree.keehoo.MyGdxGame;

public class SplashScreen extends AbstractScreen {

    private static final float DELAY_SECONDS = 0.5f;
    private Texture splashImage;

    public SplashScreen(final MyGdxGame game) {
        super(game);
        init();
        System.out.println("Splashscreen constructor");

        Timer.schedule(new Task() {
            @Override
            public void run() {
                System.out.println("Po 1 sekundzie pojawia sie game play screen");
                game.setScreen(new GameplayScreen(game));
            }
        }, DELAY_SECONDS);
    }

    @Override
    protected void init() {
        //TODO: implement better assets loading when game grows
        splashImage = new Texture("u118_normal.png");
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        spriteBatch.begin();

        spriteBatch.draw(splashImage, MyGdxGame.WIDTH / 2 - splashImage.getWidth() / 2, MyGdxGame.HEIGHT / 2 - splashImage.getHeight() / 2);

        spriteBatch.end();
    }
}
