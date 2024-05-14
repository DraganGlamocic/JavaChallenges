package com.DraganGlamocic.challenges;

import java.util.ArrayList;
import java.util.List;

public class Divisors {
    public static ArrayList<Integer> getDivisors(ArrayList<Integer> DivisorsList) {
    int start = DivisorsList.get(0);
    int end = DivisorsList.get(1);

        int maxDivisors = 0;
        int numberWithMaxDivisors = 0;

        for (int i = start; i <= end; i++) {
            int divisors = countDivisors(i);
            if (divisors > maxDivisors) {
                maxDivisors = divisors;
                numberWithMaxDivisors = i;
            } else if (divisors == maxDivisors) {
                numberWithMaxDivisors = Math.min(numberWithMaxDivisors, i);
            }
        }

        DivisorsList.set(0, numberWithMaxDivisors);
        DivisorsList.set(1, maxDivisors);
        return DivisorsList;
    }

    private static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (num / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count; //done
    }
}