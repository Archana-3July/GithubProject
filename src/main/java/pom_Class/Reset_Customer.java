package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Reset_Customer {
    WebDriver ldriver;
    public Reset_Customer(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//select[@id='accountSelect']")
    WebElement SelectAccount;
    @FindBy(xpath="//button[text()='Reset']") WebElement Reset_Button;
   public void verfiy_Select_AccNo(){
    Select s=new Select(SelectAccount);
       s.selectByVisibleText("1003");
  }
    public void Click_Reset_Button(){
       Reset_Button.click();
        System.out.println("Customer Account Reset Successfully");
    }
}
