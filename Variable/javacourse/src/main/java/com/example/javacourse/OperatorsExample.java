package com.example.javacourse;

public class OperatorsExample {

    public static void main(String[] args) {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        int i4 = 3;
        System.out.println(++i); // prefix i = 1
        System.out.println(i++); // postfix will not increment immediately
        System.out.println(--i); // prefix
        System.out.println(i--);

        int n1 = 100;
        int n2 = 200;

        System.out.println(n1++ + ++n2); // postfix will not be executed in this case

        int a = 10;
        System.out.println(a++ + ++a);

        int b = 10;
        System.out.println(b++ + b++);

        int c = 11;
        System.out.println(c-- + --c);
        System.out.println(c);

        int d = 10;
        System.out.println(~d); // -(10+1)

        int e = -11;
        System.out.println(~e); // -(-11+1)

        boolean b2 = false;
        System.out.println(!b2);

        System.out.println("-----------------------ARITHEMTIC OPERATOR -------------------------// ");
        // -----------------------ARITHEMTIC OPERATOR -------------------------//

        System.out.println("-----------------------SHIFT OPERATOR -------------------------// ");
        // -----------------------SHIFT OPERATOR -------------------------//

        System.out.println(10 << 2); // 10 * 2^2 = 40
        System.out.println(10 << 3); // 10 * 2^3 = 80
        System.out.println(10 << 4); // 10 * 2^4 = 160
        System.out.println(10 >> 2); // 10/(2^2) = 2
        System.out.println(10 >> 4); // 10/(2^4) = 0

        System.out.println("----------------------- LOGICAL & BITWISE OPERATORS-------------------------// ");
        // -----------------------LOGICAL & BITWISE OPERATOR -------------------------//

        int z1 = 10;
        int z2 = 11;

        System.out.println(z1 > 9 && z2 > 11);
        System.out.println(z1 > 9 & z2 > 11);
        System.out.println(z1++ > 9 & ++z1 > 11); // true (10>9, 12>11)

        System.out.println(z2++ > 15 && ++z2 > 11);
        System.out.println(z2);

        int z3 = 11;
        System.out.println(z3++ > 15 && ++z3 > 11); // double logical AND operator: if the first statement is
                                                    // false....then it will not execute the proceeding statement
        System.out.println(z3);

        int x3 = 10;
        System.out.println(x3++ > 9 | ++x3 > 10); // single logical OR operator: execute both condition
        System.out.println(x3); // 11

        int x4 = 10;
        System.out.println(x4++ > 9 || ++x4 > 10); // double logical OR operator: if the first statement is true....then
                                                   // it will only execute first statement
        System.out.println(x4); // 11

        System.out.println("----------------------- TERNARY OPERATORS-------------------------// ");
        // -----------------------TERNARY OPERATOR -------------------------//

        int y1 = 10;
        int y2 = 20;

        int result = y1 > y2 ? 12 : 10;
        int result2 = y1 < y2 && y1 != y2 || y1 == y2 ? 12 : 10;

        System.out.println(result);
        System.out.println(result2);

        System.out.println("----------------------- ASSIGNMENT OPERATORS-------------------------// ");
        // -----------------------ASSIGNMENT OPERATOR -------------------------//

        int num1 = 10;
        int num2 = 10;

        int sum1 = num1 + num2;

    }
}
