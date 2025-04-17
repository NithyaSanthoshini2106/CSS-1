interface UserI {
    public void login();
    abstract void logout();
    void  forgetPassword();
}
public class User Implements UserI {
    public void login(){}
    public void logout(){}
    public void forgetPassword(){}

    public Static void main(String[] args) {
        User u1=new  User();
        u1.login();
        u1.forgetpassword();
        u1.logout();
    }
}