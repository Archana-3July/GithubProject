package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Open_Customer {
    //create object of webdriver
    WebDriver ldriver;
     //constructor
     public Open_Customer(WebDriver rdriver) {
    	 ldriver=rdriver;
         //super(driver);
         PageFactory.initElements(rdriver,this);
     }
     
     @FindBy(xpath="//button[@ng-click='openAccount()']")  WebElement OpenAccountMenu;
     @FindBy(css="#userSelect")  WebElement SelectCustomer;
     @FindBy(css="#currency")    WebElement SelectCurrency;
     @FindBy(xpath="//button[@type='submit']") WebElement ProcessButton;
     
     public void Click_OpenAccountMenu() {
 		OpenAccountMenu.click();
 	}
     
     public void Select_Customer(String Customer_Name) {
    	 Select s=new Select(SelectCustomer);
	      s.selectByVisibleText(Customer_Name);
     }
     
     public void Select_Currency(String Curency) {
    	 Select s1=new Select(SelectCurrency);
	      s1.selectByVisibleText(Curency);
     }
     
     public void Process_Button() {
    	 ProcessButton.click();
     }
}
