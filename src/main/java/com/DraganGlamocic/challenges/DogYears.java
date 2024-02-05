package com.DraganGlamocic.challenges;

public class DogYears {
    public static int dogYears(int n) {
        int dogYears = n;
        int humanYears = 0;

        if (dogYears == 0) {
            humanYears = 0;
        } else if (dogYears == 1) {
            humanYears = 15;
        } else if (dogYears == 2) {
            humanYears = 15 + 9;
        } else if (dogYears > 2 && dogYears < 7) {
            int var = dogYears - 2;
            humanYears = 15 + 9;

            for (int i = 0; i < var; i++) {
                humanYears += 4;
            }
        } else if (dogYears > 6) {
            int var = dogYears - 6;
            humanYears = 15 + 9 + (4 * 4);
            for (int i = 0; i < var; i++) {
                humanYears += 5;
            }
        } else {
            System.out.println("Something went wrong.");
        }

        return humanYears;
    }
}
