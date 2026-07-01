package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_Login_Deposit {
    WebDriver ldriver;
    public Customer_Login_Deposit(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//button[@ng-click='deposit()']")
    WebElement DepositButton;
    @FindBy(xpath="//input[@ng-model='amount']")  WebElement AddAmount;
    @FindBy(xpath="//button[text()='Deposit']")  WebElement DepositSubmit;

    public void Click_Deposit_Menu(){
        DepositButton.click();
    }
    public void Add_Amount_Deposite(){
        AddAmount.sendKeys("1000");
    }
    public void Click_Deposit_Submit(){
        DepositSubmit.click();
    }

}
