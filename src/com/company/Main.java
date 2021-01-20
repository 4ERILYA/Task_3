package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        Test.testCases();

        System.out.print("Input x coordinate = ");
        double x = scanner.nextDouble();
        System.out.print("Input y coordinate = ");
        double y = scanner.nextDouble();

    }
    public static void printColorForPrint(double x, double y) {
        System.out.printf("x = %.01f y = %.01f answer = %s%n", x, y, Picture.getColor(x,y));
    }
}
