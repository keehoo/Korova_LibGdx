package com.kree.keehoo;

import com.badlogic.gdx.Game;
import com.kree.keehoo.screens.SplashScreen;

public class MyGdxGame extends Game {

    public static final String title = "Game Title";

    public static final int WIDTH = 805;
    public static final int HEIGHT = 648;

    private boolean paused;

//

    // Texture img;

    @Override
    public void create() {
        this.setScreen(new SplashScreen(this));
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
