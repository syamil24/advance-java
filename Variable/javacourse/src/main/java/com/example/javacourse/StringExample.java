package com.example.javacourse;

public class StringExample {

    public static void main(String[] args) {
        String s = "Test String ";
        String s2 = " ";
        String s3 = "";
        String s1 = "Welcome to Java programming";
        char searchChar = 'a';

        System.out.println("Is S3 Blank" + s3.isBlank());
        System.out.println("Is S3 Empty" + s3.isEmpty());
        System.out.println(s2.isEmpty()); // checks only empty string

        System.out.println("Index of Char s1 on char  a is " + s1.indexOf(searchChar));

        if (s1.indexOf(searchChar) < 0)
            System.out.println("No matching character in string " + s1.indexOf(searchChar));
        else {
            int count = 1;
            int startIndex = s1.indexOf(searchChar);
            while (startIndex != s1.length() - 1) {
                startIndex++;
                if (s1.charAt(startIndex) == searchChar)
                    count++;
            }
            System.out.println("Total char of a  in S1 is " + count);
        }

        System.out.println("------------------------------------");

        int count1 = 0;
        String a4 = "Welcome to Java Programming";
        char c = 'c';
        for (int i = 0; i < a4.length(); i++) {
            if (a4.charAt(i) == c)
                count1++;
        }

        System.out.println("number of occurance in string is " + count1);

        System.out.println("---------String Builder-------------------------");

        StringBuilder builder = new StringBuilder();

        String s4 = "test";
        s4 = "remove";

        System.out.println("s4 is : " + s4);

    }
}
