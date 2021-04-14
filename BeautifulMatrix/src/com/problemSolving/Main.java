package com.problemSolving;

import java.util.Scanner;

/**
 *https://codeforces.com/problemset/problem/263/A
 *
 * @author Wafaa hegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[][] arr = new Integer[5][5];
        Integer rowPosition = 0;
        Integer columnPosition = 0;
        Integer xMove = 0;
        Integer yMove = 0;
        final Integer FINAL_POSITION = 3;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 1) {
                    rowPosition = i;
                    columnPosition = j;
                    break;
                }
            }
        }
        rowPosition++;
        columnPosition++;
        if (rowPosition > FINAL_POSITION) {
            xMove = rowPosition - FINAL_POSITION;
        } else {
            xMove = FINAL_POSITION - rowPosition;
        }
        if (columnPosition > FINAL_POSITION) {
            yMove = columnPosition - FINAL_POSITION;
        } else {
            yMove = FINAL_POSITION - columnPosition;
        }
        System.out.println(xMove + yMove);
    }
}
