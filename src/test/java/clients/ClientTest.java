package clients;

import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Account testAccount1;

        @Test
    void accept() {
            testAccount1 = new CheckingAccount("Капитан Шепард", 500);
        Assertions.assertFalse(testAccount1.accept(testAccount1.getBalance()));
    }
}
