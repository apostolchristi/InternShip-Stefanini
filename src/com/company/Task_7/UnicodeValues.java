package com.company.Task_7;

/*
TASK NR 7 - DESCRIPTION:
Write a program that reads a line of text and prints all characters that are not ASCII,
together with their Unicode values.
*/

public class UnicodeValues {

    public static void main(String[] args) {

        methodASCII("aaăăфф");

    }


    public static void methodASCII(String text) {

        char[] toChar = text.toCharArray();

        for (char c : toChar) {
            int value = (int) c;
            if (value > 255) {
                System.out.println("This is NOT ASCII symbol: " + c + " = " + (int) c);
            }
        }
    }
}



