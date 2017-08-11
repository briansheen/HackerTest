package com.example;

import java.time.DayOfWeek;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        String inputString = "amen Icy CINEMA";
        if (isPalindrome(inputString)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isPalindrome(String s) {
        StringBuilder reversed = new StringBuilder();
        StringBuilder noSpace = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != ' ') {
                noSpace.append(s.charAt(i));
            }
        }
        String input = noSpace.toString();
        input = input.toLowerCase();
        System.out.println(input);
        for (int i = s.length()-1; i >= 0; --i) {
            if (s.charAt(i) != ' ') {
                reversed.append(s.charAt(i));
            }
        }
        String output = reversed.toString();
        output = output.toLowerCase();
        System.out.println(output);
        if (input.equals(output)) {
            return true;
        } else {
            return false;
        }
    }
}




