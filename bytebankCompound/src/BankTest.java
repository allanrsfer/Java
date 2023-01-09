public class BankTest {
    public static void main(String[] args) {
        Client allan = new Client();
        allan.name = "Allan Rieri";
        allan.cpf = "123.456.789-10";
        allan.occupation = "desempregado";

        Account accountAllan = new Account();
        accountAllan.holder = allan;
        accountAllan.deposit(500);
        System.out.println(accountAllan.holder.name);
        System.out.println(accountAllan.getBalance());

    }
}

