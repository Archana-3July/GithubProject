package test_Class;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class TC011_Date_Picker_Transcation {
    @Test
    public void verify_DatePicker() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Google-Calendar-Like-jQuery-Data-Time-Range-Picker-datepair/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String year = "2020";
        String month = "Jul";
        String Date = "10";
        String ExpectedDate="7/10/2020";
        driver.findElement(By.xpath("//input[@class='date start']")).click();
        driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).click();
        while (true) {
             String Current_Year=driver.findElement(By.xpath("(//th[contains(@class,'datepicker-switch')])[2]")).getText();
             if(Current_Year.contains(year))
            {
                break;
            }
            driver.findElement(By.xpath("(//th[contains(@class,'prev')])[2]")).click();
        }

        List<WebElement> months = driver.findElements(By.xpath("//span[contains(@class,'month')]"));
        for (WebElement m : months)
        {
            //System.out.println("Month:'"+m.getText()+"'");
            if (m.getText().equalsIgnoreCase(month))
            {
                m.click();
                break;
            }
        }

        List<WebElement> day = driver.findElements(By.xpath("//td[contains(@class,'day')]"));
        for(WebElement d : day)
        {
           // System.out.println("Day:'"+d.getText()+"'");
            if(d.getText().equalsIgnoreCase(Date))
            {
                d.click();
                break;
            }
        }
        WebElement date = driver.findElement(By.xpath("//input[@class='date start']"));
        //System.out.println("getText() = " + date.getText());
        System.out.println("Actual Selected Date = " + date.getAttribute("value"));
        Assert.assertEquals(ExpectedDate,date.getAttribute("value"));
        driver.quit();
    }
}

