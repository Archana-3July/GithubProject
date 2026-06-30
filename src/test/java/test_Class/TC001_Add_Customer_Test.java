package test_Class;
import org.testng.annotations.Test;

 import pom_Class.Add_Customer;

import java.time.Duration;

public class TC001_Add_Customer_Test extends BaseClass{
     @Test
	public void verify_AddCustomer()
	{
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Add_Customer AC=new Add_Customer(driver);
		AC.Click_BankManagerLogin();
		AC.Click_AddCustomerMenu();
		AC.Add_FirstName(firstName);
		AC.Add_LastName(lastName);
		AC.Add_PostCode(postCode);
		AC.Click_AddCustomer();
		System.out.println("Added successfully");
	}
}
