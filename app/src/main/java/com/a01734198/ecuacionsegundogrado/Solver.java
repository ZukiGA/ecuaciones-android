package com.a01734198.ecuacionsegundogrado;

public class Solver {
    public String getRoot1(double a, double b, double c) {
        Double root = getSquareRoot(a, b, c);
        if (root < 0) {
            double real = -b / (2.0 * a);
            double imaginary = (Math.sqrt(root * -1.0)/ (2.0 * a));
            String complex = String.valueOf(real) + " + " + String.format("%.2f",imaginary) + "i";
            return complex;
        } else {
            String root1 = String.format("%.2f",(-b + Math.sqrt(root))/( 2.0 * a));
            return root1;
        }
    }

    public String getRoot2(double a, double b, double c) {
        Double root = getSquareRoot(a, b, c);
        if (root < 0) {
            double real = -b / (2.0 * a);
            double imaginary = (Math.sqrt(root * - 1.0)/ (2.0 * a));
            String complex = String.valueOf(real) + " - " + String.format("%.2f",imaginary) + "i";
            return complex;
        } else {
            String root2 = String.format("%.2f",(-b - Math.sqrt(root))/( 2.0 * a));
            return root2;
        }
    }

    public Double getSquareRoot(double a, double b, double c) {
        return Math.pow(b,2.0) - 4.0 * a * c;
    }
}
