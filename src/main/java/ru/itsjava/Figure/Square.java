package ru.itsjava.Figure;

public class Square extends Figure {
    private int sideA;


    public Square (int sideA){
        this.sideA=sideA;



    }
    @Override
    public void getSquareAre() {
        super.getSquareAre();
        System.out.println(sideA ^ 2);

    }

    @Override
    public void getSquarePerimetr() {
        super.getSquarePerimetr();

        System.out.println(sideA * 4);
    }


}