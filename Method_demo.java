package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 23;
        double b = 4.4;
        double myaddition = performAddition(a, b);
        System.out.println("Addition: " + myaddition);
        double mysubtraction = performSubtraction(a, b);
        System.out.println("Subtraction: " + mysubtraction);
        double mymultiplication = performMultiplication(a, b);
        System.out.println("Multiplication: " + mymultiplication);
        double mydivision = performDivision(a, b);
        System.out.println("division: " + mydivision);
        }

        public static double performAddition(int num1, double num2) {
            double addition = num1 + num2;
            return addition;
        }
        public static double performSubtraction(int num1, double num2) {
            double Subtraction = num1 - num2;
            return Subtraction;
        }
        public static double performMultiplication(int num1, double num2) {
            double Multiplication = num1 * num2;
            return Multiplication;
        }
        public static double performDivision(int num1, double num2) {
            double Division = num1 / num2;
            return Division;
        }
}
