package TestLogIn;

import CommonMethods.CommonMethodsGH;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Karina on 2/7/2017.
 */
public class TestingLoggingInPage extends CommonMethodsGH{

    @Test
    public void testingLoggingIn(){
        CommonMethodsGH cm = PageFactory.initElements(ad,CommonMethodsGH.class);

        cm.linkLogIn.click();
        cm.tfEmail.sendKeys("johnsmith1031562@gmail.com");
        cm.tfPassword.sendKeys("smith020717");
        cm.btnLogIn.click();

    }
}
