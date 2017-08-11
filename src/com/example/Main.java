package com.example;

import java.time.DayOfWeek;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        String inputString = "Mr John Smith    ";
        int inputInt = 13;
        String output = replaceString(inputString, inputInt);
        System.out.println(output);
    }

    public static String replaceString(String s, int n){
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < n; ++i){
            if(s.charAt(i)==' '){
                output.append("%20");
            } else {
                output.append(s.charAt(i));
            }
        }
        return output.toString();
    }
}



