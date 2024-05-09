package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Job_Provider_SignInPage {

    public WebDriver driver;

    public Job_Provider_SignInPage(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(xpath = "//h4[contains(text(),'Sign in')]")
    public WebElement SignInText;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement EmailId;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement Password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SignInBtn;


    public boolean Verify_SignInPage() {
        return SignInText.isDisplayed();
    }

    public void EnterEmailId(String email) {
        EmailId.sendKeys(email);
    }

    public void EnterPassword(String password) {
        Password.sendKeys(password);
    }

    public void ClickSignInButton() {
        SignInBtn.click();
    }
}
