package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//div[contains(text(),'Welcome')]")
    WebElement welcomeText_xpath;


    @FindBy(xpath = "//input[@id='inpIdentity']")
    WebElement IDInput_xpath;

    @FindBy(xpath = "//button[@id= 'btnSubmit']")
    WebElement loginButton_xpath;


    @FindBy(xpath = "//div[contains(text(),'Select an option')]")
    WebElement option_xpath;

    @FindBy(xpath = "//*[@class= 'contact-detail']")
    WebElement SelectPhone_xpath;

    @FindBy(xpath = "//*[contains(text(),'Log in to your account')]")
    WebElement otpWelcome_xpath;

    @FindBy(xpath = "//input[@id= 'inpOtp']")
    WebElement otp_xpath;

    @FindBy(xpath = "//button[@id= 'btnVerify']")
    WebElement otpLoginButton_xpath;


    @FindBy(xpath = "//div[contains(text(),'Monthly payment date')]")
    WebElement Dashboard_xpath;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void VerifyWelcomeTextDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(welcomeText_xpath));
        welcomeText_xpath.isDisplayed();
    }

    public void EnterID(String id) {
        IDInput_xpath.sendKeys(id);
    }

    public void ClickLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(loginButton_xpath));
        loginButton_xpath.click();

    }

    public void VerifyOptionPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(option_xpath));
        option_xpath.isDisplayed();
    }

    public void SelectPHoneNumber() {
        SelectPhone_xpath.click();
    }

    public void VerifyOtpPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(otpWelcome_xpath));
        otpWelcome_xpath.isDisplayed();
    }

    public void EnterOTP(String otp) {
        // otp_xpath.click();
        otp_xpath.sendKeys(otp);
    }

    public void ClickOTPLoginButton() {
        otpLoginButton_xpath.click();
    }

    public void VerifyDashboardPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(Dashboard_xpath));
        Dashboard_xpath.isDisplayed();
    }
}
