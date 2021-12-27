package com.company;

import java.util.Scanner;

public class Math_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter math marks: ");

        int mathMarks = sc.nextInt();

        if (mathMarks >= 80 && mathMarks <= 100) {
            System.out.println("Grade: A+");
        }
        else if (mathMarks >= 70 && mathMarks <= 79) {
            System.out.println("Grade: A");
        }
        else if (mathMarks >= 60 && mathMarks <= 69) {
            System.out.println("Grade: A-");
        }
        else if (mathMarks >= 50 && mathMarks <= 59) {
            System.out.println("Grade: B");
        }
        else if (mathMarks >= 40 && mathMarks <= 49) {
            System.out.println("Grade: C");
        }
        else if (mathMarks < 33) {
            System.out.println("Grade: F");
        }
    }
}
