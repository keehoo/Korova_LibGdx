package com.kree.keehoo.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.kree.keehoo.MyGdxGame;


public class InstructionsMonit extends Image {

    public InstructionsMonit() {

        super(new Texture("u115_normal.png"));
        // setOrigin(MyGdxGame.WIDTH/2 - this.getWidth()/2, MyGdxGame.HEIGHT/2 - this.getHeight()/2);
        setX(MyGdxGame.WIDTH / 2 - this.getWidth() / 2);
        setY(MyGdxGame.HEIGHT / 2 - this.getHeight() / 2);
        setOnClickListener();
    }

    private void setOnClickListener() {
        this.addListener(new ClickListener() {

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                if (x > 441 && y > 360) {
                    System.out.println("Then you actually clicked the cross button");
                    clodeMonit();
                }
                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }

    private void clodeMonit() {
        this.remove();
    }
}
