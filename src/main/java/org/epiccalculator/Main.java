package org.epiccalculator;

import java.util.Scanner;
import static org.epiccalculator.Basic.calculate;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a calculation: ");
        String input = scanner.nextLine();
        System.out.println(calculate(input));
    }
}
