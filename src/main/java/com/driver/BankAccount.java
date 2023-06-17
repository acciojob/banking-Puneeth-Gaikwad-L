package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {

    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception
        int Sum = 0;
        int Digits = 0;
//        String ans = "";
        for(int i= 0; i<9; i++){
            Sum =0;
//            ans = "";
            for(int j = i; j<=9;j++) {
                Sum += j;
//                ans = ans + j;
                Digits++;
                if (Sum == sum && Digits == digits) {
                    return null;
                }
                if(Digits == digits && sum != Sum){
                    i++;
                    break;
                }
            }
        }
        return "Account Number can not be generated";
    }

    public void deposit(double amount) {
        //add amount to balance
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        balance-=amount;
        if(balance<minBalance){
            throw new RuntimeException("Insufficient Balance");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
}