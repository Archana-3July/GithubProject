package test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

public class TC006_File_Upload_Test {
    @Test
    public void File_Upload() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://the-internet.herokuapp.com/upload");
        File uploadFile = new File("src/main/resources/test-upload.txt");

        WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
        fileInput.sendKeys(uploadFile.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();
        driver.quit();
    }
}