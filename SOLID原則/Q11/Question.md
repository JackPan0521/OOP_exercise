問題描述：
設計一個「用戶管理系統」，用戶的資料包括密碼(password)與email。此系統允許用戶註冊(register)。在現有設計中，UserManager類別同時負責用戶的註冊、資料驗證(validation)、以及向用戶發送確認(confirm)電子郵件等多種任務。請分析這樣的設計，並提出如何重構來符合單一職責原則。

提示：考慮將每一項功能拆分成不同的類別或服務。

測試範例：
在這種設計下，你可以為每個服務編寫單元測試。以下是一些測試的引導：
測試 UserRegistrationService：確認用戶註冊成功後，相關資料被儲存。
測試 UserValidationService：驗證不同的用戶資料（如有效的電子郵件地址與密碼）是否通過驗證。
(1) email 格式的基本驗證，包含 '@' 和 '.'。 (2) 密碼 格式的基本驗證，至少8個字。 測試 EmailNotificationService：確保當用戶註冊成功後，發送的電子郵件內容正確。

測試程式碼:
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