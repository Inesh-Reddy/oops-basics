package dev.inesh;

import dev.inesh.bankAccount;

public class usebankAccount {
    public static void main(String[] args) {
        bankAccount b = new bankAccount();
        b.setOwnerName("Inesh Reddy");
        b.setBalance(5000);
        b.deposit(100);
        b.deposit(200);
        b.withdraw(100);
        b.printTransactionHistory();
    }
}