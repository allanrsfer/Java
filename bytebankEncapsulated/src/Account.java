public class Account {
    private double balance;
    private int agency, number;
    private Client holder;
    private static int total = 0;

    public Account(int agency, int number){
        Account.total++;

        if(agency <= 0 | number <= 0){
            System.out.println("Numero tem que ser maior que 0");
            return;
        }
        this.agency = agency;
        this.number = number;
        System.out.println("Estou criando uma conta: Agencia: " + this.agency + " e o numero: " + this.number);
    }

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

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number) {
        if(number <= 0){
            System.out.println("Não pode numero menor ou igual a 0");
            return;
        }
        this.number = number;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        if (agency <= 0 ){
            System.out.println("não pode valor menor ou igual a 0");
            return;
        }
        this.agency = agency;
    }

    public Client getHolder() {
        return this.holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public static int getTotal() {
        return Account.total;
    }
}