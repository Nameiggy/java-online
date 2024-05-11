package ru.itsjava.Figure;

public abstract class Figure {
    public final static double PI = 3.14;

    public  void getTriangeleArea(){
        System.out.println("вычесление площади треугольника");
    }
    public void getTriangelePerimetr (){
        System.out.println("вычесление периметра треугольника");
    }
    public void getRectangleArea(){
        System.out.println("вычесление площади прямоугольника");
    }
    public void getRectanglePerimetr (){
        System.out.println("вычесление периметра прямоугольника");
    }
    public void  getSquareAre (){
        System.out.println("вычесление площади квадрата");
    }
    public void  getSquarePerimetr(){
        System.out.println("вычесление периметра квадрата");
    }

    public void getCirclePerimeter(){
        System.out.println("Вычесление периметра круга");
    }
    public void getCircleArea () {
        System.out.println("Вычесление области его круга");
    }


}
