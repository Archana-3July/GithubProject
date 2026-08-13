package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_Login_Withdrawl {
    WebDriver ldriver;
    public Customer_Login_Withdrawl(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//button[@ng-click='withdrawl()']")
    WebElement WithdrawlButton;
    @FindBy(xpath="//input[@ng-model='amount']") WebElement WithdrawlAmount;
    @FindBy(xpath="//button[@type='submit']") WebElement SubmitWithdrawl;
    public void Click_Withdrawl_Menu(){
        WithdrawlButton.click();
    }
    public void Add_Amount_Withdrawl(){
        WithdrawlAmount.sendKeys("2000");
    }
    public void Submit_Withdrawl(){
        SubmitWithdrawl.click();
    }
}
