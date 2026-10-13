package com.example;

public class App {

    public String reverseString(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        App obj = new App();

        String text = "Hello";

        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " + obj.reverseString(text));
    }
}