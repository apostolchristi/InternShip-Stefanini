package com.company.Task_11_and_Task_12;

/*
TASK NR 11 - DESCRIPTION:
11.	 Provides an interface Measurable with a method double getMeasure() that measure an object in some way.
Make Employee implement Measurable. Provide a method: double average(Measurable[] objects) that computes the average measure.
Use it to compute the average salary of an array of employees.

12.	Continue with the preceding exercise and provide a method Measurable largest(Measurable[] objects).
Use it to find the name of the employee with the largest salary.
*/


public class Main {

    public static void main(String[] args) {

        Employee one = new Employee("Jorsh",5000);
        Employee two = new Employee("Andrey", 4000);
        Employee three = new Employee("Carl", 2000);

        Measurable[] objects = {one, two, three};
        //Average method Task_11_and_Task_12
        System.out.println(average(objects));
        //Largest method Task_13
        System.out.println(largest(objects));

    }

    public static double average(Measurable[] objects) {

        double sum = 0;
        for(int i=0; i<objects.length; i++) {
            sum += objects[i].getMeasure();
        }
        return (double) sum / (double) objects.length;
    }


    public static Measurable largest( Measurable[] objects) {

        double max = objects[0].getMeasure();
        Measurable largest = null;
        for(Measurable test : objects) {
            if(max <= test.getMeasure()) {
                max = test.getMeasure();
                largest = test;
            }
        }
        return largest;
    }
}
