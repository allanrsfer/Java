public class ManagerTest {
    public static void main(String[] args) {

        Manager g1 = new Manager();
        g1.setName("Jessica");
        g1.setCpf("987.654.321-10");
        g1.setSalary(5000);

        System.out.println(g1.getName());
        System.out.println(g1.getBonus());

        g1.setPassword(2222);
        boolean authentic = g1.authenticate(2222);
        System.out.println(authentic);
    }
}
