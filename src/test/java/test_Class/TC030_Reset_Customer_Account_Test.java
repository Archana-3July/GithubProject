package test_Class;

import org.testng.annotations.Test;
import pom_Class.*;
import java.time.Duration;

public class TC030_Reset_Customer_Account_Test extends BaseClass{
    @Test
    public void Verify_Reset_Customer(){
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        Customer_Login CL=new Customer_Login(driver);
        CL.Click_Customer_Login();
        CL.Select_User_Name();
        CL.Click_Submit();
        Reset_Customer RC=new Reset_Customer(driver);
        RC.verfiy_Select_AccNo();
        Deposit_Customer DC = new Deposit_Customer(driver);
        DC.Click_DepositeMenu();
        DC.Add_Deposite();
        DC.Click_DepositeButton();
        DC.Add_Deposite();
        DC.Click_DepositeButton();
        DC.Add_Deposite();
        DC.Click_DepositeButton();
        DC.Add_Deposite();
        DC.Click_DepositeButton();
        Customer_Login_Trasction CLT =new Customer_Login_Trasction(driver);
        CLT.Click_Transaction();
        RC.Click_Reset_Button();
    }

}
