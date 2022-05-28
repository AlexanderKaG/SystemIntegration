package org.corporation.main;


import org.corporation.files.JavaReader;

public class Main {
    public static void main(String[] args) {
        try {
            JavaReader reader = new JavaReader("org/corporation/files/wrong.java");
            reader.readAndPrint();
        } catch (RuntimeException e) {
            System.err.println("Critical failure: " + e.getMessage());
            System.err.println("Cause: " + e.getCause());
        }
    }
}