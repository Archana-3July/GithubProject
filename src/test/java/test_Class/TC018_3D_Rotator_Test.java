package test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC018_3D_Rotator_Test {
    @Test
    public void d_card_Rotator() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/3d-rotator-jascarousel/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        for(int i=0;i<=15;i++) {
            Thread.sleep(100);
            driver.findElement(By.xpath("//a[@class='next']")).click();
        }
        for(int i=0;i<=15;i++) {
            Thread.sleep(100);
            driver.findElement(By.xpath("//a[@class='prev']")).click();
        }
        driver.quit();
    }
}
