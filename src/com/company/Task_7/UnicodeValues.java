package com.company.Task_7;

/*
TASK NR 7 - DESCRIPTION:
Write a program that reads a line of text and prints all characters that are not ASCII,
together with their Unicode values.
*/

public class UnicodeValues {

    public static void main(String[] args) {

        methodASCII("sortDirectory");

    }


    public static void methodASCII(String text) {

        char[] toChar = text.toCharArray();

        for (char c : toChar) {
            if ((int)c > 0 && (int)c < 127) {
                System.out.println("This IS ASCII symbol: " + c + " = " + (int)c);
            } else if ((int)c > 128 && (int) c < 255) {
                System.out.println("These IS Extended ASCII symbol: " + c + " = " + (int)c);
            } else {
                System.out.println("These is NOT ASCII symbol: " + c + " = " + (int)c);
            }
        }
    }


}


