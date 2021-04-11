package com.problemSolving;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/231/A
 *
 * @author Wafaa Hegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer count = 0;
        Integer noOfProblems = scanner.nextInt();
        for (int i = 0; i < noOfProblems; i++) {
            if (scanner.nextInt() + scanner.nextInt() + scanner.nextInt() >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
