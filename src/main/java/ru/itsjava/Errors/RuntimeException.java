package ru.itsjava.Errors;

public class RuntimeException {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        System.out.println(numbers[4]); // ArrayIndexOutOfBoundsException
    }

}
