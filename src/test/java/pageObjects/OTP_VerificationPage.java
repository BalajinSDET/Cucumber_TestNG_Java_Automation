package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OTP_VerificationPage {
    @FindBy(xpath = " //div[contains(text(),'OTP Verification')]")
    public WebElement verifyHeading;

    @FindBy(xpath = "//input[@value='email']")
    public WebElement emailRBtn;

    @FindBy(xpath = "//button[contains (text(),'Submit')]")
    public WebElement submitBtn;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div[1]")
    public WebElement ClickOTPfield;

    @FindBy(xpath = "//input[@placeholder='Enter OTP']")
    public WebElement enterOTP;

    @FindBy(xpath = "//h5[contains(text(),'Submit ')]")
    public WebElement VerifyOTPSubmitBtn;

}
