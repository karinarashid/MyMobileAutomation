package UI;

import CommonMethods.CommonMethodsGH;
import UI.StartFreshSearch.FreshSearch;
import UI.UIContactUS.ContactUs;
import UI.UIFavorites.AddingToFavorites;
import UI.UIGiftCards.GiftCards;
import UI.UISchedulingYourOrder.SchedulingYourOrder;
import UI.UITrackingYourOrder.TrackingYourOrder;
import UI.UIPastOrders.CheckingYourPastOrders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Karina on 2/11/2017.
 */
public class NavigatingTheMenu extends CommonMethodsGH {
        @FindBy(how = How.XPATH, using = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
        public static WebElement searchButton;

        @FindBy(how = How.XPATH, using = "//android.widget.TextView[@content-desc='User Name'")
        public static WebElement userAccName;

        List<WebElement> optionList = new ArrayList<WebElement>();

        public void getALLMenuItems() {
                optionList = ad.findElements(By.xpath("//android.widget.ListView[@index='1']/android.widget.LinearLayout"));

        }

        public SchedulingYourOrder uSchedulingYourOrder() throws InterruptedException {
                searchButton.click();
                getALLMenuItems();
                for (WebElement we : optionList) {
                        System.out.println(we);
                }
                optionList.get(0).click();
                Thread.sleep(3 * 1000);
                return new SchedulingYourOrder();
        }

        public TrackingYourOrder uTrackingYourOrder() throws InterruptedException {
                searchButton.click();
                getALLMenuItems();
                optionList.get(1).click();
                Thread.sleep(3000);
                return new TrackingYourOrder();
        }

        public AddingToFavorites uAddingToFavorites() throws InterruptedException {
                searchButton.click();
                getALLMenuItems();
                optionList.get(2).click();
                Thread.sleep(3000);
                return new AddingToFavorites();
        }

        public CheckingYourPastOrders uCheckingYourPastOrders() throws InterruptedException {
                searchButton.click();
                getALLMenuItems();
                optionList.get(3).click();
                Thread.sleep(3000);
                return new CheckingYourPastOrders();
        }

        public FreshSearch uFreshSearch() throws InterruptedException {
                searchButton.click();
                getALLMenuItems();
                optionList.get(4).click();
                Thread.sleep(3000);
                return new FreshSearch();
        }

        public GiftCards uGiftCards() throws InterruptedException {
                searchButton.click();
                getALLMenuItems();
                optionList.get(5).click();
                Thread.sleep(3000);
                return new GiftCards();
        }

        public ContactUs uContactUs() throws InterruptedException {
                searchButton.click();
                getALLMenuItems();
                optionList.get(6).click();
                Thread.sleep(3000);
                return new ContactUs();
        }
}





