package com.problemSolving;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/4/A
 *
 * @author Wafaa Hegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        System.out.println(checkIfEven(input));
    }

    private static String checkIfEven(Integer weight) {
        if (weight > 2 && weight % 2 == 0) {
            return "YES";
        }
        return "NO";
    }
}
