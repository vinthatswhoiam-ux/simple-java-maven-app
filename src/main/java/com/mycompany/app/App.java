package com.mycompany.app;

public class App {

    private final String message = "Hello World!";

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    public String getMessage() {
        return message;
    }
}
