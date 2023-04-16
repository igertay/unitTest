package accounts;

public abstract class Account implements MoneyTarget {
    protected String name;
    protected long balance;

    public Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public abstract boolean pay(long amount);

    public abstract boolean add(long amount);


    public boolean transfer(Account accountTo, int amount) {
        if (pay(amount)) {
            if (accountTo.add(amount)) {
                return true;
            } else {
                add(amount);
            }
        }
        return false;
    }

    @Override
    public boolean accept(int money) {
        System.out.println("Денюжки в размере " + money + " монет зачислены.");
        return add(money);
    }

    public void setBalance(int balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Нельзя сотворить!");
            return;
        }
    }

    public long getBalance() {
        return (int) balance;
    }
}
