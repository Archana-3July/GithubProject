package test_Class;
import org.testng.annotations.Test;

 import pom_Class.Add_Customer;

public class TC001_Add_Customer_Test extends BaseClass{
     @Test
	public void verify_AddCustomer()
	{
		driver.get(url);
		Add_Customer AC=new Add_Customer(driver);
		AC.Click_BankManagerLogin();
		AC.Click_AddCustomerMenu();
		AC.Add_FirstName("ABC");
		AC.Add_LastName("XYZ");
		AC.Add_PostCode("415110");
		AC.Click_AddCustomer();

	}




}
