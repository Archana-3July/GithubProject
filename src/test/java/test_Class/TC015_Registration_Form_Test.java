package test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC015_Registration_Form_Test {
    @Test
    public void registration_Form(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/fast-easy-tiny-validate/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.id("project-name")).sendKeys("RBL Bank");
        driver.findElement(By.id("project-bud")).sendKeys("5000");
        driver.findElement(By.id("project-zip")).sendKeys("41511");
        WebElement Project_Type = driver.findElement(By.id("project-type"));
        Select s=new Select(Project_Type);
        s.selectByVisibleText("good");
        driver.findElement(By.id("project-desc")).sendKeys("Core Bank Domain");
        driver.findElement(By.xpath("//input[@value='Submit Form']")).click();

    }

}
