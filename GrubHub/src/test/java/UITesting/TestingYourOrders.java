package UITesting;

import CommonMethods.CommonMethodsGH;
import UI.NavigatingTheMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Karina on 2/11/2017.
 */
public class TestingYourOrders extends NavigatingTheMenu{
    @Test
    public void testingYourOrders ()throws InterruptedException{
        CommonMethodsGH cm = PageFactory.initElements(ad, CommonMethodsGH.class);
        logIn();

        NavigatingTheMenu ntm = PageFactory.initElements(ad, NavigatingTheMenu.class);
        uTrackingYourOrder().orderPlaced();
    }
}
