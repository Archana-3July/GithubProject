package test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.time.Duration;

public class TC022_ResizablePractice_Test {
    @Test
    public void resizable_practice(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://xqa.io/practice/resizable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        WebElement Resizable = driver.findElement(By.xpath("//div[text()='Resize me']"));
        int oldWidth = Resizable.getSize().getWidth();
        System.out.println("Old Width="+oldWidth);
        int oldHeight = Resizable.getSize().getHeight();
        System.out.println("Old Height="+oldHeight);
        Actions action=new Actions(driver);
        action.moveToElement(Resizable,oldWidth/2-1,oldHeight/2-1)
                .clickAndHold().moveByOffset(500,80).release().perform();
        int newWidth=Resizable.getSize().getWidth();
        System.out.println("New Width="+newWidth);
        int newHeight=Resizable.getSize().getHeight();
        System.out.println("New Height="+newHeight);
        driver.quit();
    }
}
