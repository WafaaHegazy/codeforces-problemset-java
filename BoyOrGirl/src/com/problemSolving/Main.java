package com.problemSolving;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i == input.length() - 1) {
                break;
            }
            if (input.substring(i + 1).contains(String.valueOf(input.charAt(i)))) {
                count++;
            }
        }
        if ((input.length() - count) % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
