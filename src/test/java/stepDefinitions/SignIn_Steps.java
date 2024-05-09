package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.Index_Page;
import pageObjects.Job_Provider_SignInPage;
import pageObjects.OTP_VerificationPage;
import utils.TestContextSetup;


public class SignIn_Steps {

    public WebDriver driver;
    TestContextSetup testContextSetup;
    public Index_Page ip;
    public Job_Provider_SignInPage jpsip;
    public OTP_VerificationPage otpvp;

    public SignIn_Steps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.ip = testContextSetup.pageObjectManager.getIndexPage();
        this.jpsip = testContextSetup.pageObjectManager.getSignInPageJobProvider();
        this.otpvp = testContextSetup.pageObjectManager.getOTPverificationPage();
    }

    @Given("User is enter the Ihp website URL")
    public void userIsEnterTheIhpWebsiteURL() throws InterruptedException {
        Assert.assertTrue(this.ip.VerifyIhpLogo());
    }

    @When("The user should able to click on the Login as Job provider button in the HomePage")
    public void theUserShouldAbleToClickOnTheLoginAsJobProviderButtonInTheHomePage() {
        this.ip.Click_LoginAsJobProvider();
    }

    @Then("User should navigated to the sign in page")
    public void userShouldNavigatedToTheSignInPage() {
        Assert.assertTrue(jpsip.Verify_SignInPage());
    }

    @And("The user enter their Email Id as {string} and Password as {string}")
    public void theUserEnterTheirEmailIdAsAndPasswordAs(String email, String password) {
        jpsip.EnterEmailId(email);
        jpsip.EnterPassword(password);
    }

    @When("User clicks on the sign in button")
    public void userClicksOnTheSignInButton() {
        jpsip.ClickSignInButton();
    }

    @And("User should navigated to the KYC Verification")
    public void userShouldNavigatedToTheKYCVerification() {
        otpvp.verifyKYCPage();
    }

    @And("User clicks the email verification radio button and then user clicks the submit button")
    public void userClicksTheEmailVerificationRadioButtonAndThenUserClicksTheSubmitButton() {
        otpvp.ClickEmailRadioBtn();
        otpvp.ClickSubmitBtnOnKycPage();
        otpvp.EnterOTP();
        otpvp.ClickAndVerifyOTPSubmitBtn();
    }

    @Then("User navigates to the dashboard page of the Ihp project successfully")
    public void userNavigatesToTheDashboardPageOfTheIhpProjectSuccessfully() {
    }

    @And("User validate the keep me sign in to this device checkbox and Click the checkbox")
    public void userValidateTheKeepMeSignInToThisDeviceCheckboxAndClickTheCheckbox() {
    }

    @And("User clicks the profile icon on job provider dashboard page")
    public void userClicksTheProfileIconOnJobProviderDashboardPage() {
    }

    @When("the user clicks logout button on job provider and user should navigated to the homepage of the Ihp application")
    public void theUserClicksLogoutButtonOnJobProviderAndUserShouldNavigatedToTheHomepageOfTheIhpApplication() {
    }

    @And("User validate the keep me sign in to this device checkbox")
    public void userValidateTheKeepMeSignInToThisDeviceCheckbox() {
    }

    @And("User clicks the google icon on job provider sign in page")
    public void userClicksTheGoogleIconOnJobProviderSignInPage() {
    }

    @And("User clicks the registered google account job provider")
    public void userClicksTheRegisteredGoogleAccountJobProvider() {
    }

    @When("The user should able to click on the Login as Job Seeker button in the HomePage")
    public void theUserShouldAbleToClickOnTheLoginAsJobSeekerButtonInTheHomePage() {
    }

    @And("User clicks the profile icon on job seeker dashboard page")
    public void userClicksTheProfileIconOnJobSeekerDashboardPage() {
    }

    @When("the user clicks logout button on job seeker and user should navigated to the homepage of the Ihp application")
    public void theUserClicksLogoutButtonOnJobSeekerAndUserShouldNavigatedToTheHomepageOfTheIhpApplication() {
    }

    @And("User clicks the google icon on job seeker sign in page")
    public void userClicksTheGoogleIconOnJobSeekerSignInPage() {
    }

    @And("User clicks the registered google account")
    public void userClicksTheRegisteredGoogleAccount() {
    }
}
