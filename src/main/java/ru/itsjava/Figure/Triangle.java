package ru.itsjava.Figure;

class Triangele extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;


    public Triangele (int sideA, int sideB, int sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    @Override
    public void getTriangeleArea() {
        super.getTriangeleArea();

        double perimetr = (sideA+ sideB +sideC)/2;
        double area = Math.sqrt(((perimetr - sideA) * ( perimetr-sideB) * (perimetr -sideC) *perimetr));
        System.out.println(area);

    }

    @Override
    public void getTriangelePerimetr() {
        super.getTriangelePerimetr();

        System.out.println(sideA + sideB +sideC / 2);
    }


}