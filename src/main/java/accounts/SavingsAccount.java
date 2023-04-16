package accounts;

public class SavingsAccount extends Account {
    private long minBalance = 1000;

    public SavingsAccount(String name, long balance) {
        super(name, balance);
        this.minBalance = minBalance;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount >= minBalance) {
            balance = balance - amount;
            System.out.println("В закромах: " + balance + " монет");
            return true;
        } else {
            System.out.println("Нужно больше золота! В твоих закромах: " + balance + " монет");
            return false;
        }
    }

    @Override
    public boolean add(long amount) {
        balance = balance + amount;
        System.out.println("Закрома наполнились и теперь у вас: " + balance + " монет");
        return true;
    }

    @Override
    public boolean accept(long money) {
        return false;
    }
}
