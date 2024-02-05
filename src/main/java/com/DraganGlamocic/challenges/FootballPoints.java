package com.DraganGlamocic.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FootballPoints {
    public static int getHighestScore(List<Integer> winDrawLossList) {
        ArrayList<Integer> totalScoresList = new ArrayList<>();
        int wins = 0;
        int draws = 0;
        int n = winDrawLossList.get(0);
        winDrawLossList.remove(0);

        for (int i = 0; i < n / 3; i++) {
            wins = winDrawLossList.get(0);
            winDrawLossList.remove(0);

            draws = winDrawLossList.get(0);
            winDrawLossList.remove(0);
            winDrawLossList.remove(0);

            int totalPoints = (wins * 3) + draws;
            totalScoresList.add(totalPoints);
        }
        Collections.sort(totalScoresList);
        return totalScoresList.get(n / 3 - 1);
    }
}