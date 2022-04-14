package com.company;

public class CardHolder implements Runnable {
    private CreditCard card;

    public CardHolder(CreditCard cc) {
        card = cc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                makeWithdraw(500);

            } catch (Exception e) {
                e.printStackTrace();
            }
            if (card.getBalance() < 0) {
                System.out.println("Insuficent Funds");
            }
        }
    }

    private synchronized void makeWithdraw(double withdrawalAmount) {

        if (card.getBalance() < withdrawalAmount) {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + withdrawalAmount + " Balance is " + card.getBalance());

        } if (card.getBalance() >= withdrawalAmount) {
                System.out.println(Thread.currentThread().getName() + " Before Withdrawing " + withdrawalAmount + " Balance: " + card.getBalance());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                card.makeWithdraw(500.00);
                System.out.println(Thread.currentThread().getName() + " After Withdrawing " + withdrawalAmount + " Balance: " + card.getBalance());
            }


        }
    }



