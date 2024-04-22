package ru.itsjava.Figure;

public class Main3 {

    public static void main(String[] args) {

        Figure triangele= new Triangele(5,4,2);
        triangele.getTriangeleArea();
        triangele.getTriangelePerimetr();

        Figure rectangle= new Rectangle(7,9);
        rectangle.getRectangleArea();
        rectangle.getRectanglePerimetr();

        Figure square = new Square(7);
        square.getSquareAre();
        square.getSquarePerimetr();


        Figure circle = new Circle("Kryg", 35);
        circle.getCircleArea();
        circle.getCirclePerimeter();



    }
}
