package test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC020_Drag_Image_Test {
    @Test
    public void drag_Image() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Interactive-360-Image-Rotator-Plugin-Turntable-js/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement DragImg = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("ttPointer")));
        Actions act=new Actions(driver);
        for(int i=0;i<=25;i++){
            act.dragAndDropBy(DragImg, 100, 0).perform();
            Thread.sleep(300);
        }
        driver.quit();
   }

}

