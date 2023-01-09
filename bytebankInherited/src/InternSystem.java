public class InternSystem {

    private int password = 2222;
    public void authenticate(Authenticate ae){
        boolean authenticated = ae.authenticate(this.password);
        if(authenticated) {
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Nao pode entrar no sistema");
        }
    }
}
