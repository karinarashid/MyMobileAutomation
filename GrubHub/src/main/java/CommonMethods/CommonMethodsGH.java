package CommonMethods;

import Utilities.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Karina on 2/5/2017.
 */
public class CommonMethodsGH extends CommonAPI{

    //ALL the elements we need to logIn
    @FindBy(how= How.XPATH,using="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[2]")
    public static WebElement linkLogIn;
    @FindBy(how=How.XPATH,using="//android.widget.EditText[contains(@resource-id,'com.grubhub.android:id/login_email_edit_text')]")
    public static WebElement tfEmail;
    @FindBy(how=How.XPATH,using="//android.widget.EditText[contains(@resource-id,'com.grubhub.android:id/login_password_edit_text')]")
    public static WebElement tfPassword;
    @FindBy(how=How.XPATH,using="//android.widget.Button[@content-desc='Log In Button']")
    public static WebElement btnLogIn;

    //Methods
    public void logIn(){
        linkLogIn.click();
        tfEmail.sendKeys("johnsmith1031562@gmail.com");
        tfPassword.sendKeys("smith020717");
        btnLogIn.click();
    }

}
