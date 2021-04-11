package com.problemSolving;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1/A
 *
 * @author WafaaHegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double width = scanner.nextDouble();
        Double height = scanner.nextDouble();
        Double a = scanner.nextDouble();

        Double first = Math.ceil(width/a);
        Double second = Math.ceil(height/a);

        System.out.println(Math.round(first*second));
    }
}
