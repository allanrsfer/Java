public class NegativeBagTest {
    public static void main(String[] args) {
        Account conta = new Account();
        conta.deposit(100);
        conta.withdraw(200);

        System.out.println(conta.getBalance());
    }
}
