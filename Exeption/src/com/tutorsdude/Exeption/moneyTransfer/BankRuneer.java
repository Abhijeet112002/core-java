package com.tutorsdude.Exeption.moneyTransfer;

public class BankRuneer {

    public static void main(String[] args) {

//        BankAccount bankAccount= new BankAccount("abhijeet","jeet","hunter",1000,50000);
//        BankAccount bankAccount1= new BankAccount("abhijeet1","jeet1","hunter1",100011,510000);
//
//        Bank bank = new Bank();
//        bank.sendMoney("","",1000);


        BankAccount bankAccount = new BankAccount("abhi",21,9632662892l,10000);
        BankAccount bankAccount1 = new BankAccount("jeet",21,9632662898l,20000);

        Bank bank = new Bank();
        bank.sendMoney(bankAccount,bankAccount1 ,2000);




    }

}
