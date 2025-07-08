package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base {
    @Given("Iam on the A&G Website")
    public void iam_on_the_a_g_website() {
     loginpage.VerifyWelcomeTextDisplayed();
    }

    @When("I enter the id passport number (.*)$")
    public void iEnterTheIdPassportNumberId(String id) {
        loginpage.EnterID(id);
    }

    @And("I click on the Login button")
    public void i_click_on_the_login_button() {
       loginpage.ClickLoginButton();
    }
    @Then("I am redirected to the options page")
    public void i_am_redirected_to_the_options_page() {
        loginpage.VerifyOptionPageIsDisplayed();
    }
    @When("I select the PhoneNumber option")
    public void i_select_the_phone_number_option() {
        loginpage.SelectPHoneNumber();
    }
    @Then("I am redirected to the OTP Page")
    public void i_am_redirected_to_the_otp_page() {
        loginpage.VerifyOtpPage();
    }
    @When("I enter the OTP (.*)$")
    public void i_enter_the_otp(String otp) {
       loginpage.EnterOTP(otp);
    }
    @And("I click on the OTPLogin button")
    public void i_click_on_the_otp_login_button() {
      loginpage.ClickOTPLoginButton();
    }
    @Then("I am redirected to the A&G Dashboard")
    public void i_am_redirected_to_the_a_g_dashboard() {
        loginpage.VerifyDashboardPage();
    }


}
