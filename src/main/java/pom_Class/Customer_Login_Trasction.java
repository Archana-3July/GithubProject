package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Customer_Login_Trasction {
    WebDriver ldriver;
    //constructor
    public Customer_Login_Trasction(WebDriver rdriver) {
        ldriver=rdriver;
        //super(driver);
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//button[text()='Customer Login']")  WebElement CustomerLogin;
    @FindBy(id="userSelect") WebElement UserSelect;
    @FindBy(xpath="//button[@type='submit']")  WebElement CustomerLoginSubmit;
    @FindBy(xpath="//button[@ng-click='transactions()']") WebElement Transction;

    public void Click_Customer_Login(){

        CustomerLogin.click();
        Assert.assertTrue(CustomerLogin.isDisplayed());
    }
    public void Select_User_Name(){
        Select s = new Select(UserSelect);
        s.selectByValue("3");
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



}
