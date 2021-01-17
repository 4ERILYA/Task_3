package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final ParabolaX P1 = new ParabolaX(-2, 4, -1);
    public static final ParabolaY P2 = new ParabolaY(-5, -5, 0.5);

    public static SimpleColor getColor(double x, double y) {
        SimpleColor answer = SimpleColor.BLUE;

        if ((P1.isLeft(x, y)) && (P2.isDown(x, y))) {
            answer = SimpleColor.YELLOW;
        }
        if (!P2.isDown(x, y)) {
            answer = SimpleColor.GRAY;
        }
        if ((P2.isDown(x, y)) && (!P1.isLeft(x, y)) && (x < -5) && (y > 5)) {
            answer = SimpleColor.WHITE;
        }
        return answer;
    }

    public static void printColorForPrint(double x, double y) {
        System.out.printf("x = %.01f y = %.01f answer = %s%n", x, y, getColor(x, y));
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        Test.testCases();

        System.out.print("Input x coordinate = ");
        double x = scanner.nextDouble();
        System.out.print("Input y coordinate = ");
        double y = scanner.nextDouble();

        printColorForPrint(x, y);


    }


}
