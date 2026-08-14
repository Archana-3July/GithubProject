package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollRight_Transction_Customer {
    WebDriver ldriver;
    public ScrollRight_Transction_Customer(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//button[@ng-click='scrollRight()']")
    WebElement Scroll_Right;
    @FindBy(xpath="//button[@ng-click='scrollLeft()']") WebElement Scroll_Left;
    @FindBy(xpath="//button[@ng-click='scrollTop()']") WebElement Scroll_Top;
     public void Click_Scroll_Right(){
         Scroll_Right.click();
     }
     public void Click_Scroll_Left(){
         Scroll_Left.click();
     }
     public void Click_Scroll_Top(){
         Scroll_Top.click();
     }


}
