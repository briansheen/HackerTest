package com.example;

import java.time.DayOfWeek;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(isSubstring(s1, s2));
        s2 = "bottlewater";
        System.out.println(isSubstring(s1, s2));
        s2 = "terbtotlewa";
        System.out.println(isSubstring(s1, s2));
    }

    public static boolean isSubstring(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }
        if(s1.length()!=s2.length()){
            return false;
        }
        String testString = s1;
        for(int i = 0; i < s1.length(); ++i){
            testString = rotateOne(testString);
            System.out.println(testString);
            if(testString.equals(s2)){
                return true;
            }
        }
        return false;
    }

    public static String rotateOne(String s1){
        char lastChar = s1.charAt(s1.length()-1);
        StringBuilder rotatedString = new StringBuilder();
        rotatedString.append(lastChar);
        for(int i = 0; i < s1.length()-1; ++i){
            rotatedString.append(s1.charAt(i));
        }
        return rotatedString.toString();
    }

}




