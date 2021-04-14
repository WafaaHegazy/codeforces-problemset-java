package com.problemSolving;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/281/A
 *
 * @author Wafaa hegazy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder result =new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0; i<input.length();i++){
            if(input.charAt(i) != '+'){
                arrayList.add(Integer.valueOf(String.valueOf(input.charAt(i))));
            }
        }
        arrayList.sort(Integer::compareTo);
        for (Integer value: arrayList){
            result.append(value).append("+");
        }
        result.setLength(result.length()-1);
        System.out.println(result);
    }

}
