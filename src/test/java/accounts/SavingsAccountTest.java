package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SavingsAccountTest {

    @Test
    void pay() {
        long minBalance = 1000;
        long testBalance = 2000;
        SavingsAccount testSavingAccount = new SavingsAccount("Капитан Шепард", minBalance);
        Assertions.assertFalse(testSavingAccount.pay(testBalance));
    }
}
