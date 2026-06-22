package test_Class;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class TC010_Mulitple_Windows_Handling_Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
        driver.manage().window().maximize();
        String MainWindowID = driver.getWindowHandle();
        driver.switchTo().window(MainWindowID);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Dropdown menu']")).click();
        Actions act=new Actions(driver);
        WebElement UseClickButton = driver.findElement(By.id("my-dropdown-1"));
        act.click(UseClickButton).build().perform();
        Thread.sleep(2000);
        WebElement Right_Click = driver.findElement(By.xpath("//button[@id='my-dropdown-2']"));
        act.contextClick(Right_Click).build().perform();
        Thread.sleep(2000);
        WebElement Double_Click = driver.findElement(By.xpath("//button[@id='my-dropdown-3']"));
        act.doubleClick(Double_Click).build().perform();
        driver.switchTo().window(MainWindowID);
        Thread.sleep(2000);
        driver.quit();

    }









}
