package com.kree.keehoo.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.kree.keehoo.MyGdxGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();


        config.title = MyGdxGame.title;
        config.width = MyGdxGame.WIDTH;
        config.height = MyGdxGame.HEIGHT;
        config.resizable = false;

        new LwjglApplication(new MyGdxGame(), config);
    }
}
