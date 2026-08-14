package test_Class;

import org.testng.annotations.Test;
import pom_Class.Customer_Login;
import pom_Class.Customer_Login_Trasction;
import pom_Class.ScrollRight_Transction_Customer;

public class TC027_Scroll_Left_Right_Transction_Test extends BaseClass{
    @Test
    public void verify_ScrollLeftRight_Trasnsction(){
        driver.get(url);
        driver.manage().window().maximize();
        Customer_Login CL=new Customer_Login(driver);
        CL.Click_Customer_Login();
        CL.Select_User_Name();
        CL.Click_Submit();
        Customer_Login_Trasction CLT=new Customer_Login_Trasction(driver);
        CLT.Click_Transaction();
        ScrollRight_Transction_Customer STC=new ScrollRight_Transction_Customer(driver);
        STC.Click_Scroll_Right();
        STC.Click_Scroll_Right();
        STC.Click_Scroll_Right();
        STC.Click_Scroll_Left();
        STC.Click_Scroll_Left();
        STC.Click_Scroll_Top();
    }
}
