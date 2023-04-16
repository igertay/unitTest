package accounts;

public class CreditAccount extends Account {
    public CreditAccount(String name, long balance) {
        super(name, balance);
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount <= 0) {
            balance = balance - amount;
            System.out.println("Должок за тобой!: " + balance + " монет");
        } else {
            System.out.println("Нельзя сотворить!");
        }
        return false;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount <= 0) {
            balance = balance + amount;
            System.out.println("Фримены довольны. Твой долг составляет: " + balance + " монет");
        } else {
            System.out.println("Нельзя сотворить! Внесите ровно столько, сколько должны:" + balance + " монет");
        }
        return false;
    }

    @Override
    public boolean accept(long money) {
        return false;
    }
}
