package dev.inesh;

import java.util.ArrayList;

//A Capsule that puts attributes and functions under one thing (class) => Encapsulation
public class bankAccount {

    //attributes/properties
    private double balance;
    private String ownerName;


    bankAccount() {

    }
    bankAccount(double balance1, String ownerName1) {
        balance = balance1;
        ownerName = ownerName1;
    }

    ArrayList<String>  logs = new ArrayList<>();

    //Methods/functions
    public void deposit(double amount){
        if(amount >0){
            balance += amount;
            logs.add("log: Deposited " + amount + " to " + ownerName);
            logs.add("log: Balance: " + balance);
        }else{
            logs.add("log: Cannot deposit " + amount + " to " + ownerName);
        }
    }

    public void withdraw(double amount){
        if(balance >= amount && amount > 0){
            balance -= amount;
            logs.add("log: Withdrawn " + amount + " to " + ownerName);
            logs.add("log: Balance: " + balance);
        }else{
            logs.add("log: Cannot withdraw " + amount + " to " + ownerName);
        }
    }

    public void printTransactionHistory(){
        for (String log : logs) {
            System.out.println(log);
        }
    }


    public double getBalance(){
        return balance;
    }
    public void setBalance(double updatedBalance){
        balance = updatedBalance;
    }

    public String getOwnerName(){
    return ownerName;
    }
    public void setOwnerName(String updatedOwnerName){
        ownerName = updatedOwnerName;
    }
}

