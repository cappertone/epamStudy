package com.epam.autumn.politech.ht10.behavioral.chain;

public class RecoveryManager {
    public static void main(String[] args) {
        AccountRecovery recovery = new SecretQuizRecovery(WrongInputCounter.FIRST);
        AccountRecovery recoveryMail = new EmailRecovery(WrongInputCounter.SECOND);
        AccountRecovery recoveryPhone = new PhoneRecovery(WrongInputCounter.THIRD);
        recovery.setNextRecovery(recoveryMail);
        recoveryMail.setNextRecovery(recoveryPhone);

        recovery.recoverySelector( WrongInputCounter.THIRD);
        recovery.recoverySelector( WrongInputCounter.FIRST);

    }
}
