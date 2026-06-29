package test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class TC013_WebTable_Test {
    @Test
    public void Verify_WebTable(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2021/08/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        List<WebElement> AllHeader = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
        System.out.println("Number of Headers="+AllHeader.size());
        Assert.assertEquals(AllHeader.size(),5,"Column count is not same");
        boolean status=false;
        for(WebElement side:AllHeader) {
            String value = side.getText();
            System.out.println(value);
            if (value.contains("Action")) {
                status = true;
                break;
            }
        }
        Assert.assertTrue(status,"Header is not present");
        List<WebElement> NumberRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        System.out.println("Number of Rows="+NumberRows.size());
        Assert.assertEquals(NumberRows.size(),7,"Rows count is not same");
        List<WebElement> AllDate = driver.findElements(By.xpath("//table[contains(@id,'customers')]//td"));
        System.out.println("Number of Data="+AllDate.size());
        Assert.assertEquals(AllDate.size(),30,"Record count is not same");
        boolean Datastatus=false;
        for(WebElement side:AllDate) {
            String value = side.getText();
            System.out.println(value);
            if (value.contains("Java")) {
                Datastatus = true;
                break;
            }
        }
        driver.quit();
    }
}
