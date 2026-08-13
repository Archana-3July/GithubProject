package test_Class;

import org.testng.annotations.Test;
import pom_Class.Customer_Acount_List;
import pom_Class.Customer_Login;

import java.time.Duration;

public class TC026_Customer_List_Account_Test extends BaseClass{
    @Test
    public void verify_Customer_ListAccount(){
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        Customer_Login CL =new Customer_Login(driver);
        CL.Click_Customer_Login();
        CL.Select_User_Name();
        CL.Click_Submit();
        Customer_Acount_List CAL=new Customer_Acount_List(driver);
        CAL.Select_Account_List();
        CAL.verify_AccNo_Balance_Currency();
    }
}
