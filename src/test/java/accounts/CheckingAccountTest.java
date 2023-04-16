package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CheckingAccountTest {

    @Test
    void pay() {
        CheckingAccount testCheckingAccount = new CheckingAccount("Капитан Шепард", 400);
        long testMinBalance = 500;
        Assertions.assertFalse(testCheckingAccount.pay(testMinBalance));
    }
}