package BankTransaction;

class Transaction<T extends Accountable> {

    private T from;         // с какого счета перевод
    private T to;           // на какой счет перевод
    private int sum;        // сумма перевода

    Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    // метод осуществляющий изменения суммы на двух счетах
    public void execute() {

        if (from.getSum() > sum) {
            from.setSum((from.getSum() - sum));
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(), to.getId(), to.getSum());
        }else{
            System.out.println("Operation is invalid");
        }

    }
}
