package com.example.javacourse;

public class ExceptionExample5 {

    public void searchNumber(int searchNumber) {
        int[] numbers = { 1, 2, 3, 9, 6, 7 };
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                found = true;
            }

            if (!found)
                throw new CustomException("Data Not Found");
            else
                System.out.println("No match");
        }
    }

    public static void main(String[] args) {
        ExceptionExample5 e5 = new ExceptionExample5();
        e5.searchNumber(5);
    }
}
