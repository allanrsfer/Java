public class TestNoClient {
    public static void main(String[] args) {
        Account contaDaMarcela = new Account();
        System.out.println(contaDaMarcela.getBalance());

        contaDaMarcela.holder = new Client();
        System.out.println(contaDaMarcela.holder);

        contaDaMarcela.holder.name = "Marcela";
        contaDaMarcela.deposit(100);
        System.out.println(contaDaMarcela.holder.name);
        System.out.println(contaDaMarcela.getBalance());
    };
}