package ru.itsjava.ModifikatorPractice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Data
@RequiredArgsConstructor
public class Car {

    private String brand;
    private String color;
    private static double price = 60000;



    public void setPrice (double price1){
        price=price1;
    }



    public double getPrice () {
        return price;
    }


}
