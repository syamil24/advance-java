package com.example.javacourse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();

        System.out.println("Enter a number");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Exception occured " + e);
        } catch (InputMismatchException e) {
            System.out.println("Exception occured " + e);
        } finally { // use finally block in case where you want to execute something whether
                    // exception occurs or not1
            System.out.println("Finally block executed");
        }
        scanner.close();

        System.out.println("End of program");
    }
}
