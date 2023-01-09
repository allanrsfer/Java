public class Administrator extends Employee implements Authenticate {

    private UsefulAuthentication authentication;

    public Administrator(){
        this.authentication = new UsefulAuthentication();
    }
    public double getBonus() {
        return 50;
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
