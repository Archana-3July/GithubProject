package test_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilitiges.ReadConfig;
import java.time.Duration;

public class BaseClass {
    ReadConfig readConfig=new ReadConfig();
    String url=readConfig.getBaseUrl();
    String Browser=readConfig.getBaseBrowser();
    public static WebDriver driver;
    @BeforeClass
    public void setup(){
        String browser="chrome";
        switch(browser){
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
            default:
                driver=null;
                break;
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterClass
    public void browser_Close(){
        driver.quit();
    }
}
