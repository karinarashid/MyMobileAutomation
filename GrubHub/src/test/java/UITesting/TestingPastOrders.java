package UITesting;

import CommonMethods.CommonMethodsGH;
import UI.NavigatingTheMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static Utilities.CommonAPI.ad;

/**
 * Created by Karina on 2/11/2017.
 */
public class TestingPastOrders extends NavigatingTheMenu{
    @Test
    public void testingPastOrders ()throws InterruptedException {
        CommonMethodsGH cm = PageFactory.initElements(ad, CommonMethodsGH.class);
        logIn();

        NavigatingTheMenu ntm = PageFactory.initElements(ad, NavigatingTheMenu.class);
        uCheckingYourPastOrders().pastOrderStatus();

    }
}
