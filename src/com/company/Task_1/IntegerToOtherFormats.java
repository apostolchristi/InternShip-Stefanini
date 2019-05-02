package com.company.Task_1;

/*
TASK NR 1 - DESCRIPTION:
Write a program that reads an integer and prints it in binary, octal and hexadecimal format.
*/
public class IntegerToOtherFormats {

    public static String convertToBinary(int num) {

        return Integer.toString(num, 2);
    }

    public void convertToOctal(int num) {
        String octal = Integer.toBinaryString(num);
        System.out.println( "Octal Value = " + octal);
    }

    public void convertToHexadecimal(int num) {
        String hexadecimal = Integer.toBinaryString(num);
        System.out.println("Hexadecimal Value = " + hexadecimal);
    }


    public static void main(String[] args) {

    }





}
