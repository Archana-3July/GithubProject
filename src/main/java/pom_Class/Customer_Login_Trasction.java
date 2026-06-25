package pom_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Customer_Login_Trasction {
    WebDriver ldriver;
    //constructor
    public Customer_Login_Trasction(WebDriver rdriver) {
        ldriver=rdriver;
        //super(driver);
        PageFactory.initElements(rdriver,this);
    }
 //   @FindBy(xpath="//button[text()='Customer Login']")  WebElement CustomerLogin;
    @FindBy(xpath="//button[@ng-click='customer()']")  WebElement CustomerLogin;
    @FindBy(id="userSelect") WebElement UserSelect;
    @FindBy(xpath="//button[@type='submit']")  WebElement CustomerLoginSubmit;
    @FindBy(xpath="//button[@ng-click='transactions()']") WebElement Transction;

    public void Click_Customer_Login(){
        CustomerLogin.click();
        //CustomerLogin.click();
        Assert.assertTrue(CustomerLogin.isDisplayed());
    }
    public void Select_User_Name(){
        Select s = new Select(UserSelect);
        s.selectByValue("1");
        Assert.assertTrue(UserSelect.isDisplayed());
    }
    public void Click_Submit(){
        CustomerLoginSubmit.click();
        Assert.assertTrue(CustomerLoginSubmit.isDisplayed());
    }
    public void Click_Transaction(){
        Transction.click();
        Assert.assertTrue(Transction.isDisplayed());
    }

    public void StartDate(){
        WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(10));
        WebElement start = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("start")));
        start.sendKeys("01-01-2015");
        start.click();
    }
    public void EndDate(){
        WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(10));
        WebElement start = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("end")));
        start.sendKeys("02-01-2015");
        start.click();
    }



}
