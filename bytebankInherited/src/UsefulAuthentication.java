public class UsefulAuthentication {
    private int password;

    public boolean authenticate(int password) {
        if(this.password == password){
            return true;
        } else {
            return false;
        }
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
