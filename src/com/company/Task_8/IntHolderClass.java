package com.company.Task_8;

/*
TASK NR 8 - DESCRIPTION:
Write a program that swap the content of two IntHolderClass.
*/

import org.omg.CORBA.IntHolder;

public class IntHolderClass {

    public static void main(String[] args) {

        IntHolder first = new IntHolder(5);
        IntHolder second = new IntHolder(10);
        swap(first, second);
    }

    public static void swap(IntHolder first, IntHolder second) {

        int temp = first.value;
        first.value = second.value;
        second.value = temp;

        System.out.println("This is first value: " + first.value);
        System.out.println("This is second value: " + second.value);


    }

}
