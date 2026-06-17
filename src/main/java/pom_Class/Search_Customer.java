package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Customer {
    WebDriver ldriver;
    //constructor
    public Search_Customer(WebDriver rdriver) {
        ldriver=rdriver;
        //super(driver);
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//button[@ng-click='showCust()']")
    WebElement Select_Customer;
    @FindBy(xpath="//input[@placeholder='Search Customer']")  WebElement Select_Search;

    public void Click_Customer() {
        Select_Customer.click();
    }

    public void Add_Value_Search(){
        Select_Search.sendKeys("Hermoine");
    }

    public void Click_Search(){
        Select_Search.click();
    }

}
