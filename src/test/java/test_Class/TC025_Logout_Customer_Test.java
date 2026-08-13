package test_Class;

import org.testng.annotations.Test;
import pom_Class.Customer_Login;
import pom_Class.Logout_Customer;

import java.time.Duration;

public class TC025_Logout_Customer_Test extends BaseClass {
    @Test
    public void verify_Logout(){
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        Customer_Login CL=new Customer_Login(driver);
        CL.Click_Customer_Login();
        CL.Select_User_Name();
        CL.Click_Submit();
        System.out.println("Customer Login Successfully");
        Logout_Customer LC=new Logout_Customer(driver);
        LC.logout_Customer();
        System.out.println("Customer Logout Successfully");
    }
}
