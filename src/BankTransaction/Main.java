package BankTransaction;

public class Main {

    public static void main(String[] args) {

        Account acc1 = new Account("14321wrq", 5000);
        Account acc2 = new Account("41212", 4300);
        Transaction<Account> tran1 =
                new Transaction<Account>(acc1, acc2, 4000);
        tran1.execute();

    }
}