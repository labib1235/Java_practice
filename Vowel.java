package com.company;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        char cr = sc.nextLine().charAt(0);
        if (cr == 'a' || cr == 'e' || cr == 'i' || cr == 'o' || cr == 'u' || cr == 'A' || cr == 'E' || cr == 'I' || cr == 'O' || cr == 'U') {
            System.out.println("This is a vowel");
        }
        else if ((cr>='A' && cr<='Z') || (cr>='a' && cr<='z')){
            System.out.println("This is a consonant");
        }
        else {
            System.out.println("This is not a alphabet");
        }
    }
}
