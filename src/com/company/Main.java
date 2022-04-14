package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CreditCard cc = new CreditCard();
        CardHolder ch = new CardHolder(cc);
        Thread t1 = new Thread(ch);
        t1.setName("John");
        Thread t2 = new Thread(ch);
        t2.setName("Mary");
        t1.start();
        t2.start();



    }
}
