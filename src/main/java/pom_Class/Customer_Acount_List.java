package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Customer_Acount_List {
    WebDriver ldriver;
    public Customer_Acount_List(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//select[@id='accountSelect']")
    WebElement SelectAccount;
    @FindBy(xpath="//div[contains(text(),'Account Number')]//strong[1]")
    WebElement AccountNo;
    @FindBy(xpath="//div[contains(text(),'Account Number')]//strong[2]")
    WebElement Balance;
    @FindBy(xpath="//div[contains(text(),'Account Number')]//strong[3]")
    WebElement Currency;
    public void Select_Account_List(){
        Select s=new Select(SelectAccount);
        s.selectByVisibleText("1001");
    }
    public void verify_AccNo_Balance_Currency(){
        String Acc_No = AccountNo.getText();
        System.out.println("Account Number : " + Acc_No);
        String Acc_Balance = Balance.getText();
        System.out.println("Balance : " + Acc_Balance);
        String Acc_Currency = Currency.getText();
        System.out.println("Currency : " + Acc_Currency);
    }
}
