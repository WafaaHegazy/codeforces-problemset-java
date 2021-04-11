package com.problemSolving;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/50/A
 *
 * @author Wafaa Hegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        System.out.println((width * height) / 2);
    }
}
