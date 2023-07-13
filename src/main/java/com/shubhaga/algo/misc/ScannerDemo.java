package com.shubhaga.algo.misc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        populateInteger(sc);
        populateBoolean(sc);
    }

    private static void populateInteger(Scanner sc) {
        try {
            System.out.println("Enter the number");
            System.out.println(sc.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("\tInvalid input type (must be an integer)");
            sc.nextLine();  // Clear invalid input from scanner buffer.
            populateInteger(sc);
        }
    }

    private static void populateBoolean(Scanner sc) {
        try {
            System.out.println("Enter the Boolean");
            System.out.println(sc.nextBoolean());
        } catch (InputMismatchException e) {
            System.out.println("\tInvalid input type (must be an boolean)");
            sc.nextLine();  // Clear invalid input from scanner buffer.
            populateBoolean(sc);
        }
    }

}
