package com.youtube.jovemtranquilao.debug;

public class Main {

    public static void main(String[] args) {

        calculateSquareRoot();

    }

    private static void calculateSquareRoot() {
        // Reads user input and calculates the square root
        java.util.Scanner scanner2 = new java.util.Scanner(System.in);

        // calculate square root
        System.out.print("Enter a number: ");
        double square = scanner2.nextDouble();
        double squareRoot = Math.sqrt(square);
        System.out.println("The square root of " + square + " is " + squareRoot);
        scanner2.close();
    }

}