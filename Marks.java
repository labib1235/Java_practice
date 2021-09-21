package com.company;
import java.util.Scanner;

public class Marks{

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter math marks: ");
        int a = src.nextInt();
        if (a >= 80) {
            String grade = "A+";
            System.out.println(grade);
        }
        else if (a >= 70) {
            String grade = "A";
            System.out.println(grade);
        }
        else if (a >= 60) {
            String grade = "A-";
            System.out.println(grade);
        }
        else if (a >= 50) {
            String grade = "b";
            System.out.println(grade);
        }
        else {
            String grade = "f";
            System.out.println(grade);
        }

    }
}
