package test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC017_Rotator_Front_Back_Content_Test {
    @Test
    public void rotator_Front_Back() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/customizable-element-rotator/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        for(int i=0;i<=10;i++){
        WebElement FrontRotator = driver.findElement(By.xpath("//div[@class='front']"));
       Thread.sleep(2000);
       FrontRotator.click();
        WebElement BackRotator = driver.findElement(By.xpath("//div[@class='back']"));
        Thread.sleep(2000);
        BackRotator.click();
        Thread.sleep(2000);
        }
        driver.quit();
    }
}
