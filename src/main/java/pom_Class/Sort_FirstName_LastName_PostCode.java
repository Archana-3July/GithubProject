package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_FirstName_LastName_PostCode {
    WebDriver ldriver;

    public Sort_FirstName_LastName_PostCode(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//table/tbody/tr/td[1]")
    List<WebElement> FirstNames_Column;
    @FindBy(xpath="//table/tbody/tr/td[2]") List<WebElement> LastName_Column;
    @FindBy(xpath="//table/tbody/tr/td[3]") List<WebElement> PostCode_Column;
    //Get First Name
    public List<String> getFirstNames(){
        List<String> firstNames = new ArrayList<>();
        for (WebElement element : FirstNames_Column) {
            firstNames.add(element.getText().trim());
        }
        return firstNames;
    }
    // Get Last Names
    public List<String> getLastNames() {
         List<String> lastNames = new ArrayList<>();
        for (WebElement element : LastName_Column) {
            lastNames.add(element.getText().trim());
        }
        return lastNames;
    }
    // Get Post Codes
    public List<String> getPostCodes() {
        List<String> postCodes = new ArrayList<>();
        for (WebElement element :PostCode_Column) {
            String value = element.getText().trim();
            if (!value.isEmpty()) {
                postCodes.add(value);
            }
        }
        return postCodes;
    }
}
