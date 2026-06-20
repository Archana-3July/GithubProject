package test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC006_File_Upload_Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='File Upload']")).click();
        WebElement ChooseFile = driver.findElement(By.xpath("//input[@id='file-upload']"));
        //ChooseFile.click();
        ChooseFile.sendKeys("C:\\Users\\Archana\\Documents\\test.txt");
        driver.findElement(By.id("file-submit")).click();
    }
}