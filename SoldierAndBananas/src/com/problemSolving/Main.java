package com.problemSolving;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/546/A
 *
 * @author Wafaa Hegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cost = scanner.nextInt();
        int dollars = scanner.nextInt();
        int bananas = scanner.nextInt();
        int totalCost = 0;
        for (int i = 0; i < bananas; i++) {
            totalCost += cost * (i + 1);
        }
        if ((totalCost - dollars) >0) {
            System.out.println(totalCost - dollars);
        }else {
            System.out.println(0);
        }

    }
}
