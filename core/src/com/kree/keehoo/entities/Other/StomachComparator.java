package com.kree.keehoo.entities.Other;

import com.kree.keehoo.entities.Results.Constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StomachComparator {

    public static String result;

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
            ArrayList skinnyMilk = new ArrayList<String>(Constants.skinny_milk);
            Collections.sort(skinnyMilk);
            if (actualStomachContent.get(i).equals(skinnyMilk.get(i))) {
                result = Constants.SKINNY_MILK;
                return true;
            }
        }
        return false;
    }

    private ArrayList<String> getsortedList(ArrayList<String> list) {
        Collections.sort(list);
        return list;
    }
}
