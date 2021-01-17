package com.company;

public class Test {

    private static final int[] pointBlue = {7, -5}; //  BLUE
    private static final int[] pointBlue2 = {3, 3}; //  BLUE
    private static final int[] pointGray = {-3, 2}; //  GRAY
    private static final int[] pointGray2 = {-4, 4};//  GRAY
    private static final int[] pointYellow = {-10, 5};//YELLOW
    private static final int[] pointWhite = {-11, 8};// WHITE

    public static void testCases() {
        Main.printColorForPrint(pointBlue[0], pointBlue[1]);
        Main.printColorForPrint(pointBlue2[0], pointBlue2[1]);
        Main.printColorForPrint(pointGray[0], pointGray[1]);
        Main.printColorForPrint(pointGray2[0], pointGray2[1]);
        Main.printColorForPrint(pointYellow[0], pointYellow[1]);
        Main.printColorForPrint(pointWhite[0], pointWhite[1]);
    }
}