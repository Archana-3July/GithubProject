package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Customer {
    WebDriver ldriver;
    public Logout_Customer(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//button[@ng-show='logout']")
    WebElement LogOut;
    public void logout_Customer(){
        LogOut.click();
    }
}
