public class GetSetTest {
    public static void main(String[] args) {
        Account conta = new Account(12, 1337);
        System.out.println(conta.getNumber());

        Client allan = new Client();
        allan.setName("Allan Rieri");
        conta.setHolder(allan);
        System.out.println(conta.getHolder().getName());

        conta.getHolder().setOccupation("Programador");
        System.out.println(conta.getHolder().getOccupation());
    }
}
