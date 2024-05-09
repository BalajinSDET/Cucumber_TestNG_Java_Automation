package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Job_Provider_SignInPage {

    @FindBy(xpath = "//h4[contains(text(),'Sign in')]")
    public WebElement SignInText;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement EmailId;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement Password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SignInBtn;






}
