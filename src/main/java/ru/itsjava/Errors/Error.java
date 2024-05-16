package ru.itsjava.Errors;

public class Error {
    public static void main(String[] args) {

        try {
            for (int i = 1; i < 10000; i++) {
                System.out.println(i);
            }
        } catch (StackOverflowError e) {
            System.out.println("Error: Stack overflow");
        }
    }

}
