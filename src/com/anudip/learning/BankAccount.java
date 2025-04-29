package com.anudip.learning;
import java.lang.String;

//creating class BankAccount
public class BankAccount {
    String accountHolder;
    int accountNumber;
    public int balance;

    //default values if not provided
    BankAccount(){
        accountHolder= "default";
        accountNumber= 12345;
        balance=0;
    }
    //setter methods for variables
    void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }

    //getter methods for variables
    int getAccountNumber(){
        return this.accountNumber;
    }
    String getAccountHolder() {
        return this.accountHolder;
    }
    int getBalance(){
        showStatus();
        return this.balance;
    }
    int deposit(int amount){
        balance=balance+amount;
        return balance;
    }
    int withdraw(int amount){
        balance=balance-amount;
        return balance;
    }

    //calculate status
    void showStatus(){
        String status = (balance >= 5000) ? "Minimum balance maintained" : "Minimum balance not maintained";
        System.out.println(status);
    }

    public static void main(String[] args) {
        //creating object of BankAccount class
        BankAccount b1= new BankAccount();

        String status;
        //setting values of b1 object
        b1.setAccountNumber(1111);
        b1.setAccountHolder("Payal");
        b1.setBalance(1000);

        //displaying initial values
        System.out.println("Display initial details: ");
        System.out.println("Account holder name: " + b1.getAccountHolder());
        System.out.println("Account holder number: " + b1.getAccountNumber());
        System.out.println("Account holder balance: " +b1.getBalance());
        System.out.println();

        //printing amount after adding 50000 and withrawal 5000:
        System.out.println("Amount after adding 50000 and withrawal 5000: ");
        b1.deposit(50000);
        b1.withdraw(5000);
        System.out.println("balance: " + b1.getBalance());
        System.out.println();

        //printing Amount after adding 1000 and withrawal 500
        System.out.println("Amount after adding 1000 and withrawal 500:");
        b1.deposit(1000);
        b1.withdraw(500);
        System.out.println("balance: " + b1.getBalance());
        System.out.println();
    }
}
