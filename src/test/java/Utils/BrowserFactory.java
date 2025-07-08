package Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url){
        switch (browserChoice.toLowerCase()){
            case "edge":
//                EdgeOptions edgeOptions = new EdgeOptions();
//                edgeOptions.addArguments("--headless");
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
            default:
                driver = new ChromeDriver();
                break;
        }
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }


}
