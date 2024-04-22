package ru.itsjava.Figure;

public class Rectangle extends Figure {
    private int a;
    private  int b;


    public  Rectangle (int a, int b){
        this.a=a;
        this.b=b;


    }
    @Override
    public void getRectangleArea() {
        super.getRectangleArea();
        System.out.println(a * b);
    }

    @Override
    public void getRectanglePerimetr() {
        super.getRectanglePerimetr();

        System.out.println( a + b );

    }



}