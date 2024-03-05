package com.DraganGlamocic.challenges;

import java.util.ArrayList;
import java.util.List;

public class WinterNumbers {
    public static ArrayList<String> getWinterNumberCount(List<Long> winterNumberList) {
        ArrayList<String> yesOrNoList = new ArrayList<>();
        long potentialWinterNumber = 0;
        long n = winterNumberList.get(0);    // Amount of potential Winter numbers in list.
        winterNumberList.remove(0);

        for (int i = 0; i < n / 1; i++) {   // Divide by number of input pairs.
            String yesOrNo = "";
            String palindrome = "";
            String divisible = "";
            potentialWinterNumber = winterNumberList.get(0);
            winterNumberList.remove(0);

            palindrome = WinterNumberChecker.getPalindromeResult(potentialWinterNumber);
            divisible = WinterNumberChecker.getDivisibleResult(potentialWinterNumber);
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


    class WinterNumberChecker {
        public static String getPalindromeResult(long wN) {
            String isPalindrome;
            String isDevisible;
            ArrayList<Long> reversedWnList = new ArrayList<>();
            long wnDivisible = wN;

            // Check if palindrome.
            long reversedWn = reverse(wnDivisible);
            if (reversedWn == wnDivisible) {
                isPalindrome = "YES";
            } else {
                isPalindrome = "NO";
            }

            return isPalindrome;
        }


        public static String getDivisibleResult(long wN) {
            String isDivisible = "YES";
            ArrayList<Long> listOfNumbers = new ArrayList<>();
            listOfNumbers = numberToList(wN);

            for (int i = 0; i < listOfNumbers.size(); i++) {
                long digit = listOfNumbers.get(i);

                if (digit != 0) {
                    if (wN % digit != 0) {
                        isDivisible = "NO";
                    }
                } else {
                    isDivisible = "NO";
                }
            }

            return isDivisible;
        }


        public static long reverse(long num) {
            long reverse = 0;
            while (num != 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }
            return reverse;
        }

        public static ArrayList<Long> numberToList(long num) {
            ArrayList<Long> listOfNumbers = new ArrayList<>();
            long singleDigit = 0;

            while (num != 0) {
                singleDigit = num % 10;
//            System.out.println("SD: " + singleDigit);
                listOfNumbers.add(singleDigit);
                num /= 10;
            }
            return listOfNumbers;
        }

    }
}