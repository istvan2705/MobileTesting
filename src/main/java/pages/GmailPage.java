package pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class GmailPage extends BasePage {

    @FindBy(id = "com.google.android.gm:id/welcome_tour_got_it")
    private AndroidElement enterButton;

    @FindBy(id = "com.google.android.gm:id/account_address")
    private AndroidElement chooseGoogleAccount;

    @FindBy(id = "com.google.android.gm:id/action_done")
    private AndroidElement goToGmail;

    @FindBy(id = "com.google.android.gm:id/gm_dismiss_button")
    private AndroidElement okButton;

    @FindBy(id = "com.google.android.gm:id/compose_button")
    private AndroidElement composeButton;

    @FindBy(id = "com.google.android.gm:id/to")
    private AndroidElement toWhom;

    @FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private AndroidElement permission;

    @FindBy(id = "com.google.android.gm:id/subject")
    private AndroidElement subject;

    @FindBy(id = "com.google.android.gm:id/composearea_tap_trap_bottom")
    private AndroidElement text;

    @FindBy(id = "com.google.android.gm:id/send")
    private AndroidElement sendButton;

    public void login() {
        enterButton.click();
        wait.until(ExpectedConditions.visibilityOf(chooseGoogleAccount));
        goToGmail.click();
        wait.until(ExpectedConditions.elementToBeClickable(okButton));
        okButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(okButton));
        okButton.click();
    }

    public void composeEmail() {
        wait.until(ExpectedConditions.elementToBeClickable(composeButton));
        composeButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(toWhom));
        toWhom.sendKeys("4323234n@gmail.com");
        subject.click();
        permission.click();
        subject.click();

        wait.until(ExpectedConditions.elementToBeClickable(subject));
        subject.sendKeys("Test3");

        wait.until(ExpectedConditions.elementToBeClickable(text));
        text.sendKeys("Hello my friend");

        wait.until(ExpectedConditions.visibilityOf(sendButton));
        sendButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.gm:id/thread_list_view")));
    }
}

