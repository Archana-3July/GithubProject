package test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class TC016_Assign_Leave_Test {
    @Test
    public void assign_Leave() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//button[@title='Assign Leave']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement employee = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@placeholder='Type for hints...']")));
        employee.sendKeys("Ravi");
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[text()='Ravi M B']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[contains(@class,'oxd-select-text')]")));
        driver.findElement(By.xpath("//div[contains(@class,'oxd-select-text--after')]")).click();
        driver.findElement(By.xpath("(//div[@role='option'])[2]")).click();
        //From Date
        driver.findElement(By.xpath("(//div[@class='oxd-date-input']//i)[1]")).click();
        driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']//i")).click();
        String month = "October";
        List<WebElement> months = driver.findElements(By.xpath("//ul[@class='oxd-calendar-dropdown']//li"));
        for (WebElement m : months) {
            //System.out.println("Month:'"+m.getText()+"'");
            if (m.getText().equalsIgnoreCase(month)) {
                m.click();
                break;
            }
        }

        driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']//i")).click();
        String year = "2010";
        List<WebElement> years = driver.findElements(By.xpath("//ul[@class='oxd-calendar-dropdown']//li"));
        for (WebElement y : years) {
            //System.out.println("Month:'"+m.getText()+"'");
            if (y.getText().equalsIgnoreCase(year)) {
                y.click();
                break;
            }
        }

        String day = "31";
        List<WebElement> SelectDay = driver.findElements(By.xpath("//div[@class='oxd-calendar-dates-grid']//div"));
        for (WebElement d : SelectDay) {
            //System.out.println("Month:'"+m.getText()+"'");
            if (d.getText().equalsIgnoreCase(day)) {
                d.click();
                break;
            }
        }

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.quit();
    }
}


