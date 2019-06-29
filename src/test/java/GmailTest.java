import driver.DriverProvider;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GmailPage;
import pages.LoginPage;

public class GmailTest {
    private static final Logger logger = LogManager.getLogger(GmailTest.class);

    @BeforeMethod
    public void setup() {
        DriverProvider.getDriver();
    }

    @Test
    public void loginTest(){
           LoginPage page = new LoginPage();
           page.login();
           logger.info("login was successfully");
       }

    @Test
    public void emailSentTest() {
        GmailPage gmailPage = new GmailPage();
        gmailPage.login();
        gmailPage.composeEmail();
        logger.info("email was sent");
        }

    @AfterMethod
    public void tearDown() {
        DriverProvider.removeDriver();
    }
}


