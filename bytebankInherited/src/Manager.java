public class Manager extends Employee implements Authenticate {

    private UsefulAuthentication authentication;

    public Manager(){
        this.authentication = new UsefulAuthentication();
    }

    public double getBonus(){
        return super.getSalary();
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
