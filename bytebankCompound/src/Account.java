public class Account {
    private double balance;
    private int agency, number;
    Client holder;

    public void deposit(double value){
        this.balance += value;
    };

    public boolean withdraw(double value) {
        if(this.balance >= value) {
            this.balance -= value;
            System.out.println("Feito o saque de: " + value);
            return true;
        } else {
            System.out.println("não possui saldo suficiente");
            return false;
        }
    };

    public boolean transfer(double value, Account destinationAccount) {
        if( this.balance >= value) {
            this.balance -= value;
            destinationAccount.deposit(value);
            System.out.println("Realizado a transferencia de " + value + " da conta " + destinationAccount);
            return true;
        } else {
            System.out.println("não possui saldo suficiente");
            return false;
        }
    }

    public double getBalance(){
        return this.balance;
    }
}