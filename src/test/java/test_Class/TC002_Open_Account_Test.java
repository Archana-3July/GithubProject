package test_Class;

import java.time.Duration;

import org.testng.annotations.Test;
import pom_Class.Open_Customer;
import pom_Class.Add_Customer;
public class TC002_Open_Account_Test extends BaseClass {
	    @Test
	    public void verify_OpenAccount()
	    {
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			Add_Customer AC=new Add_Customer(driver);
			AC.Click_BankManagerLogin();
	    	Open_Customer OC=new Open_Customer(driver);
	    	OC.Click_OpenAccountMenu();
	    	OC.Select_Customer(customerName);
	    	OC.Select_Currency(currency);
			OC.Process_Button();
	    }
}
