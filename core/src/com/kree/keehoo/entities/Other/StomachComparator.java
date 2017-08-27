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

        stomach._debugPrint();
        System.out.println("skinny milk : \n\n");
        for (String s: Constants.skinny_milk) {
            System.out.println(s);
        }

        List<String> actualStomachContent = stomach.getStomachConent();
        Collections.sort(actualStomachContent);

        for (int i = 0; i < actualStomachContent.size(); i++) {
            getSortedResultsCollections();
            if (actualStomachContent.get(i).equals(skinnyMilk.get(i))) {
                System.out.println(stomach.getStomachConent().get(i) + "  ==  "+ skinnyMilk.get(i));
                result = Constants.SKINNY_MILK;
                return true;
            }
            if (actualStomachContent.get(i).equals(fatMilk.get(i))) {
                System.out.println(stomach.getStomachConent().get(i) + "  ==  "+ fatMilk.get(i));

                result = Constants.FAT_MILK;
                return true;
            }
            if (actualStomachContent.get(i).equals(cream.get(i))) {
                System.out.println(stomach.getStomachConent().get(i) + "  ==  "+ cream.get(i));
                result = Constants.CREAM;
                return true;
            }
        }
        return false;
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

    private ArrayList<String> getsortedList(ArrayList<String> list) {
        Collections.sort(list);
        return list;
    }

    private String checkIfStomachContentIsAnyOftheResult(List<String> stomachContent) {
        Collections.sort(stomachContent);
        getSortedResultsCollections();

        if (stomachContent.get(0).equals(skinnyMilk.get(0))
                && stomachContent.get(1).equals(skinnyMilk.get(1))
                && stomachContent.get(2).equals(skinnyMilk.get(2))
                && stomachContent.get(3).equals(skinnyMilk.get(3))) {
            result = Constants.SKINNY_MILK;
            return Constants.SKINNY_MILK;
        }
        return null;





    }
}
