package com.problemSolving;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/69/A
 *
 * @author Wafaa Hegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer capacity = scanner.nextInt();
        Integer x = 0;
        Integer y = 0;
        Integer z = 0;
        for (int i = 0; i < capacity; i++) {
            x += scanner.nextInt();
            y += scanner.nextInt();
            z += scanner.nextInt();
        }
        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
