package com.likelion;

public class PrintHelloTest {
    public static void main(String[] args) {
        PrintHello print = new PrintHello();
        print.print();
        print.printBye();
        PrintHelloTest.arithmatic();

    }

    static void arithmatic() {
        System.out.println(1 + 1);
    }
}
