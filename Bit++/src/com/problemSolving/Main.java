package com.problemSolving;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/282/A
 *
 * @author Wafaa Hegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        ArrayList<String > operations = new ArrayList<>();
        Integer x = 0;
        for (int i=0; i<input;i++){
            operations.add(scanner.next());
        }
        for (int j=0; j<input;j++){
            if(operations.get(j).contains("++")){
                x++;
            }else if(operations.get(j).contains("--")){
                x--;
            }
        }
        System.out.println(x);
    }
}
