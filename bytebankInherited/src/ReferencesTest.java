public class ReferencesTest {
    public static void main(String[] args) {
        Manager g1 = new Manager();
        g1.setName("Allan");
        String name = g1.getName();
        g1.setSalary(5000);

        VideoEditor e1 = new VideoEditor();
        e1.setSalary(2500);

        Designer d1 = new Designer();
        d1.setSalary(2000);

        BonusController controller = new BonusController();
        controller.register(g1);
        controller.register(e1);
        controller.register(d1);

        System.out.println(name);
        System.out.println(controller.getSum());
    }
}
