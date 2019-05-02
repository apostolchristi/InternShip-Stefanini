package com.company.Task_13;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/*
TASK NR 13 - DESCRIPTION:
Given an array of File objects, sort it so that directories come before files, and within each group,
elements are sorted by path name. Use the lambda expression to specify the Comparator.
*/

public class LambdaExpression {

    public static void main(String[] args) {

        File file1 = new File("C:\\Users\\Capostol\\Desktop\\Test");
    }

    public static void sortDirectory(File file) {
        File[] files = file.listFiles();
        Arrays.sort(files, Comparator.comparing(File::isDirectory));
        Arrays.toString(files);

    }

}
