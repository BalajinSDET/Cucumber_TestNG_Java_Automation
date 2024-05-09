package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Index_Page {
    public WebDriver driver;

    public Index_Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@class]//*[@src='/static/media/humanLogo.98dd5966.png']")
    public WebElement IHPLOGO;

    @FindBy(xpath = "//h4[contains(text(),'LOGIN AS JOB PROVIDER')]")
    public WebElement loginAsJobProvider;

    @FindBy(xpath = "//h4[contains(text(),'LOGIN AS JOBSEEKER')]")
    public WebElement loginAsJobSeeker;

    public boolean VerifyIhpLogo() throws InterruptedException {
        Thread.sleep(3000);
        return IHPLOGO.isDisplayed();
    }

    public void Click_LoginAsJobProvider() {
        loginAsJobProvider.click();
    }

    public void Click_LoginAsJobSeeker() {
        loginAsJobSeeker.click();
    }

}
