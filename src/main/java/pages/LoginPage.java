package pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(id = "com.google.android.gm:id/welcome_tour_got_it")
    private AndroidElement enterButton;

    @FindBy(id = "com.google.android.gm:id/setup_addresses_add_another")
    private AndroidElement addEmailAddressButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")
    private AndroidElement chooseGoogleAccount;

    @FindBy(id = "com.google.android.gm:id/action_done")
    private AndroidElement goToGmailButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View")
    private AndroidElement typeAmailAddressField;

    @FindBy(id = "identifierNext")
    private AndroidElement furtherButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View")
    private AndroidElement typePassword;

    @FindBy(id = "passwordNext")
    private AndroidElement nextFurtherButton;

    @FindBy(id = "signinconsentNext")
    private AndroidElement signin;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button")
    private AndroidElement moreButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button")
    private AndroidElement acceptButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    private AndroidElement chooseEmailAddress;

    @FindBy(id = "com.google.android.gm:id/action_done")
    private AndroidElement goToGmail;

    @FindBy(id = "com.google.android.gm:id/gm_dismiss_button")
    private AndroidElement congratulationButton;

    @FindBy(id = "com.google.android.gm:id/gm_dismiss_button")
    private AndroidElement okButton;

    public void login() {
        enterButton.click();
        addEmailAddressButton.click();
        chooseGoogleAccount.click();

        wait.until(ExpectedConditions.elementToBeClickable(typeAmailAddressField));
        typeAmailAddressField.sendKeys("1401test2705@gmail.com");

        furtherButton.click();
        typePassword.sendKeys("1401198n");
        nextFurtherButton.click();
        signin.click();
        wait.until(ExpectedConditions.elementToBeClickable(moreButton));
        moreButton.click();
        acceptButton.click();
        wait.until(ExpectedConditions.visibilityOf(chooseEmailAddress));
         goToGmail.click();
        congratulationButton.click();
        okButton.click();
    }
}
