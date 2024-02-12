package com.DraganGlamocic;

import java.util.ArrayList;
import java.util.Scanner;

class Inputs {
    public static int getInputForChallenge22() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        return n;
    }

    public static ArrayList<Integer> getInputForChallenge23() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n *= 2;

        ArrayList<Integer> anagramNumbers = new ArrayList<>();
        anagramNumbers.add(n);
        for (int i = 0; i < n; i++) {
            anagramNumbers.add(scanner.nextInt());
        }
        return anagramNumbers;
    }

    public static ArrayList<Integer> getInputForChallenge24() {
        Scanner scanner = new Scanner(System.in);
        int n = 2;

        ArrayList<Integer> walkedAndRan = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            walkedAndRan.add(scanner.nextInt());
        }
        System.out.println(walkedAndRan);
        return walkedAndRan;
    }

    public static ArrayList<Integer> getInputForChallenge25() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n *= 3;

        ArrayList<Integer> winDrawLoss = new ArrayList<>();
        winDrawLoss.add(n);
        for (int i = 0; i < n; i++) {
            winDrawLoss.add(scanner.nextInt());
        }
        return winDrawLoss;
    }

    public static ArrayList<Integer> getInputForChallenge26() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n *= 1;     // Adjust number to set amount of input pairs.

        ArrayList<Integer> winterNumbers = new ArrayList<>();
        winterNumbers.add(n);
        for (int i = 0; i < n; i++) {
            winterNumbers.add(scanner.nextInt());
        }
        return winterNumbers;


    }


    public static ArrayList<String> getInputForChallenge27() {
        Scanner scanner = new Scanner(System.in);


        ArrayList<String> chessInputList = new ArrayList<>();
        chessInputList.add(scanner.next());
        chessInputList.add(scanner.next());
        int n = scanner.nextInt() * 2;      // get int for the for-loop
        chessInputList.add(String.valueOf(n));  // maybe useful later on

        for (int i = 0; i < n; i++) {
            chessInputList.add(scanner.next());
        }
        n /= 2;
        chessInputList.set(2, String.valueOf(n));
        return chessInputList;

        // preset input list for testing: Comment this out when done, uncomment code above.
//        ArrayList<String> TESTList = new ArrayList<>();
//        Collections.addAll(TESTList, "e", "4", "10", "c", "5", "d", "6", "f", "6", "g", "5", "g", "3", "f", "2", "d", "2", "c", "3", "e", "5", "a", "1");
//        return TESTList;
    }

    public static int getInputForChallenge28() {
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        return position;
    }


}


