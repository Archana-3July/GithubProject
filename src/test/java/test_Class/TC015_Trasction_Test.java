package test_Class;

import org.testng.annotations.Test;
import pom_Class.Customer_Login_Trasction;
import java.time.Duration;

public class TC015_Trasction_Test extends BaseClass {

    @Test
    public void verify_Customer_Login_trasnction() {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        Customer_Login_Trasction CLT = new Customer_Login_Trasction(driver);
        CLT.Click_Customer_Login();
        System.out.println("Login successfully..");
        CLT.Select_User_Name();
        CLT.Click_Submit();
        System.out.println("Select User");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        CLT.Click_Transaction();
        System.out.println("Click on Transction");
        CLT.StartDate();
        System.out.println("Enter Start Date");
        CLT.EndDate();
        System.out.println("Enter End Date");

    }
}