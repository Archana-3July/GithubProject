package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_BankManager_Customer {
    WebDriver ldriver;
    public Delete_BankManager_Customer(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
@FindBy(xpath="(//button[text()='Delete'])[last()]")
    WebElement Delete_Customer;
    public void Click_Delete_Customer(){
        Delete_Customer.click();
        System.out.println("Customer Account is delete");
    }
}
