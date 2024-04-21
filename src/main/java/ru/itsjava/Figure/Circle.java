package ru.itsjava.Figure;


public class Circle extends Figure{


    public final String name;
    public final static double PI = 3.14;
    public int radius;

    public Circle( int radius){
        this.name= "какое-то дефолтное имя";
        this.radius = radius;
    }


    public Circle(String name, int radius){
        this.name= name;
        this.radius = radius;
    }
    @Override
    public void getCirclePerimeter (){
        System.out.println("Perimetr" + " " + (2*PI*radius));
    }
    @Override
    public void getCircleArea(){
        System.out.println("Aerea" + " " +  (PI*(radius*radius)));
    }
}