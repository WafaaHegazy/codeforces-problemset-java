package com.problemSolving;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/281/A
 *
 * @author Wafaa Hegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println(name);
    }
}
