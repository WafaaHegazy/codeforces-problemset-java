package com.problemSolving;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/266/A
 *
 * @author Wafaa Hegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer capacity = scanner.nextInt();
        String colors = scanner.next();
        Integer count = 0;
        for (int i = 0; i < colors.length(); i++) {
            if (i == colors.length() - 1) {
                break;
            }
            if (colors.charAt(i) == colors.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
