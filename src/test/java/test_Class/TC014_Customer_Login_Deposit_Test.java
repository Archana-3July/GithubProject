package test_Class;

import org.testng.annotations.Test;
import pom_Class.*;
public class TC014_Customer_Login_Deposit_Test extends BaseClass{
    @Test
    public void verify_Add_Deposit_Amount(){
        driver.get(url);
        Customer_Login CLT=new Customer_Login(driver);
        CLT.Click_Customer_Login();
        CLT.Select_User_Name();
        CLT.Click_Submit();
        Customer_Login_Deposit CLD=new Customer_Login_Deposit(driver);
        CLD.Click_Deposit_Menu();
        CLD.Add_Amount_Deposite();
        CLD.Click_Deposit_Submit();
        System.out.println("Deposit Successfully");
    }
}
