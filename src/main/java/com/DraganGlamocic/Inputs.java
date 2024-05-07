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

    public static ArrayList<Long> getInputForChallenge26() {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        n *= 1;     // Adjust number to set amount of input pairs.

        ArrayList<Long> winterNumbers = new ArrayList<>();
        winterNumbers.add(n);
        for (int i = 0; i < n; i++) {
            winterNumbers.add(scanner.nextLong());
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

    public static ArrayList<String> getInputForChallenge29() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tvInputList = new ArrayList<>();
        int rowCounter = 0;

        while (true) {
            String row = scanner.nextLine();
            row = row.replaceAll("\\s+", "");

            int rowLength = row.length();
            String finalChar = String.valueOf(row.charAt(rowLength - 1));
            tvInputList.add(row);
            rowCounter++;

            if (finalChar.equals("3")) {
                tvInputList.clear();

                tvInputList.add(String.valueOf(rowCounter));
                tvInputList.add(String.valueOf(rowLength));
                break;
            }
        }
        return tvInputList;
    }

    public static int getInputForChallenge30() {
        System.out.println("Give two numbers, width and length.");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();

        System.out.println("Give the number of houses to be painted.");
        int housesToBePainted = scanner.nextInt();

        System.out.println("Give the number of houses that are already painted.");
        int n = scanner.nextInt();

        System.out.println("What are the coordinates of each house that is already painted?");
        ArrayList<Integer> paintedHousesList = new ArrayList<>();
        for (int i = 0; i < n * 2; i++) {
            paintedHousesList.add(scanner.nextInt());
        }


        ArrayList<Integer>[] matrixList = new ArrayList[height];
        for (int i = 0; i < height; i++) {
            matrixList[i] = new ArrayList<Integer>(width); // Specify the type here
            for (int j = 0; j < width; j++) {
                matrixList[i].add(0);
            }
        }

        for (int i = 0; i < n; i++) {
            matrixList[paintedHousesList.get(0) - 1].set(paintedHousesList.get(1) - 1, 1);
            paintedHousesList.remove(0);
            paintedHousesList.remove(0);
        }

        int paintedCount = n;
        int rounds = 0;
        while (paintedCount < housesToBePainted) {
            ArrayList<Integer>[] tempMatrixList = new ArrayList[height];
            for (int i = 0; i < height; i++) {
                tempMatrixList[i] = new ArrayList<Integer>(matrixList[i]);
            }
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (tempMatrixList[i].get(j) == 1) { // Check against tempMatrixList
                        // Check right neighbor
                        if (j < width - 1 && matrixList[i].get(j + 1) == 0) {
                            matrixList[i].set(j + 1, 1);
                            paintedCount++;
                        }
                        // Check left neighbor
                        if (j > 0 && matrixList[i].get(j - 1) == 0) {
                            matrixList[i].set(j - 1, 1);
                            paintedCount++;
                        }
                        // Check top neighbor
                        if (i > 0 && matrixList[i - 1].get(j) == 0) {
                            matrixList[i - 1].set(j, 1);
                            paintedCount++;
                        }
                        // Check bottom neighbor
                        if (i < height - 1 && matrixList[i + 1].get(j) == 0) {
                            matrixList[i + 1].set(j, 1);
                            paintedCount++;
                        }
                    }
                }
            }
            rounds++;

//            System.out.println("\nMatrix After Round " + rounds + ":");
//            printMatrix(matrixList, height, width);
//            System.out.println();
        }
//        System.out.println(rounds + " months are needed for a total of " + housesToBePainted + " houses to be painted gray.");
//        System.out.println(" A total of " + paintedCount + " houses were painted gray in " + rounds + " months time.");
        return rounds;
    }
}


