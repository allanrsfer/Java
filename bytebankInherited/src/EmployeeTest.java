public class EmployeeTest {
    public static void main(String[] args) {

        Client client = new Client();

        Manager allan = new Manager();
        allan.setName("Allan Rieri");
        allan.setCpf("123.456.789-10");
        allan.setSalary(1000);

        System.out.println(allan.getName());
        System.out.println(allan.getBonus());
    }
}