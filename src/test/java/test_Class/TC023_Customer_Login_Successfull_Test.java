package test_Class;
import org.testng.annotations.Test;
import pom_Class.Customer_Login;
import java.time.Duration;

public class TC023_Customer_Login_Successfull_Test extends BaseClass {
    @Test
    public void verify_Customer_Login() {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        Customer_Login CL=new Customer_Login(driver);
        CL.Click_Customer_Login();
        CL.Select_User_Name();
        CL.verify_Customer();
        CL.Click_Submit();
        System.out.println("Customer Login Successfully");
    }
}
