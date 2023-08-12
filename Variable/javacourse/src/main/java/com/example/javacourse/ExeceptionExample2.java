package com.example.javacourse;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExeceptionExample2 {

    public static void main(String[] args) {
        PrintWriter writer = null;
        // one way of handling exceptio
        try {
            writer = new PrintWriter("test.txt");
            writer.write("Hi, Hello");
            writer.close();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("File is not found");
        } finally {
            if (writer != null)
                writer.close();
            System.out.println("Exception handled");
        }

    }
}
