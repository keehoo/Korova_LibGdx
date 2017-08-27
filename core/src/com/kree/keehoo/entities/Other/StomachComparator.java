package com.kree.keehoo.entities.Other;

import com.kree.keehoo.entities.Results.Constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StomachComparator {

    public static String result;
    private ArrayList skinnyMilk;
    private ArrayList<String> cream;
    private ArrayList<String> fatMilk;
    private ArrayList<String> electricMilk;
    private ArrayList<String> hotMilk;
    private ArrayList<String> cocoa;
    private ArrayList<String> hotChoco;
    private ArrayList<String> actec;
    private ArrayList<String> milkShake;
    private ArrayList<String> chocoShake;
    private ArrayList<String> strawberryShake;
    private ArrayList<String> grog;
    private ArrayList<String> nuka;
    private ArrayList<String> beach;
    private ArrayList<String> velocet;

    public StomachComparator() {

    }

    public boolean compare(Stomach stomach) {

        return checkIfStomachContentIsAnyOftheResult(stomach.getStomachConent());


    }

    private void getSortedResultsCollections() {
        skinnyMilk = new ArrayList<String>(Constants.skinny_milk);
        Collections.sort(skinnyMilk);
        fatMilk = new ArrayList<String>(Constants.fat_milk);
        Collections.sort(fatMilk);
        cream = new ArrayList<String>(Constants.cream);
        Collections.sort(cream);
        electricMilk = new ArrayList<String>(Constants.getElectric_milk);
        Collections.sort(electricMilk);
        hotMilk = new ArrayList<String>(Constants.hot_milk);
        Collections.sort(hotMilk);
        cocoa = new ArrayList<String>(Constants.cocoa);
        Collections.sort(cocoa);
        hotChoco = new ArrayList<String>(Constants.getHot_chocolate);
        Collections.sort(hotChoco);
        actec = new ArrayList<String>(Constants.aztec_chocolate);
        Collections.sort(actec);
        milkShake = new ArrayList<String>(Constants.milk_shake);
        Collections.sort(milkShake);
        chocoShake = new ArrayList<String>(Constants.choco_milk_shake);
        Collections.sort(chocoShake);
        strawberryShake = new ArrayList<String>(Constants.strawberry_milkshake);
        Collections.sort(strawberryShake);
        grog = new ArrayList<String>(Constants.grog);
        Collections.sort(grog);
        nuka = new ArrayList<String>(Constants.nuka_cola);
        Collections.sort(nuka);
        beach = new ArrayList<String>(Constants.on_the_beach);
        Collections.sort(beach);
        velocet = new ArrayList<String>(Constants.molloko_velocet);
        Collections.sort(velocet);


    }

    private boolean checkIfStomachContentIsAnyOftheResult(List<String> stomachContent) {
        Collections.sort(stomachContent);
        getSortedResultsCollections();

        if (stomachContent.get(0).equals(skinnyMilk.get(0))
                && stomachContent.get(1).equals(skinnyMilk.get(1))
                && stomachContent.get(2).equals(skinnyMilk.get(2))
                && stomachContent.get(3).equals(skinnyMilk.get(3))) {
            result = Constants.SKINNY_MILK;
            return true;
        }

        if (stomachContent.get(0).equals(fatMilk.get(0))
                && stomachContent.get(1).equals(fatMilk.get(1))
                && stomachContent.get(2).equals(fatMilk.get(2))
                && stomachContent.get(3).equals(fatMilk.get(3))) {
            result = Constants.FAT_MILK;
            return true;
        }

        if (stomachContent.get(0).equals(cream.get(0))
                && stomachContent.get(1).equals(cream.get(1))
                && stomachContent.get(2).equals(cream.get(2))
                && stomachContent.get(3).equals(cream.get(3))) {
            result = Constants.CREAM;
            return true;
        }

        if (stomachContent.get(0).equals(electricMilk.get(0))
                && stomachContent.get(1).equals(electricMilk.get(1))
                && stomachContent.get(2).equals(electricMilk.get(2))
                && stomachContent.get(3).equals(electricMilk.get(3))) {
            result = Constants.ELECTRIC_MILK;
            return true;
        }

        if (stomachContent.get(0).equals(hotMilk.get(0))
                && stomachContent.get(1).equals(hotMilk.get(1))
                && stomachContent.get(2).equals(hotMilk.get(2))
                && stomachContent.get(3).equals(hotMilk.get(3))) {
            result = Constants.HOT_MILK;
            return true;
        }

        if (stomachContent.get(0).equals(cocoa.get(0))
                && stomachContent.get(1).equals(cocoa.get(1))
                && stomachContent.get(2).equals(cocoa.get(2))
                && stomachContent.get(3).equals(cocoa.get(3))) {
            result = Constants.COCOA;
            return true;
        }


        if (stomachContent.get(0).equals(hotChoco.get(0))
                && stomachContent.get(1).equals(hotChoco.get(1))
                && stomachContent.get(2).equals(hotChoco.get(2))
                && stomachContent.get(3).equals(hotChoco.get(3))) {
            result = Constants.HOT_CHOCO;
            return true;
        }

        if (stomachContent.get(0).equals(actec.get(0))
                && stomachContent.get(1).equals(actec.get(1))
                && stomachContent.get(2).equals(actec.get(2))
                && stomachContent.get(3).equals(actec.get(3))) {
            result = Constants.AZTEC;
            return true;
        }


        if (stomachContent.get(0).equals(milkShake.get(0))
                && stomachContent.get(1).equals(milkShake.get(1))
                && stomachContent.get(2).equals(milkShake.get(2))
                && stomachContent.get(3).equals(milkShake.get(3))) {
            result = Constants.MILK_SHAKE;
            return true;
        }


        if (stomachContent.get(0).equals(chocoShake.get(0))
                && stomachContent.get(1).equals(chocoShake.get(1))
                && stomachContent.get(2).equals(chocoShake.get(2))
                && stomachContent.get(3).equals(chocoShake.get(3))) {
            result = Constants.CHOCO_SHAKE;
            return true;
        }


        if (stomachContent.get(0).equals(strawberryShake.get(0))
                && stomachContent.get(1).equals(strawberryShake.get(1))
                && stomachContent.get(2).equals(strawberryShake.get(2))
                && stomachContent.get(3).equals(strawberryShake.get(3))) {
            result = Constants.STRAWBERRY_SHAKE;
            return true;
        }

        if (stomachContent.get(0).equals(grog.get(0))
                && stomachContent.get(1).equals(grog.get(1))
                && stomachContent.get(2).equals(grog.get(2))
                && stomachContent.get(3).equals(grog.get(3))) {
            result = Constants.GROG;
            return true;
        }

        if (stomachContent.get(0).equals(nuka.get(0))
                && stomachContent.get(1).equals(nuka.get(1))
                && stomachContent.get(2).equals(nuka.get(2))
                && stomachContent.get(3).equals(nuka.get(3))) {
            result = Constants.NUKA;
            return true;
        }
        if (stomachContent.get(0).equals(beach.get(0))
                && stomachContent.get(1).equals(beach.get(1))
                && stomachContent.get(2).equals(beach.get(2))
                && stomachContent.get(3).equals(beach.get(3))) {
            result = Constants.BEACH;
            return true;
        }
        if (stomachContent.get(0).equals(velocet.get(0))
                && stomachContent.get(1).equals(velocet.get(1))
                && stomachContent.get(2).equals(velocet.get(2))
                && stomachContent.get(3).equals(velocet.get(3))) {
            result = Constants.VELOCET;
            return true;
        }

        return false;





    }
}
