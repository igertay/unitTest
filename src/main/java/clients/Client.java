package clients;

import accounts.Account;
import accounts.MoneyTarget;

public class Client implements MoneyTarget {
    protected Account[] accounts;
    protected String name;

    public Client(String name, int maxCheck) {
        this.name = name;
        accounts = new Account[maxCheck];
    }

    public String getName() {
        return name;
    }

    public void add(Account account) { //дополнить счетом
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                System.out.println("Счет для клиента " + name + " создан.");
                System.out.println(accounts[i].getBalance() + " монет");
                return;
            }
        }
        System.out.println("Мест для добавления нового счёта нет! :(");
    }


    @Override
    public boolean accept(long money) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts != null && accounts[i].pay(money)) {
                System.out.println("Оплата прошла успешно.");
            }
        }
        return false;
    }

    @Override
    public boolean accept(int money) {
        return false;
    }
}

