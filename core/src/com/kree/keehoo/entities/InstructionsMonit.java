package com.kree.keehoo.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;


public class InstructionsMonit extends Actor {

    Texture image;
    Button button;

    public InstructionsMonit(Stage stage) {

        image = new Texture("u115_normal.png");
        button = new Button(new Button.ButtonStyle());
        button.setDebug(true);
//        button.setX(400);
//        button.setY(500);
//        button.setHeight(300);
//        button.setWidth(300);
        button.addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("CLICKED Embedded BUTTON, this should happen only one");
                return super.touchDown(event, x, y, pointer, button);
            }
        });


    }

    @Override
    public void draw(Batch batch, float alpha){
      //  batch.begin();
        batch.draw(image,0,0);
        button.draw(batch, alpha);
      //  batch.end();
    }
}
