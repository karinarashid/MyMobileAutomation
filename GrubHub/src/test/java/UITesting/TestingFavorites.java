package UITesting;

import CommonMethods.CommonMethodsGH;
import UI.NavigatingTheMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Karina on 2/11/2017.
 */
public class TestingFavorites extends NavigatingTheMenu {

    @Test
    public void testingFavorites ()throws InterruptedException{
        CommonMethodsGH commonMethodsGH = PageFactory.initElements(ad, CommonMethodsGH.class);
        commonMethodsGH.logIn();

        NavigatingTheMenu ntm = PageFactory.initElements(ad, NavigatingTheMenu.class);
        uAddingToFavorites().testingFirstFav();
    }
}

