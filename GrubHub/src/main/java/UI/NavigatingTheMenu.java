package UI;

import CommonMethods.CommonMethodsGH;
import UIStartFreshSearch.FreshSearch;
import UI.UIContactUS.ContactUs;
import UI.UIFavorites.AddingToFavorites;
import UI.UIGiftCards.GiftCards;
import UI.UISchedulingYourOrder.SchedulingYourOrder;
import UI.UITrackingYourOrder.TrackingYourOrder;
import UI.UIPastOrders.CheckingYourPastOrders;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * Created by Karina on 2/11/2017.
 */
public class NavigatingTheMenu extends CommonMethodsGH {
        @FindBy(how = How.XPATH, using = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
        public static WebElement searchButton;

        @FindBy(how = How.XPATH, using = "//android.widget.TextView[@content-desc='User Name'")
        public static WebElement userAccName;

//        List<WebElement> optionList = new ArrayList<WebElement>();
//
//        public void getALLMenuItems() {
//                optionList = ad.findElements(By.xpath("//android.widget.ListView[@index='1']/android.widget.LinearLayout"));
//
//        }

        @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[1]")
        public static WebElement scheduledOrders;

        @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[2]")
        public static WebElement trackYourOrder;

        @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[3]")
        public static WebElement favorites;

        @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[4]")
        public static WebElement pastOrders;

        @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[5]")
        public static WebElement startAFreshSearch;

        @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[6]")
        public static WebElement giftCards;

        @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[7]")
        public static WebElement contactUs;

        public SchedulingYourOrder uSchedulingYourOrder() throws InterruptedException {
                searchButton.click();
//                getALLMenuItems();
//                for (WebElement we : optionList) {
//                        System.out.println(we);
//                }
                scheduledOrders.click();
                Thread.sleep(3 * 1000);
                return new SchedulingYourOrder();
        }

        public TrackingYourOrder uTrackingYourOrder() throws InterruptedException {
                searchButton.click();
//                getALLMenuItems();
                trackYourOrder.click();
                Thread.sleep(3000);
                return new TrackingYourOrder();
        }

        public AddingToFavorites uAddingToFavorites() throws InterruptedException {
                searchButton.click();
//                getALLMenuItems();
                favorites.click();
                Thread.sleep(3000);
                return new AddingToFavorites();
        }

        public CheckingYourPastOrders uCheckingYourPastOrders() throws InterruptedException {
                searchButton.click();
    //            getALLMenuItems();
                pastOrders.click();
                Thread.sleep(3000);
                return new CheckingYourPastOrders();
        }

        public FreshSearch uFreshSearch() throws InterruptedException {
                searchButton.click();
         //       getALLMenuItems();
                startAFreshSearch.click();
                Thread.sleep(3000);
                return new FreshSearch();
        }

        public GiftCards uGiftCards() throws InterruptedException {
                searchButton.click();
         //       getALLMenuItems();
                giftCards.click();
                Thread.sleep(3000);
                return new GiftCards();
        }

        public ContactUs uContactUs() throws InterruptedException {
                searchButton.click();
      //          getALLMenuItems();
                contactUs.click();
                Thread.sleep(3000);
                return new ContactUs();
        }
}





