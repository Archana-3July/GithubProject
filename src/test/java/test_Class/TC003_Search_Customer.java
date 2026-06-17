package test_Class;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom_Class.Add_Customer;
import pom_Class.Search_Customer;

public class TC003_Search_Customer extends BaseClass{

    @Test
    public void verify_Search_Customer() {
        driver.get(url);
        Add_Customer AC = new Add_Customer(driver);
        AC.Click_BankManagerLogin();
        System.out.println("Bank Manager Login is clicked..");
        Search_Customer SC = new Search_Customer(driver);
        SC.Click_Customer();
        System.out.println("Clicked on customer..");
        SC.Add_Value_Search();
        System.out.println("Added value in Search");
        SC.Click_Search();
    }
}
