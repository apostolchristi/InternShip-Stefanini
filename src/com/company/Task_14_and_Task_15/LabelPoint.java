package com.company.Task_14_and_Task_15;

/*
TASK NR 14 - DESCRIPTION:
14. Define a class Point with a constructor public Point(double x, double y) and accessor methods getX, getY.
Define a subclass LabelPoint with a constructor public LabeledPoint(String label, double x, double y) and
an accessor method getLabel.

15.	Define (override) toString, equals, and hashCode methods for the previews exercise.
*/

public class LabelPoint extends Point {

    private String label;

    public LabelPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + this.getLabel();
    }
}
