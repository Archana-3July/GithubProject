package test_Class;

import org.testng.annotations.Test;
import pom_Class.Add_Customer;
import pom_Class.Search_Customer;

public class TC003_Search_Customer extends BaseClass{
    @Test
    public void verify_Search_Customer() {
        driver.get(url);
        Add_Customer AC = new Add_Customer(driver);
        AC.Click_BankManagerLogin();
        Search_Customer SC = new Search_Customer(driver);
        SC.Click_Customer();
        SC.Add_Value_Search();
        SC.Click_Search();
    }

}
