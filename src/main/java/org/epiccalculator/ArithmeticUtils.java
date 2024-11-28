package org.epiccalculator;

import java.util.Scanner;

public class ArithmeticUtils {

    static void options() {

        //output range of options for "ArithmeticUtils" Class

        System.out.println("Please select from the following options");
        System.out.println("-----------------------------------------");
        System.out.println("1 -> Addition");
        System.out.println("2 -> Subtraction");
        System.out.println("3 -> Multiplication");
        System.out.println("4 -> Division");
        System.out.println("5 -> Power");
        System.out.println("\n Enter option number: ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt(); // user choice to call arithmetic object

    }


    static double square(double number) {
        return number * number;
    }

    static double addition(double... numbers) {

        double total = 0;

        for (double num : numbers) {
            int index = 0;
            System.out.println("Number" + index + " :");
            index += 1;
            total += num;
        }

        return total;
    }
}
