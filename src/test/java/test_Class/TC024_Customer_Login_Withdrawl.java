package test_Class;

import org.testng.annotations.Test;
import pom_Class.Customer_Login;
import pom_Class.Customer_Login_Withdrawl;

import java.time.Duration;

public class TC024_Customer_Login_Withdrawl extends BaseClass{
    @Test
    public void verify_withdrawl(){
      driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        Customer_Login CL=new Customer_Login(driver);
        CL.Click_Customer_Login();
        CL.Select_User_Name();
        CL.Click_Submit();
        Customer_Login_Withdrawl CLW = new Customer_Login_Withdrawl(driver);
        CLW.Click_Withdrawl_Menu();
        CLW.Add_Amount_Withdrawl();
        CLW.Submit_Withdrawl();
        System.out.println("Withdrawl Successfully");
    }
}
