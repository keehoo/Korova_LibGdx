package com.kree.keehoo.entities.Other;

import java.util.ArrayList;
import java.util.List;

public class Stomach {

    private List<String> stomach;

    public Stomach() {
        stomach = new ArrayList<String>();
    }

    public int isStomachFull() {
        switch (stomach.size()) {
            case 4:
                return Fullness.FULL.ordinal();
            case 0:
            case 1:
            case 2:
            case 3:
                return Fullness.NOT_FULL.ordinal();

            default:
                return Fullness.TOO_MUCH.ordinal();

        }
    }

    public boolean addIngredient(String ingredient) {
        return stomach.add(ingredient);
    }

    public int size() {
        return stomach.size();
    }






    public enum Fullness {


        FULL,
        NOT_FULL,
        TOO_MUCH


    }

}
