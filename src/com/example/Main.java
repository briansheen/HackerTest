package com.example;

import java.time.DayOfWeek;
import java.util.*;

public class Main {

    public static int BASE = (int)'a';

    public static void main(String[] args) {

        double taxFrac = 20/(double)100;
        System.out.println(taxFrac);

        for (int i = 0; i < 15; ++i) {
            if (i > 10) {
                System.out.println("continue");
                continue;
            }
            System.out.print(i + ", ");
        }


        String magazine[] = {"give", "me", "one", "grand", "today", "night"};
        String ransom[] = {"give", "one", "grand", "today"};

        Map<String,Integer> magazineWords = new HashMap<>();
        Map<String,Integer> ransomWords = new HashMap<>();

        for(int i = 0; i < magazine.length; ++i){
            if(magazineWords.containsKey(magazine[i])){
                magazineWords.replace(magazine[i],magazineWords.get(magazine[i])+1);
            }
            else {
                magazineWords.put(magazine[i],1);
            }
        }

        for(int i = 0; i < ransom.length; ++i){
            if(ransomWords.containsKey(ransom[i])){
                ransomWords.replace(ransom[i],ransomWords.get(ransom[i])+1);
            }
            else {
                ransomWords.put(ransom[i],1);
            }
        }

        if(canMake(ransom, ransomWords, magazineWords)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


//        int x = 50;
//        String binary = Integer.toBinaryString(x);
//        System.out.println(binary);
//        String complement = "";
//        for(int i = 0; i < binary.length(); ++i){
//            if(binary.charAt(i)=='1'){
//                complement += "0";
//            } else {
//                complement += "1";
//            }
//        }
//        System.out.println(complement);
//        System.out.println(Integer.parseInt(complement,2));


//        String first = "fcrxzwscanmligyxyvym";
//        String second = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
//
//        int[] firstLetters = getLetterCount(first);
//        int[] secondLetters = getLetterCount(second);
//        System.out.println(getDelta(firstLetters, secondLetters));


//        String[] firstArray = new String[first.length()];
//        for(int i = 0; i < first.length(); ++i){
//            firstArray[i] = String.valueOf(first.charAt(i));
//        }
//        String[] secondArray = new String[second.length()];
//        for(int i = 0; i < second.length(); ++i){
//            secondArray[i] = String.valueOf(second.charAt(i));
//        }
//
//        Arrays.sort(firstArray);
//        Arrays.sort(secondArray);
//
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(Arrays.toString(firstArray));
//        System.out.println(Arrays.toString(secondArray));
//
//        int deleteCount = 0;
//
//        String firstAnagram = "";
//
//        for(int i = 0; i < first.length(); ++i){
//            if(second.contains(String.valueOf(first.charAt(i)))){
//                firstAnagram += String.valueOf(first.charAt(i));
//                System.out.println(firstAnagram);
//            } else {
//                deleteCount++;
//            }
//        }
//
//        String secondAnagram = "";
//        for(int i = 0; i < second.length(); ++i){
//            if(firstAnagram.contains(String.valueOf(second.charAt(i)))){
//                secondAnagram += String.valueOf(second.charAt(i));
//                System.out.println(secondAnagram);
//            } else {
//                deleteCount++;
//            }
//        }
//
//        if(firstAnagram.matches(secondAnagram)){
//            System.out.println(deleteCount);
//        } else {
//            if(firstAnagram.length() > secondAnagram.length()){
//                deleteCount += (firstAnagram.length() - secondAnagram.length());
//            } else {
//                deleteCount += (secondAnagram.length() - firstAnagram.length());
//            }
//            System.out.println(deleteCount);
//        }
//
//        System.out.println((int)'a');

    public static boolean canMake(String[] ransom, Map<String, Integer> ransomWords, Map<String, Integer> magazineWords){
        for(int i = 0; i < ransom.length; ++i){
            if(magazineWords.containsKey(ransom[i])){
                int enoughWords = magazineWords.get(ransom[i]) - ransomWords.get(ransom[i]);
                if(enoughWords < 0){
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static int[] getLetterCount(String s){
        int[] letterCounts = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            int offset = s.charAt(i) - BASE;
            letterCounts[offset]++;
        }
        return letterCounts;
    }

    public static int getDelta(int[] first, int[] second){
        int delta = 0;
        for(int i = 0; i < first.length; ++i){
            int difference = Math.abs(first[i] - second[i]);
            delta += difference;
        }
        return delta;
    }

}


