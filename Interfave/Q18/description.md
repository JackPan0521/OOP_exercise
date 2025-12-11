題目區
模擬按鈕點擊事件。設計 OnClickListener 介面，包含 void onClick();
另外，設計 Button 類別可利用 void setOnClickListerner(OnClickListener on)
註冊一個 OnClickListener 物件，在執行 click()動作時，
觸發其 onClick()動作 (此稱為 callback)。

測試類別:

public class Main {
public static void main(String[] args) {
Button btn = new Button("Submit");

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Form Submitted!");
            }
        });

        btn.click();
    }

}

輸出:

Button Submit Clicked
Form Submitted!
