package com.epam.autumn.politech.ht10.behavioral.chain;

public abstract class AccountRecovery {
    private int priority;
    private AccountRecovery nextRecovery;

    public AccountRecovery(int priority) {
        this.priority = priority;
    }

    public void setNextRecovery(AccountRecovery recovery){
        this.nextRecovery = recovery;
    }
    public void recoverySelector(int count){
        if(count>=priority){
            write();
        }
        if(nextRecovery!=null){
            nextRecovery.recoverySelector(count);
        }
    }
    public abstract void write();
}
