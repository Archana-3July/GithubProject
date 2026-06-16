package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Customer {
//create object of webdriver
	WebDriver ldriver;
	//constructor
	public Add_Customer(WebDriver rdriver) {
		ldriver=rdriver;
		//super(driver);
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//button[text()='Bank Manager Login']") WebElement BankManagerLogin;
	@FindBy(xpath="//button[@ng-click='addCust()']")  WebElement AddCustomerMenu;
	@FindBy(xpath="//input[@ng-model='fName']") WebElement FirstName;
	@FindBy(xpath="//input[@ng-model='lName']") WebElement LastName;
	@FindBy(xpath="//input[@ng-model='postCd']") WebElement PostCode;
	@FindBy(xpath="//button[text()='Add Customer']") WebElement AddCustomerButton;
	
	public void Click_BankManagerLogin() {
		BankManagerLogin.click();
	}
	
	public void Click_AddCustomerMenu() {
		AddCustomerMenu.click();
	}
	
	public void Add_FirstName(String FName) {
		FirstName.sendKeys(FName);
	}
	
	public void Add_LastName(String LName) {
		LastName.sendKeys(LName);
	}
	
	public void Add_PostCode(String PCode) {
		PostCode.sendKeys(PCode);
	}
	
	public void Click_AddCustomer() {
		AddCustomerButton.click();
		
	}
}
