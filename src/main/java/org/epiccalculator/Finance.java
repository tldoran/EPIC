package org.epiccalculator;

public class Finance {
    protected Scanner scanner;

    public Finance() {
        this.Scanner = new Scanner(System.in);
    }

    public abstract void performCalculation();
}