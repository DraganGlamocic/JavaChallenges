package com.DraganGlamocic;

import com.DraganGlamocic.challenges.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ChallengeChooser {

    public static void selectChallenge() {
        System.out.println("Challenges:");
        System.out.println("22: Dog Years\n23: Anagrams\n24: Walking\n25: Football\n26: Winter Numbers\n27: Chess\n28: Digit from Sequence\n29: TV Size\n30: Spreading");
        switch (ChallengeChooser.chooseChallenge()) {
            case 22:
                System.out.println("- Dog Years -");
                System.out.println("Input dog years to calculate human years: ");
                int dogYearsList = Inputs.getInputForChallenge22();
                System.out.println(DogYears.dogYears(dogYearsList));
                break;

                case 23:
                System.out.println("- Anagrams -");
                System.out.println("First input determines how many anagrams are checked: ");
                ArrayList<Integer> anagramNumbersList = Inputs.getInputForChallenge23();
                System.out.println(Anagrams.anagrams(anagramNumbersList));
                break;

            case 24:
                System.out.println("- Walking -");
                System.out.println("Input minutes walked and ran: ");
                ArrayList<Integer> walkedAndRan = Inputs.getInputForChallenge24();
                System.out.println("Remaining steps till 10.000 steps: ");
                System.out.println(Steps.steps(walkedAndRan));
                break;

            case 25:
                System.out.println("- Football -");
                System.out.println("First input determines how many teams to enter.");
                System.out.println("Then every 3 values are [Wins, Draws, Losses] per team: ");
                ArrayList<Integer> winDrawLossList = Inputs.getInputForChallenge25();
                System.out.println(FootballPoints.getHighestScore(winDrawLossList));
                break;

            case 26:
                System.out.println("- Winter Numbers -");
                System.out.println("First input determines how many Winter Numbers to enter.");

                ArrayList<Long> inputNumbersList = Inputs.getInputForChallenge26();
                ArrayList<String> yesOrNo = new ArrayList<>(WinterNumbers.getWinterNumberCount(inputNumbersList));

                StringBuilder builder = new StringBuilder();
                yesOrNo.forEach(string -> builder.append(string).append(" "));
                System.out.println(builder.toString().trim());
                break;

            case 27:
                System.out.println("- Chess -");
                System.out.println("First 2 inputs determines Knight position.");
                System.out.println("Then opponents count, then opponents positions: ");

                ArrayList<String> inputList27 = Inputs.getInputForChallenge27();
                int attackCount = Chess.getAttackedCount(inputList27);

                System.out.println(attackCount);
                break;

            case 28:
                System.out.println("- Digit from Sequence -");
                System.out.println("The sequence is: 112123123412345123456... etc.");
                System.out.println("The number you enter will give the digit in that position of this sequence: ");

                int input28 = Inputs.getInputForChallenge28();
                int position = DigitFromSequence.getDigitFromSequence(input28);

                System.out.println(position);
                break;

            case 29:
                System.out.println("- TV Size -");
                System.out.println("Enter TV graph according to instructions in README.md: ");

                ArrayList<String> tvInputList = Inputs.getInputForChallenge29();
                ArrayList<String> widthAndHeight = new ArrayList<>();
                widthAndHeight = Tv.getTvHeightAndWidth(tvInputList);
                int height = Integer.parseInt(widthAndHeight.get(0));
                int width = Integer.parseInt(widthAndHeight.get(1));
                System.out.println(height + " " + width);
                break;

            case 30:
                System.out.println("There are " + Inputs.getInputForChallenge30() + " months needed to paint your requested amount of houses.");
                break;
        }
    }


    private static int chooseChallenge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of the challenge you want to test: ");
        return scanner.nextInt();
    }
}
