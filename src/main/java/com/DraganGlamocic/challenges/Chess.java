package com.DraganGlamocic.challenges;

import java.util.ArrayList;

public class Chess {
    public static int getAttackedCount(ArrayList<String> chessInputList) {

        String knightPositionString = chessInputList.get(0);
        int knightX = getIntFromString(knightPositionString);
        chessInputList.remove(0);
        int knightY = Integer.parseInt(chessInputList.get(0));
//        System.out.println("[kX = " + knightX + "] [kY = " + knightY + "]");    // Knight x/y positions
        chessInputList.remove(0);
        int listItems = Integer.parseInt(chessInputList.get(0));
        chessInputList.remove(0);
        ArrayList<Integer> knightPositionList = new ArrayList<>();
        knightPositionList.add(knightX);
        knightPositionList.add(knightY);

        int[] positions;
        int attackedCount = 0;
        for (int i = 0; i < listItems; i++) {
            positions = getPositionsOpponent(chessInputList, knightPositionList);
//            System.out.println(Arrays.toString(positions));

            if (compareKnightAndOpponent(positions).equals("yes")) {
                attackedCount++;
            }
        }

        return attackedCount;
    }

    public static int getIntFromString(String stringPosition) {
        int numericString = 0;

        for (char c : stringPosition.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'h') {
                numericString = c - 'a' + 1; // Direct value assignment
            } else {
//                System.out.println("Warning: Invalid character '" + c + "' encountered.");
            }
        }
        return numericString;
    }

    public static int[] getPositionsOpponent(ArrayList<String> opponentPositionList, ArrayList<Integer> knightPositionList) {
        int knightX = knightPositionList.get(0);
//        opponentPositionList.remove(0);
        int knightY = knightPositionList.get(1);
//        opponentPositionList.remove(0);
        int opponentX = getIntFromString(String.valueOf(opponentPositionList.get(0)));
        opponentPositionList.remove(0);
        int opponentY = Integer.parseInt(String.valueOf(opponentPositionList.get(0)));
        opponentPositionList.remove(0);

        int[] positions = new int[4];
        positions[0] = knightX;
        positions[1] = knightY;
        positions[2] = opponentX;
        positions[3] = opponentY;

        return positions;
    }

    public static String compareKnightAndOpponent(int[] positions) {
        String yesORno = "no";

        int[] knightAttackPointsArray = calculateKnightAttackPoints(positions);
        int X1 = knightAttackPointsArray[0];
        int X2 = knightAttackPointsArray[2];
        int X3 = knightAttackPointsArray[4];
        int X4 = knightAttackPointsArray[6];
        int X5 = knightAttackPointsArray[8];
        int X6 = knightAttackPointsArray[10];
        int X7 = knightAttackPointsArray[12];
        int X8 = knightAttackPointsArray[14];

        int Y1 = knightAttackPointsArray[1];
        int Y2 = knightAttackPointsArray[3];
        int Y3 = knightAttackPointsArray[5];
        int Y4 = knightAttackPointsArray[7];
        int Y5 = knightAttackPointsArray[9];
        int Y6 = knightAttackPointsArray[11];
        int Y7 = knightAttackPointsArray[13];
        int Y8 = knightAttackPointsArray[15];

        int opponentX = positions[2];
        int opponentY = positions[3];

        if (X1 == opponentX && Y1 == opponentY) {
            yesORno = "yes";
        } else if (X2 == opponentX && Y2 == opponentY) {
            yesORno = "yes";
        } else if (X3 == opponentX && Y3 == opponentY) {
            yesORno = "yes";
        } else if (X4 == opponentX && Y4 == opponentY) {
            yesORno = "yes";
        } else if (X5 == opponentX && Y5 == opponentY) {
            yesORno = "yes";
        } else if (X6 == opponentX && Y6 == opponentY) {
            yesORno = "yes";
        } else if (X7 == opponentX && Y7 == opponentY) {
            yesORno = "yes";
        } else if (X8 == opponentX && Y8 == opponentY) {
            yesORno = "yes";
        }

//        System.out.println(yesORno);
        return yesORno;
    }

    public static int[] calculateKnightAttackPoints(int[] knightPositions) {
        int[] knightAttackPoints;
        int kpX = knightPositions[0];
        int kpY = knightPositions[1];

//        System.out.println(knightPositions[0]);
//        System.out.println(knightPositions[1]);

        int X1 = kpX + 1;
        int X2 = kpX + 2;
        int X3 = kpX + 2;
        int X4 = kpX + 1;
        int X5 = kpX - 1;
        int X6 = kpX - 2;
        int X7 = kpX - 2;
        int X8 = kpX - 1;

        int Y1 = kpY + 2;
        int Y2 = kpY + 1;
        int Y3 = kpY - 1;
        int Y4 = kpY - 2;
        int Y5 = kpY - 2;
        int Y6 = kpY - 1;
        int Y7 = kpY + 1;
        int Y8 = kpY + 2;
//        System.out.println(X1 + "" + Y1 + "" + X2 + "" + Y2 + "" + X3 + "" + Y3 + "" + X4 + "" + Y4 + "" + X5 + "" + Y5 + "" + X6 + "" + Y6 + "" + X7 + "" + Y7 + "" + X8 + "" + Y8);
        knightAttackPoints = new int[]{X1, Y1, X2, Y2, X3, Y3, X4, Y4, X5, Y5, X6, Y6, X7, Y7, X8, Y8};

        return knightAttackPoints;
    }
}