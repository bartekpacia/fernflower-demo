package com.example;

public class Main {
    public static void main(String[] args) {
        assert(System.getenv("PATH") != null): "foo";
        System.out.println("Hello, World! hehe");
    }
}
