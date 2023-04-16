package accounts;

public interface MoneyTarget {
    boolean accept(long money);

    boolean accept(int money);
}
