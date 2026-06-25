package test_Class;

import org.testng.annotations.Test;
import pom_Class.Customer_Login_Trasction;
import pom_Class.Deposit_Customer;

public class TC012_Deposite_Test extends BaseClass{
  @Test
    public void Verify_Deposite_Click(){
        driver.get(url);
        Customer_Login_Trasction  CLT=new Customer_Login_Trasction(driver);
        CLT.Click_Customer_Login();
        CLT.Select_User_Name();
        CLT.Click_Submit();

        Deposit_Customer DC = new Deposit_Customer(driver);
         DC.Click_DepositeMenu();
         DC.Add_Deposite();
         DC.Click_DepositeButton();

    }
}
