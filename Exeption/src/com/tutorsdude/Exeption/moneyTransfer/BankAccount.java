package com.tutorsdude.Exeption.moneyTransfer;

public class BankAccount {

    String accountHolderName;
    int age ;
    long mobile;
    int balanace;

    public BankAccount(String accountHolderName, int age,long mobile,  int balanace) {
        this.accountHolderName = accountHolderName;
        this.age = age;
        this.mobile = mobile;
        this.balanace = balanace;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getage() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }

    public int getBalanace() {
        return balanace;
    }

    public void setBalanace(int balanace) {
        this.balanace = balanace;
    }
}
