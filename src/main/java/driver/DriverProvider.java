package driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverProvider {
    private static AndroidDriver driver = null;

    private DriverProvider() {
    }

    public static AndroidDriver getDriver() {
        if (driver == null) {
            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), setCapabilities());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

    public static DesiredCapabilities setCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Galaxy J5");
        capabilities.setCapability("udid", "5200bdacb422451f");
        capabilities.setCapability("appPackage", "com.google.android.gm");
        capabilities.setCapability("appActivity", "com.google.android.gm.ConversationListActivityGmail");
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetKeyboard", true);
        return capabilities;
    }

    public static void removeDriver() {
        driver.quit();
          }
}