package com.example.javacourse;

import java.util.HashSet;

public class EqualsExample {
    private Integer id;
    private String name;

    @Override
    public boolean equals(Object obj) {
        EqualsExample eq = (EqualsExample) obj;
        if (this.id == eq.id && this.name.equals(eq.name)) {
            return true;
        } else
            return false;

    }

    public int hashCode() {
        return id.hashCode() + name.hashCode();
    }

    public static void main(String[] args) {
        EqualsExample eq = new EqualsExample();
        eq.id = 1;
        eq.name = "Test";

        EqualsExample eq1 = new EqualsExample();
        eq1.id = 2;
        eq1.name = "Test2";

        System.out.println(eq == eq1);
        System.out.println(eq.equals(eq1));

        EqualsExample eqCopy = eq;

        System.out.println(eq == eqCopy);
        System.out.println(eq.equals(eqCopy));

        EqualsExample duplicateEq = new EqualsExample();
        duplicateEq.id = 1;
        duplicateEq.name = "Test";

        System.out.println(duplicateEq == eq);
        System.out.println(eq.equals(duplicateEq));

        System.out.println(duplicateEq.hashCode());
        System.out.println(eq.hashCode());

        HashSet<EqualsExample> equalSet = new HashSet<EqualsExample>();

        equalSet.add(eq);
        equalSet.add(eq1);

        for (EqualsExample equalsExample : equalSet) {
            System.out.println(equalsExample);
        }
    }
}
