package accounts;

public class CheckingAccount extends Account {

    public CheckingAccount(String name, long balance) {
        super(name, balance);
    }
    @Override
    public boolean add(long amount) { //пополнение баланса
        balance = balance + amount;
        System.out.println("В казне прибавилось и теперь у вас: " + balance + " монет");
        return true;
    }

    @Override
    public boolean pay(long amount) { //оплата
        if (balance - amount >= 0) {
            balance = balance - amount;
            System.out.println("В казне: " + balance + " монет");
            return true;
        } else {
            System.out.println("Нужно больше золота! В казне осталось: " + balance + " монет");
            return false;
        }
    }

    @Override
    public boolean accept(long money) {
        return false;
    }
}
