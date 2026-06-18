package test_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC004_Cross_Browser_Test {
         WebDriver driver;
         @DataProvider(name = "browserData")
        public Object[][] getData() {
            return new Object[][]{
                    {"chrome", "136"},
                    {"chrome", "133"},
                    {"firefox", "140"},
                    {"firefox", "139"},
                    {"edge", "135"},
                    {"edge", "136"}
            };
        }
        @Test(dataProvider = "browserData")
        public void crossBrowserTest(String browser, String version) {
             if (browser.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            }
            else if (browser.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            }
            else if (browser.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }
            driver.manage().window().maximize();
            driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/?utm_source=chatgpt.com#/login");
            System.out.println("Browser : " + browser);
            System.out.println("Version : " + version);
            System.out.println("Title   : " + driver.getTitle());
            driver.quit();
        }
    }





