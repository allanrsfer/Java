public class TestSystem {
    public static void main(String[] args) {
        Manager g = new Manager();
        g.setPassword(2222);

        Administrator adm = new Administrator();
        adm.setPassword(3333);

        InternSystem si = new InternSystem();
        si.authenticate(g);
        si.authenticate(adm);
    }
}
