package com.problemSolving;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/118/A
 *
 * @author Wafaa Hegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder bld = new StringBuilder();
        input = input.toLowerCase();
        input = input.replaceAll("[aeiouy]", "");
        if (input.length() > 0) {
            for (int i = 0; i < input.length(); i++) {
                bld.append(".").append(input.charAt(i));
            }
        }
        System.out.println(bld);
    }
}
