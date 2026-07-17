package test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC019_Spect_MoveToElement_Test {
    @Test
    public void spect_oveToElement() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/360-Interactive-Product-Viewer-Plugin-With-JQuery-Angle-View/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        for(int i=0;i<=10;i++){
            Thread.sleep(200);
            driver.findElement(By.xpath("//button[text()='Next']")).click();
        }
        for(int i=0;i<=20;i++){
            Thread.sleep(200);
            driver.findElement(By.xpath("//button[text()='Prev']")).click();
        }
        driver.quit();
    }
}
