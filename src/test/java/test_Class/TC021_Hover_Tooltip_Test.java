package test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC021_Hover_Tooltip_Test {
    @Test
    public void hover_tooltip() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/smart-arrow-positioning-hover-me/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        Actions act = new Actions(driver);
        WebElement Hover_Top = driver.findElement(By.xpath("//button[text()='Hover Top']"));
        act.moveToElement(Hover_Top).perform();
        Thread.sleep(1000);
        System.out.println("\u001B[34mThe Data Title of "+ Hover_Top.getText()+" = "+Hover_Top.getAttribute("data-title")+"\u001B[0m");
        WebElement Hover_Bottom = driver.findElement(By.xpath("//button[text()='Hover Bottom']"));
        act.moveToElement(Hover_Bottom).perform();
        Thread.sleep(1000);
        System.out.println("\u001B[34mThe Data Title of "+ Hover_Bottom.getText()+" ="+Hover_Bottom.getAttribute("data-title")+"\u001B[0m");

        WebElement Hover_Left_Red = driver.findElement(By.xpath("//button[text()='Wide Button Left (Red)']"));
        act.moveToElement(Hover_Left_Red).perform();
        Thread.sleep(1000);
        System.out.println("\u001B[31mThe Data Title of "+ Hover_Left_Red.getText()+" ="+Hover_Left_Red.getAttribute("data-title")+"\u001B[0m");

        WebElement Hover_Right_Green = driver.findElement(By.xpath("//button[text()='Right (Green)']"));
        act.moveToElement(Hover_Right_Green).perform();
        Thread.sleep(1000);
        System.out.println("\u001B[32mThe Data Title of "+ Hover_Right_Green.getText()+" ="+Hover_Right_Green.getAttribute("data-title")+"\u001B[0m");

        WebElement HoverNarrow_Purple = driver.findElement(By.xpath("//button[text()='Narrow (Purple)']"));
        act.moveToElement(HoverNarrow_Purple).perform();
        Thread.sleep(1000);
        System.out.println("\u001B[35mThe Data Title of "+ HoverNarrow_Purple.getText()+" ="+HoverNarrow_Purple.getAttribute("data-title")+"\u001B[0m");

        WebElement HoverWide_Blue = driver.findElement(By.xpath("//button[text()='Very Wide Button Bottom']"));
        act.moveToElement(HoverWide_Blue).perform();
        Thread.sleep(1000);
        System.out.println("\u001B[34mThe Data Title of "+ HoverWide_Blue.getText()+" = "+HoverWide_Blue.getAttribute("data-title")+"\u001B[0m");

        WebElement Hover_Orange = driver.findElement(By.xpath("//button[text()='Orange Tooltip']"));
        act.moveToElement(Hover_Orange).perform();
        Thread.sleep(1000);
        System.out.println("\u001B[38;5;208mThe Data Title of "+ Hover_Orange.getText()+" = "+Hover_Orange.getAttribute("data-title")+"\u001B[0m");

        WebElement Hover_Dark = driver.findElement(By.xpath("//button[text()='Dark Tooltip']"));
        act.moveToElement(Hover_Dark).perform();
        Thread.sleep(1000);
        System.out.println("\u001B[90mThe Data Title of "+ Hover_Dark.getText()+" ="+Hover_Dark.getAttribute("data-title")+"\u001B[0m");

        WebElement Hover_Success = driver.findElement(By.xpath("//button[text()='Success Tooltip']"));
        act.moveToElement(Hover_Success).perform();
        Thread.sleep(1000);
        System.out.println("\u001B[32mThe Data Title of "+ Hover_Success.getText()+" = "+Hover_Success.getAttribute("data-title")+"\u001B[0m" );
        driver.quit();
    }

}
