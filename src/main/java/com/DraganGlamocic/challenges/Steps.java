package com.DraganGlamocic.challenges;

import java.util.ArrayList;
import java.util.List;

public class Steps {
    public static int steps(List<Integer> walkedAndRan) {
        int walked = walkedAndRan.get(0)* 120;
        int ran = walkedAndRan.get(1) * 240;

        return 10000 - walked - ran;
    }

    static class WinterNumberChecker {
        public static String getPalindromeResult(int wN) {
            String isPalindrome;
            String isDevisible;
            ArrayList<Integer> reversedWnList = new ArrayList<>();
            int wnDivisible = wN;

            // Check if palindrome.
            int reversedWn = reverse(wnDivisible);
            if (reversedWn == wnDivisible) {
                isPalindrome = "YES";
            } else {
                isPalindrome = "NO";
            }

            return isPalindrome;
        }

        public static String getDivisibleResult(int wN) {
            String isDivisible = "YES";
            ArrayList<Integer> listOfNumbers = new ArrayList<>();
            listOfNumbers = numberToList(wN);

            for (int i = 0; i < listOfNumbers.size(); i++) {
                int digit = listOfNumbers.get(i);

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


        public static int reverse(int num) {
            int reverse = 0;
            while (num != 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }
            return reverse;
        }

        public static ArrayList<Integer> numberToList(int num) {
            ArrayList<Integer> listOfNumbers = new ArrayList<>();
            int singleDigit = 0;

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