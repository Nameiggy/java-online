package ru.itsjava.ModifikatorPractice;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data

public class Car {

    private String brand;
    private String color;
    private static double price = 120_000;



    public static void setPrice (double price1){
        price = price1;
    }


    public double getPrice () {
        return price;
    }


}
