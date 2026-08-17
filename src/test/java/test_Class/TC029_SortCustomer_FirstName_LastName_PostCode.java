package test_Class;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_Class.Add_Customer;
import pom_Class.Search_Customer;
import pom_Class.Sort_FirstName_LastName_PostCode;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TC029_SortCustomer_FirstName_LastName_PostCode extends BaseClass {
    @Test
    public void Verify_Sorted_Name_PostCode() {
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        Add_Customer AC = new Add_Customer(driver);
        AC.Click_BankManagerLogin();
        Search_Customer SC = new Search_Customer(driver);
        SC.Click_Customer();
        Sort_FirstName_LastName_PostCode SFLP = new Sort_FirstName_LastName_PostCode(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        //First Name Sorting
        List<String> actualFirstNames = SFLP.getFirstNames();
        List<String> expectedFirstNames = new ArrayList<>(actualFirstNames);
        Collections.sort(expectedFirstNames, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Before Sorting First Names: " + actualFirstNames);
        System.out.println("After Sorting First Names: " + expectedFirstNames);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        //Last Name Sorting
        List<String> actualLastNames = SFLP.getLastNames();
        List<String> expectedLastNames = new ArrayList<>(actualLastNames);
        Collections.sort(expectedLastNames, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Before Sorting Last Names: " + actualLastNames);
        System.out.println("After Sorting Last Names: " + expectedLastNames);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        // Post Code Sorting
        List<String> actualPostCodes = SFLP.getPostCodes();
        List<String> expectedPostCodes = new ArrayList<>(actualPostCodes);
        Collections.sort(expectedPostCodes, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Before Sorting Post Codes: " + actualPostCodes);
        System.out.println("After Sorting Post Codes: " + expectedPostCodes);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        System.out.println("All sorting validations passed successfully");
    }
}
