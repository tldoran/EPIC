package org.epiccalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome students to your personal calculator\nTailored to your each and every need!");
        System.out.println("Please select from the following options");
        System.out.println("-----------------------------------------");

        System.out.println("1 -> Basic Arithmetic");
        System.out.println("2 -> Financial Calculator");
        System.out.println("3 -> Unit Converter");
        System.out.println("4 -> Binary/Hex/Decimal/Octal");
        System.out.println("5 -> Mortgage Calculator");
        System.out.println("7 -> Trigonometry");
        System.out.println("8 -> Geometry");
        System.out.println("9 -> Statistics");
        System.out.println("10 -> Algebra");


        System.out.println("\nEnter option number: ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt(); // user choice variable to decide which calculator is appropriate


        switch (choice) { //switch case to deal with user option and forwarding to correct class
            case 1 :
                ArithmeticUtils.options();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}
