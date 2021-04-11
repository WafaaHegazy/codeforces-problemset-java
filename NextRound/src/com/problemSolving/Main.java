package com.problemSolving;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/158/A
 *
 * @author Wafaa Hegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer noOfPlayers = scanner.nextInt();
        Integer index = scanner.nextInt();
        Integer[] scores = new Integer[noOfPlayers];
        Integer counter = 0;
        for (int j = 0; j < noOfPlayers; j++) {
            scores[j] = scanner.nextInt();
        }
        if (index > noOfPlayers) {
            System.out.println(0);
        }
        Integer remainingPlayers = getNoOfPlayerInNextRound(scores, index, noOfPlayers);
        for (int k = 0; k < remainingPlayers; k++) {
            if (scores[k] > 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static Integer getNoOfPlayerInNextRound(Integer[] scores, Integer index, Integer noOfPlayers) {
        for (int i = index - 1; i < noOfPlayers; i++) {
            if (scores[i] < scores[index-1]) {
                return i;
            }
        }
        return noOfPlayers;
    }
}
