package com.problemSolving;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/71/A
 *
 * @author WafaaHegazy
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        String[] words = new String[input];
        for (int i = 0; i < input; i++) {
            words[i] = scanner.next();
        }
        for (String word : words) {
            System.out.println(getAbbreviation(word));
        }
    }

    private static String getAbbreviation(String word) {
        if (word.length() > 10) {
            word = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
        }
        return word;
    }
}
