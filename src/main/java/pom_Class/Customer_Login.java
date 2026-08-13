package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Customer_Login {
    WebDriver ldriver;
    public Customer_Login(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//button[@ng-click='customer()']")  WebElement CustomerLogin;
    @FindBy(id="userSelect") WebElement UserSelect;
    @FindBy(xpath = "//option[text()='Hermoine Granger']")
    WebElement ActualCustomerName;
    @FindBy(xpath="//button[@type='submit']")  WebElement CustomerLoginSubmit;
    @FindBy(xpath ="//span[text()='Hermoine Granger']")
    WebElement Expected_CustomerName;
    public void Click_Customer_Login(){
        CustomerLogin.click();
        //CustomerLogin.click();
        Assert.assertTrue(CustomerLogin.isDisplayed());
    }
    public void Select_User_Name() {
        Select s = new Select(UserSelect);
        s.selectByValue("1");
    }
    public void verify_Customer(){
        String Actual_CustomeName = ActualCustomerName.getText();
        System.out.println("Customer Name: " + Actual_CustomeName);
        System.out.println("Customer name verification passed.");
        Assert.assertEquals(Actual_CustomeName, "Hermoine Granger");
    }
    public void Click_Submit(){
        CustomerLoginSubmit.click();
        Assert.assertTrue(CustomerLoginSubmit.isDisplayed());
    }

}
