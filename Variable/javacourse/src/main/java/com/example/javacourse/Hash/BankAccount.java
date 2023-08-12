package com.example.javacourse.Hash;

import java.util.LinkedHashSet;

public class BankAccount {

    private int accountNumber;
    private String name;

    public int hashCode() {
        return Integer.valueOf(accountNumber).hashCode();
    }

    public boolean equals(Object obj) {
        BankAccount bankAccount = (BankAccount) obj;
        if (this.accountNumber == bankAccount.accountNumber && this.name.equals(bankAccount.name))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.accountNumber = 1234567;
        bankAccount1.name = "Test_Name_1";

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.accountNumber = 1234567;
        bankAccount2.name = "Test_Name_1";

        BankAccount bankAccount3 = new BankAccount();
        bankAccount3.accountNumber = 1234567890;
        bankAccount3.name = "Test_Name_2";

        System.out.println("---------------------Displaying Hashcode ----------------------");
        System.out.println(bankAccount1.hashCode());
        System.out.println(bankAccount2.hashCode());
        System.out.println(bankAccount3.hashCode());

        LinkedHashSet<BankAccount> setBankAcc = new LinkedHashSet<BankAccount>();
        setBankAcc.add(bankAccount1);
        setBankAcc.add(bankAccount2);
        setBankAcc.add(bankAccount3);

        System.out.println(bankAccount1);

        for (BankAccount bankAccount : setBankAcc) {
            System.out.println(bankAccount.accountNumber + " " + bankAccount.name);
        }

        System.out.println(setBankAcc);

        /*
         * Iterator itr = setBankAcc.iterator();
         * while (itr.hasNext()) {
         * System.out.println(itr.next());
         * }
         */
    }
}
