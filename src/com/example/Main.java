package com.example;

import java.time.DayOfWeek;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        String input = "pale";
        String output = "bake";
        if (isOneAway(input, output)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isOneAway(String input, String output) {
        if (input.compareTo(output) == 0) {
            return true;
        }
        if((Math.abs(input.length()-output.length()))>=2){
            return false;
        }
        if (input.length() == output.length()) {
            return checkReplace(input, output);
        }
        if (input.length() > output.length()) {
            return checkInsert(input, output);
        }
        if (output.length() > input.length()) {
            return checkInsert(output, input);
        }
        return false;
    }

    public static boolean checkReplace(String input, String output) {
        int replaceCount = 0;
        for(int i = 0; i < input.length(); ++i){
            if(input.charAt(i)!=output.charAt(i)){
                replaceCount++;
                if(replaceCount > 1){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkInsert(String longer, String shorter){
        int insertCount = 0;
        int shorterIndex = 0;
        for(int i = 0; i < longer.length(); ++i){
            if(longer.length()-shorterIndex==1){
                return true;
            }
            if(longer.charAt(i)!=shorter.charAt(shorterIndex)){
                insertCount++;
                i++;
                if(insertCount > 1){
                    return false;
                }
            }
            shorterIndex++;
        }
        return true;
    }

}




