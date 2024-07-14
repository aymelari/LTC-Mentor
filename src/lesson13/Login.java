package lesson13;

public class Login {
    String username;
    String userpassword;
    public Login(String name,String password){
        this.username=name;
        this.userpassword=password;
    }


    public void login(String name,String password) throws AuthenticationExceptionis{


        if(!name.equals(username) && !userpassword.equals(password)){
            throw new AuthenticationExceptionis("username or password is not valid");
        }
        else{
            System.out.println("logged in");
        }
    }
}
