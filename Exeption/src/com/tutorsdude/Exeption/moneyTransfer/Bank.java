package com.tutorsdude.Exeption.moneyTransfer;

public class Bank {

    public void sendMoney(BankAccount sender, BankAccount receiver , int amount){
// validating the inputs
        if( sender!= null && receiver !=null){
            if (amount >0 && amount <200000){
                // check for sender having suffiecient balance or not
                if (sender.getBalanace()>amount){
                    long senderBalance = sender.getBalanace();
                    long updatedBalnce = senderBalance - amount;
                    sender.setBalanace((int) updatedBalnce);

                   long receiverBalance =  receiver.getBalanace();
                   long updatedReceiverBalance = receiverBalance + amount;
                   receiver.setBalanace((int)updatedReceiverBalance);

                }else{
                    System.out.println("sender not having suffcient balance to send");
                }

            }else{
                System.out.println("insufficeint balance");
            }

        }else {
            System.out.println("account holoder is invalid");
        }


    }
}
