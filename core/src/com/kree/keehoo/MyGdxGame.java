package com.kree.keehoo;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.kree.keehoo.screens.SplashScreen;

public class MyGdxGame extends Game {

    public static final String title = "Game Title";

    public static final int WIDTH = 805 + 200;
    public static final int HEIGHT = 648;

    private boolean paused;

    private Music music_level1;

//

    // Texture img;

    @Override
    public void create() {
        this.setScreen(new SplashScreen(this));
        music_level1 = Gdx.audio.newMusic(Gdx.files.internal("funeral.ogg"));
        music_level1.setLooping(true);
        music_level1.play();
    }

    /*
    * getter and setters :
    *
    * */
    public boolean isPaused() {
        return paused;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }
}
