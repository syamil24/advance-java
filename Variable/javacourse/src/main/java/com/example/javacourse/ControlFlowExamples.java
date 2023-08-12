package com.example.javacourse;

public class ControlFlowExamples {
    // finding the largest example

    public static void main(String[] args) {

        String a1 = "E";
        if (a1 == "A")
            System.out.println("Its 'A'");
        if (a1 == "B")
            System.out.println("Its 'B'");
        if (a1 == "C")
            System.out.println("Its 'C'");
        if (a1 == "D")
            System.out.println("Its 'D'");
        else {
            System.out.println("Invalid character");
        }

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1 > num2 && num1 > num3) {
            System.out.println("Num1 is the largest number");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("Num2 is the largest number");
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println("Num3 is the largest number");
        }

        // -------------SWITCH STATEMENT--------------------------------

        switch (a1) {
            case "A":
                System.out.println("Switch says Its 'A'");
                break;
            case "B":
                System.out.println("Switch says Its 'B'");
                break;
            case "C":
                System.out.println("Switch says Its 'C'");
                break;
            case "D":
                System.out.println("Switch says Its 'D'");
                break;
            default:
                System.out.println("Switch doesnt know what char it is");
                break;
        }
    }
}
