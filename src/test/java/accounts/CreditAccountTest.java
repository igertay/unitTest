package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CreditAccountTest {
    CreditAccount testCreditAccount = new CreditAccount("Капитан Шепард", 200);

    @org.junit.jupiter.api.Test
    public void pay() {
        long money = 200;

        Assertions.assertFalse(testCreditAccount.pay(money));
    }

    @Test
    void add() {
        long money = 200;
        Assertions.assertFalse(testCreditAccount.add(money));

    }
}

