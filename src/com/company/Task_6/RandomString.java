package com.company.Task_6;

/*
TASK NR 6 - DESCRIPTION:
Write a program that produces a random string of letters and digits by generating
a random long value and printing it in base 36.
*/

import java.util.Random;

public class RandomString {

    public static void main(String[] args) {

        System.out.println("The random long value in base 36 is: \n" + randomString());

    }


    public static String randomString() {

        return Long.toUnsignedString(new Random().nextLong(), 36);

    }

}
