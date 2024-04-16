package ru.itsjava.ModifikatorPractice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Car {

    private String brand;
    private String color;
    private static double price = 60_000;



    public static void setPrice (double price1){
        price = price1;
    }


    public double getPrice () {
        return price;
    }


}
