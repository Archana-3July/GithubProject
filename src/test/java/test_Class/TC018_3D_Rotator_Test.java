package test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class TC018_3D_Rotator_Test {
    @Test
    public void d_card_Rotator() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/3d-rotator-jascarousel/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        for(int i=0;i<=15;i++) {
            Thread.sleep(100);
            WebElement next=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='next']")));
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", next);
            Thread.sleep(300);
        }
        for(int i=0;i<=15;i++) {
            Thread.sleep(100);
            WebElement prev = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='prev']")));
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", prev);
            Thread.sleep(300);
        }
        driver.quit();
    }
}
