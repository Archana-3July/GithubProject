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
	//@FindBy(xpath="//input[@ng-model='fName']") WebElement FirstName;
	@FindBy(xpath="//input[@placeholder='First Name']")  WebElement FirstName;;
	@FindBy(xpath="//input[@ng-model='lName']") WebElement LastName;
	@FindBy(xpath="//input[@ng-model='postCd']") WebElement PostCode;
	@FindBy(xpath="//button[text()='Add Customer']") WebElement AddCustomerButton;
	
	public void Click_BankManagerLogin() {
		BankManagerLogin.click();
	}
	
	public void Click_AddCustomerMenu() {
		AddCustomerMenu.click();
	}
	
	public void Add_FirstName(String fName) {
		FirstName.sendKeys(fName);
	}
	
	public void Add_LastName(String lName) {
		LastName.sendKeys(lName);
	}
	
	public void Add_PostCode(String pCode) {
		PostCode.sendKeys(pCode);
	}
	
	public void Click_AddCustomer() {
		AddCustomerButton.click();
	}
}
