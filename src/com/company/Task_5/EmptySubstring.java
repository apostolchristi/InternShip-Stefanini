package com.company.Task_5;

/*
TASK NR 5 - DESCRIPTION:
Write a program that reads a string and prints all of its nonempty substrings (empty substring “_”).
*/

public class EmptySubstring {

    public static void main(String[] args) {

        displayAllCombinations("Test ser");

    }


    private static void displayAllCombinations(String str) {

        for (int end = str.length(); end > 0; end--) {
            for (int start = 0; start < end; start++) {
                String result = str.substring(start, end);
                if(!result.isEmpty()) {
                    System.out.println(result);
                }
            }
        }
    }


}
