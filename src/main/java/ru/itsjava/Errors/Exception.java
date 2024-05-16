package ru.itsjava.Errors;

public class Exception {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }


}
