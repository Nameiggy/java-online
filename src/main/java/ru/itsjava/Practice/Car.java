package ru.itsjava.Practice;


import lombok.Data;

@Data

public class Car {

    //Примеры с несколькими колочеством конструкторов в классе
    private String model;
    private  int wiils;
    private  String color;
    private  String angailTip;


    public Car(String model, int wiils, String color, String angailTip) {
        this.model = model;
        this.wiils = wiils;
        this.color = color;
        this.angailTip = angailTip;
    }

    public Car(String model, String color, String angailTip) {
        this.model = model;
        this.color = color;
        this.angailTip = angailTip;
        wiils=4;
    }



}

