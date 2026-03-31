package SOLID原則.Q11;

public class Main { 
	public void testUserValidationService() {
		public void testValidateUser_Valid() {
        User user1 = new User("user@example.com", "secure123");
        System.out.println(validator.validateUser(user1)); //顯示true
        User user2 = new User("invalid-email", "secure123"); //email至少要包含@
        System.out.println(validator.validateUser(user2)); //顯示false
        }
    }
	
	public void testUserRegistration() {
		UserRegistrationService registrationService = new UserRegistrationService();
		User user = new User("test@example.com", "password");
		boolean result = registrationService.register(user);
		System.out.println(result); //在email與密碼合乎規定的情況下，顯示註冊成功
	}

	public void testEmailNotification() {
		EmailNotificationService emailService = new EmailNotificationService();
		String email = "test@example.com";
		boolean result = emailService.sendConfirmationEmail(email);
		System.out.println(result);//顯示true
	}
}