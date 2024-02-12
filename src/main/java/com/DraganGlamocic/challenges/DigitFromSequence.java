package com.DraganGlamocic.challenges;

import java.util.ArrayList;

public class DigitFromSequence {
    public static int getDigitFromSequence(int digitPosition) {
        digitPosition--;
        ArrayList<Integer> numberSequenceList = new ArrayList<Integer>();
        ArrayList<String> stringSequenceList = new ArrayList<String>();
        int number = 1;
        String stringSequence;
        String finalSequence = "";

        for (int i = 0; i < digitPosition; i++) {
            numberSequenceList.add(number);
            number++;
            stringSequence = DigitFromSequence.intArrayToString(numberSequenceList);
            stringSequenceList.add(stringSequence);

            finalSequence = DigitFromSequence.stringArrayToString(stringSequenceList);
            if (finalSequence.length() > digitPosition) {
                break;
            }
        }
        char result = finalSequence.charAt(digitPosition);
        return result - '0';
    }


    public static String intArrayToString(ArrayList<Integer> arrList) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arrList.size(); i++) {
            int myNumbersInt = arrList.get(i);
            str.append(myNumbersInt);
        }
        return str.toString();
    }

    public static String stringArrayToString(ArrayList<String> strArr) {
        String joinedString = "";  // Initialize the joined string

        for (String element : strArr) {  // Iterate through each element in the array
            joinedString += element;  // Append the element to the joined string
        }
        return joinedString;  // Return the final joined string
    }
}