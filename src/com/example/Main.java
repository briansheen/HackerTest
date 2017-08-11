package com.example;

import java.time.DayOfWeek;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        String input = "abczzzzaaabbaaaccss";
        System.out.println(stringCompress(input));
        input = "abcc";
        System.out.println(stringCompress(input));
    }

    public static String stringCompress(String s){
        StringBuilder output = new StringBuilder();
        int charCount = 1;
        char c = s.charAt(0);
        for(int i = 1; i < s.length(); ++i){
            if(s.charAt(i)!=c) {
                output.append(c);
                output.append(charCount);
                charCount=0;
                c = s.charAt(i);
            }
            charCount++;
            if(i==s.length()-1){
                output.append(c);
                output.append(charCount);
            }
        }
        if(output.length()>=s.length()){
            return s;
        } else {
            return output.toString();
        }
    }

}




