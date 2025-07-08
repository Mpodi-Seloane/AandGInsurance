package Steps;

import Pages.LoginPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("edge", "https://amendmentsweb-sit-autogen.telesuredigital.co.za/login");
    LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
}
