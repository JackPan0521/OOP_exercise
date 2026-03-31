package SOLID原則.Q11;

class User implements UserVaildationService,EmailNotificationService {
    public String email,password;

    public User(String email, String password){
        this.email = email;
        this.password = password;
    }
    public String getEmail(){}
    public String getPassword(){}
}
