package com.company;

public class Main {

    public static void main(String[] args) {
        //Lambda expression
        Printer printer = () -> {
                System.out.println("Printing by lambda  printer");
        };

        printer.print();
    }
    }
}

interface Printer {
    void print();
}