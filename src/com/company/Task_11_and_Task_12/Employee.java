package com.company.Task_11_and_Task_12;

/*
TASK NR 11 - DESCRIPTION:
11.	 Provides an interface Measurable with a method double getMeasure() that measure an object in some way.
Make Employee implement Measurable. Provide a method: double average(Measurable[] objects) that computes the average measure.
Use it to compute the average salary of an array of employees.
*/

public class Employee implements Measurable{

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public double getMeasure() {
        return salary;
    }


    @Override
    public String toString() {
        return "Name of Employee with the largest sallary is: " + this.getName()
               + " with salary: "+ this.getSalary();
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
