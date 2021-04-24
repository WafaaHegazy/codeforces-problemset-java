package com.problemSolving;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/791/A
 *
 * @author Wafaa Hegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        int count =1;
        while (true){
            a= a*3;
            b=b*2;
            if((a-b) >0){
              break;
            }
            count++;
        }
        System.out.println(count);
    }
}
