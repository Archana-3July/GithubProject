package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deposit_Customer {
    WebDriver ldriver;
    //constructor
    public Deposit_Customer(WebDriver rdriver) {
        ldriver=rdriver;
        //super(driver);
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//button[@ng-click='deposit()']") WebElement DepositeMenu;
    @FindBy(xpath="//input[@placeholder='amount']") WebElement AddAmount;
    @FindBy(xpath = "//button[text()='Deposit']") WebElement DepositButton;

    public void Click_DepositeMenu(){
        DepositeMenu.click();
    }
    public void Add_Deposite(){
        AddAmount.sendKeys("1000");
    }
    public void Click_DepositeButton(){
        DepositButton.click();
    }




}
