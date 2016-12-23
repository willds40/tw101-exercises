package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    private int area;
    private int divisor;
    private int sumofAreas;

    public float averageArea(Rectangle[] rectangles) {
        divisor = rectangles.length;
        for (int i =0; i<rectangles.length; i++){
            area = rectangles[i].area();
            sumofAreas += area;
        }
         float aveareArea =sumofAreas/divisor;
        return aveareArea;
    }
}
