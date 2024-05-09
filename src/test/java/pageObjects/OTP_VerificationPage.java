package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.OtpReader;

public class OTP_VerificationPage {
    public WebDriver driver;

    public OTP_VerificationPage(WebDriver driver) {
        this.driver = driver;
    }


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

    public boolean verifyKYCPage() {
        return verifyHeading.isDisplayed();
    }

    public void ClickEmailRadioBtn() {
        emailRBtn.click();
    }

    public void ClickSubmitBtnOnKycPage() {
        submitBtn.click();
    }

    public void EnterOTP() {
        String otp = OtpReader.getOtp();
        enterOTP.sendKeys(otp);
    }

    public void ClickAndVerifyOTPSubmitBtn() {
        VerifyOTPSubmitBtn.click();
    }
}
