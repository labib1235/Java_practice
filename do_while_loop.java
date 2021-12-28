package com.company;

import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean okay = true;
        do {
            System.out.println("enter a line: ");
            String line = scanner.nextLine();
            System.out.println("You entered line: " + line);
            if ("quit".equals(line)) {
                okay = false;
            }
        } while (okay);
    }
}
