package com.kree.keehoo.entities.Other;

import com.kree.keehoo.screens.GameplayScreen;

public class PlamaController {

    GameplayScreen gameplayScreen;
    public PlamaController(GameplayScreen gameplayScreen) {

        this.gameplayScreen = gameplayScreen;

    }

    public void updatePlamaStatus() {

        int level = gameplayScreen.stomach.size();

        switch (level) {
            case 1 :
                gameplayScreen.showPlama1();
                break;
            case 2:
                gameplayScreen.showPlama2();
                break;
            case 3:
                gameplayScreen.showPlama3();
                break;
            case 4:
                gameplayScreen.showPlama4();
                break;
        }
    }

    public void clearAllPlamas() {

        if (gameplayScreen.plama1 != null)  gameplayScreen.plama1.remove();
        if (gameplayScreen.plama2 != null)  gameplayScreen.plama2.remove();
        if (gameplayScreen.plama3 != null)  gameplayScreen.plama3.remove();
        if (gameplayScreen.plama4 != null)  gameplayScreen.plama4.remove();
    }
}
