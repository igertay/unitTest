import accounts.Account;
import accounts.SavingsAccount;
import accounts.CreditAccount;
import accounts.CheckingAccount;
import clients.Client;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Пол Атрейдес", 3);
        client.add(new CheckingAccount(client.getName(), 3000));
        client.add(new SavingsAccount(client.getName(), 2000));
        client.add(new CreditAccount(client.getName(), 0));
        Account checkingAccount = new CheckingAccount(client.getName(), 3000);
        Account savingAccount = new SavingsAccount(client.getName(), 2000);
        Account creditAccount = new CreditAccount(client.getName(), 0);
        savingAccount.transfer (creditAccount, 100);
        savingAccount.accept(200);
        creditAccount.accept(200);
        checkingAccount.pay(400);
        checkingAccount.add(200);
    }
}
