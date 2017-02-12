package Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Karina on 2/5/2017.
 */
public class CommonAPI {

    public static AppiumDriver ad = null;
    public String deviceName = "Nexus";
    public String version = "21";
    public File appDirectory = null;
    public File findApp = null;
    public DesiredCapabilities cap = null;

    @BeforeMethod
    public void setUp() throws MalformedURLException {

        appDirectory = new File("src/GrubHubApp");
        findApp = new File(appDirectory, "GrubHub.apk");
        cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        cap.setCapability("deviceName",deviceName);
        cap.setCapability("platformName", "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
        cap.setCapability("app", findApp.getAbsolutePath());
        ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        ad.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
        @AfterMethod
        public void tearDown(){
        ad.closeApp();
        ad.quit();

        }

    public void clickByXpath(String locator){
        ad.findElement(By.xpath(locator)).click();
    }

    public void sleep(int sec)throws InterruptedException{
        Thread.sleep(1000 * sec);
        sleep(7);
    }

    public void typeByXpath(String locator, String value){
        ad.findElementByXPath(locator).sendKeys(value);
    }

}
