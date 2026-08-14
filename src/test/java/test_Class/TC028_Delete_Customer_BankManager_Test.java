package test_Class;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pom_Class.Add_Customer;
import pom_Class.Delete_BankManager_Customer;
import pom_Class.Search_Customer;

public class TC028_Delete_Customer_BankManager_Test extends BaseClass{
    @Test
    public void verify_Delete_CustomerAccount(){
        driver.get(url);
        driver.manage().window().maximize();
        Add_Customer AC=new Add_Customer(driver);
        AC.Click_BankManagerLogin();
        AC.Click_AddCustomerMenu();
        AC.Add_FirstName(firstName);
        AC.Add_LastName(lastName);
        AC.Add_PostCode(postCode);
        AC.Click_AddCustomer();
        System.out.println("Added successfully");
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert: " + alert.getText());
        alert.accept();
        Search_Customer SC=new Search_Customer(driver);
        SC.Click_Customer();
        Delete_BankManager_Customer DBC=new Delete_BankManager_Customer(driver);
        DBC.Click_Delete_Customer();
    }
}
