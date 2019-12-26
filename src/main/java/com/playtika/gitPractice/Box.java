package com.playtika.gitPractice;

public class Box {
    private double width;
    private double height;
    private double depth;

    public void setValues(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void printValues(){
        System.out.println("Width is " + width);
        System.out.println("Height is " + height);
        System.out.println("Depth is " + depth);
    }

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        box1.setValues(10, 20, 30.5);
        box2.setValues(11, 21, 31.5);
        box1.printValues();
        box2.printValues();

        //p.21
    }
}
