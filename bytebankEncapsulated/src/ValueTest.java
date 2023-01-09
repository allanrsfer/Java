public class ValueTest {
    public static void main(String[] args) {
        Account conta = new Account(12, 3233);

        System.out.println(conta.getAgency());
        System.out.println(conta.getNumber());

        Account conta2 = new Account(12, 2122);

        System.out.println("Quantidades de contas criadas: " + Account.getTotal());
    }
}
