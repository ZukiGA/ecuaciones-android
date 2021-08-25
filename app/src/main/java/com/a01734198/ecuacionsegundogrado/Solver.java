package com.a01734198.ecuacionsegundogrado;

public class Solver {
    public String getRoot1(double a, double b, double c) {
        String root1 = String.valueOf((-b + Math.sqrt(Math.pow(b,2)-4 * a * c))/(2*a));
        return root1;
    }

    public String getRoot2(double a, double b, double c) {
        String root1 = String.valueOf((-b - Math.sqrt(Math.pow(b,2)-4 * a * c))/(2*a));
        return root1;
    }
}
