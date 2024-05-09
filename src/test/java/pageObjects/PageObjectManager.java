package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public Index_Page indexPage;
    public Job_Provider_SignInPage JPSIP;
    public OTP_VerificationPage OTP_VP;
    public WebDriver driver;


    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }


    public Index_Page getIndexPage() {
        indexPage = new Index_Page(driver);
        return indexPage;
    }

    public Job_Provider_SignInPage getSignInPageJobProvider() {
        JPSIP = new Job_Provider_SignInPage(driver);
        return JPSIP;
    }

    public OTP_VerificationPage getOTPverificationPage() {
        OTP_VP = new OTP_VerificationPage(driver);
        return OTP_VP;
    }

}
