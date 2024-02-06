package com.DraganGlamocic;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            ChallengeChooser.selectChallenge();
            System.out.println(" ");
            Thread.sleep(2000);
        }
    }
}


