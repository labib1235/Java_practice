package com.company;

public class Main {

    public static void main(String[] args) {
        //Anonymous class
        Printer printer = new Printer() {
            @Override
            public void print() {

            }

            @Override
            public void scan() {

            }
        };

        printer.print();


    }
}

interface Printer {
    void print();
    void scan();
}