package TestLogIn;

import CommonMethods.CommonMethodsGH;

import UI.NavigatingTheMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Karina on 2/7/2017.
 */
public class TestingLoggingInPage extends NavigatingTheMenu{

    @Test
    public void testingLoggingIn(){
        CommonMethodsGH cm = PageFactory.initElements(ad,CommonMethodsGH.class);
        logIn();
    }
}
