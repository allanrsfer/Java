public class Client implements Authenticate {

    private UsefulAuthentication authentication;
    public Client(){
         this.authentication = new UsefulAuthentication();
    }

    @Override
    public boolean authenticate(int password) {
        return this.authentication.authenticate(password);
    }

    @Override
    public void setPassword(int password) {
        this.authentication.setPassword(password);
    }
}
