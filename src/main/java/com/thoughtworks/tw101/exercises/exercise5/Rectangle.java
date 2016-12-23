package com.thoughtworks.tw101.exercises.exercise5;

public class Rectangle {
    private final int length;
    private final int width;
    private int area;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area(){
        area = length * width;
        return area;
    }
}
