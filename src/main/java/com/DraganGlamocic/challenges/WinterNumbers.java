package com.DraganGlamocic.challenges;

import java.util.ArrayList;
import java.util.List;

public class WinterNumbers {
    public static ArrayList<String> getWinterNumberCount(List<Integer> winterNumberList) {
        ArrayList<String> yesOrNoList = new ArrayList<>();
        int potentialWinterNumber = 0;
        int n = winterNumberList.get(0);    // Amount of potential Winter numbers in list.
        winterNumberList.remove(0);

        for (int i = 0; i < n / 1; i++) {   // Divide by number of input pairs.
            String yesOrNo = "";
            String palindrome = "";
            String divisible = "";
            potentialWinterNumber = winterNumberList.get(0);
            winterNumberList.remove(0);

            palindrome = Steps.WinterNumberChecker.getPalindromeResult(potentialWinterNumber);
            divisible = Steps.WinterNumberChecker.getDivisibleResult(potentialWinterNumber);
//            System.out.println(palindrome + " <-pal || div-> " + divisible);

            if (palindrome.equals("YES") || divisible.equals("YES")) {
                yesOrNo = "YES";
                yesOrNoList.add(yesOrNo);
            } else {
                yesOrNo = "NO";
                yesOrNoList.add(yesOrNo);
            }
        }

        return yesOrNoList;
    }

}