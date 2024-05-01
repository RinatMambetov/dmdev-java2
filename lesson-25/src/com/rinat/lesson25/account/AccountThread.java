package com.rinat.lesson25.account;

public class AccountThread extends Thread {
    private Account accountFrom;
    private Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    @Override
    public void run() {
//        for (int i = 0; i < 200; i++) {
        for (int i = 0; i < 2000; i++) {
            synchronized (accountFrom) {
                synchronized (accountTo) {
                    accountFrom.takeOff(10);
                    accountTo.add(10);
                }
            }
        }
    }

}
