package SOLID原則.Q1;

public class SendEmailConfirmation implements ISendEmailConfirmation {

    @Override
    public void sendEmailConfirmation() {
        System.out.println("發送確認郵件");
    }
    
}
