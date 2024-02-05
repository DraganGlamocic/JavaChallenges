package com.DraganGlamocic.challenges;

import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static int anagrams(List<Integer> anagramNumbers) {
        int numberOfAnagrams = 0;
        int n = anagramNumbers.get(0);
        anagramNumbers.remove(0);

        for (int i = 0; i < n / 2; i++) {
            int firstNumber = anagramNumbers.get(0);
            anagramNumbers.remove(0);
            firstNumber = sortNumbers(firstNumber);

            int secondNumber = anagramNumbers.get(0);
            anagramNumbers.remove(0);
            secondNumber = sortNumbers(secondNumber);

            if (firstNumber == secondNumber) {
                numberOfAnagrams++;
            }
        }
        return numberOfAnagrams;
    }

    public static int sortNumbers(int unsortedNumber) {
        String numberStr = String.valueOf(unsortedNumber);
        char[] digits = numberStr.toCharArray();

        Arrays.sort(digits);// Sort the digits using Arrays.sort()

        StringBuilder sortedNumberBuilder = new StringBuilder();
        for (char digit : digits) { // Construct the sorted number by concatenating the sorted digits
            sortedNumberBuilder.append(digit);
        }
        int sortedNumber = Integer.parseInt(sortedNumberBuilder.toString());

        return sortedNumber;
    }
}