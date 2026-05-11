package SOLID原則.Q11;

class User implements UserVaildationService,EmailNotificationService {
    public String email,password;

    public User(String email, String password){
        this.email = email;
        this.password = password;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public void register(){

    }
}
