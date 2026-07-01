package test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;


public class TC008_Writing_Data_From_Xcel_Test {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/?utm_source=chatgpt.com#/manager/addCust");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "LoginData")
    public void loginTest(String fname,String lname,String pin){
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/?utm_source=chatgpt.com#/manager/addCust");
        WebElement FName = driver.findElement(By.xpath("//input[@ng-model='fName']"));
        FName.sendKeys(fname);
        WebElement LName = driver.findElement(By.xpath("//input[@ng-model='lName']"));
        LName.sendKeys(lname);
        WebElement Pin = driver.findElement(By.xpath("//input[@ng-model='postCd']"));
        Pin.sendKeys(pin);
        driver.findElement(By.xpath("//button[text()='Add Customer']"));
    }
     @DataProvider(name="LoginData")
    public String[][] getData() throws IOException {
//        String loginData[][] = {
//        {
//            "Archana", "Satpute", "415110"
//        }
//    };
         String path="C:\\Users\\Archana Satpute\\IdeaProjects\\MyProject\\testdata\\Data_Customer.xlsx";
         Writing_Data_From_Excel WDE=new Writing_Data_From_Excel(path);
         int TotalRows=WDE.getRowCount("Sheet1");
         int TotalCols=WDE.getCellCount("Sheet1",1);
         String loginData[][]=new String[TotalRows][TotalCols];
         for(int i=1;i<=TotalRows;i++){
             for(int j=0;j<TotalCols;j++){
                 loginData[i-1][j]=WDE.getCellData("Sheet1",i,j);
             }
             System.out.println();
         }
        return loginData;
    }
    @AfterMethod
    void Browser_Close(){
        driver.quit();
    }
}


