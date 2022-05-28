package org.corporation.main;


import org.corporation.files.JavaReader;

import java.io.IOException;


public class Main{
    public static void main(String[] args){
        try {
            JavaReader reader = new JavaReader("org/corporation/files/wrong.java");
            reader.readAndPrint();
        } catch (IOException ioe) {
            System.err.println("Oops... Exception found: " + ioe.getMessage());
        }
    }
}