package com.company;

public class Picture {
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
    public static final ParabolaVertical P1 = new ParabolaVertical(-2, 4, -1);
    public static final ParabolaHorizontal P2 = new ParabolaHorizontal(-5, -5, 0.5);

}
