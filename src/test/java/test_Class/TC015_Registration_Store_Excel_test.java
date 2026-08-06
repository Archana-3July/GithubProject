package test_Class;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class TC015_Registration_Store_Excel_test {
    @Test
    public void registration_store_excel() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String filePath = "testdata/Data_Resignation.xlsx";

        String[][] registration = {
                {"Archana", "Satpute", "Pune", "arc123@gmail.com", "9834567898", "Female", "Movies", "English", "Adobe Photoshop", "India", "xyz@123"},
                {"Rahul", "Patil", "Kolhapur", "rahul123@gmail.com", "9876543234", "Male", "Cricket", "English", "Java", "India", "abc@123"},
                {"Sneha", "Shinde", "Mumbai", "sneha123@gmail.com", "8765432112", "Female", "Hockey", "English", "SQL", "India", "test@123"}
        };

        driver.get("https://demo.automationtesting.in/Register.html");

        for (String[] data : registration) {
            String FirstName = data[0];
            String LastName = data[1];
            String Address = data[2];
            String EmailID = data[3];
            String PhoneNo = data[4];
            String Gender = data[5];
            String Hobbies = data[6];
            String Lang = data[7];
            String Skills = data[8];
            String Country = data[9];
            String Pass = data[10];

            driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(FirstName);
            driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LastName);
            driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(Address);
            driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(EmailID);
            driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(PhoneNo);
            if (Gender.equalsIgnoreCase("Female")) {
                driver.findElement(By.xpath("//input[@value='FeMale']")).click();
            } else {
                WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
                WebElement male=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Male']")));
                male.click();
                //driver.findElement(By.xpath("//input[@value='Male']")).click();
            }
            if (Hobbies.equalsIgnoreCase("Cricket")) {
                driver.findElement(By.id("checkbox1")).click();
            } else if (Hobbies.equalsIgnoreCase("Movies ")) {
                driver.findElement(By.id("checkbox2")).click();
            } else {
                driver.findElement(By.id("checkbox3")).click();
            }
            driver.findElement(By.id("msdd")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            if (Lang.equalsIgnoreCase("English")) {
              WebElement english = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.xpath("//*[normalize-space()='English']")
                        ));
                english.click();
            }

            Select s = new Select(driver.findElement(By.id("Skills")));
            s.selectByVisibleText("Adobe Photoshop");

            Select s1 = new Select(driver.findElement(By.id("country")));
            s1.selectByVisibleText("India");

            WebElement SelectYear = driver.findElement(By.id("yearbox"));
            Select s2 = new Select(SelectYear);
            s2.selectByVisibleText("2015");
            WebElement SelectMonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
            Select s3 = new Select(SelectMonth);
            s3.selectByVisibleText("July");
            WebElement SelectDay = driver.findElement(By.id("daybox"));
            Select s4 = new Select(SelectDay);
            s4.selectByVisibleText("4");

            WebElement First_Pass = driver.findElement(By.id("firstpassword"));
            First_Pass.sendKeys(Pass);
            driver.findElement(By.id("secondpassword")).sendKeys("xyz@123");

            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement submitButton = wait1.until(
                    ExpectedConditions.elementToBeClickable(By.id("submitbtn"))
            );

            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView({block:'center'});",
                            submitButton);

            submitButton.click();
            WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
            WebElement refreshButton=wait2.until(ExpectedConditions.elementToBeClickable(By.id("Button1")));
            refreshButton.click();
            writeDataToExcel(filePath, FirstName, LastName, Address, EmailID, PhoneNo, Gender, Hobbies, Lang, Skills, Country, Pass);
            System.out.println("Registration successfully");
        }
        driver.quit();
    }
        public void writeDataToExcel(String filePath,String FirstName, String LastName, String Address,String Email, String Phone, String Gender,
                                     String Hobbies, String Language, String Skills, String Country, String Password)throws IOException
     {
         Workbook workbook;
         Sheet sheet;
         File file=new File(filePath);
         if(file.exists()){
             FileInputStream inputStream=new FileInputStream(file);
             workbook=new XSSFWorkbook(inputStream);
             sheet=workbook.getSheet("Registration Data");
             inputStream.close();
         }else {
             workbook = new XSSFWorkbook();
             sheet = workbook.getSheet("Registration Data");
             Row header = sheet.createRow(0);
             header.createCell(0).setCellValue("First Name");
             header.createCell(1).setCellValue("Last Name");
             header.createCell(2).setCellValue("Address");
             header.createCell(3).setCellValue("Email");
             header.createCell(4).setCellValue("Phone");
             header.createCell(5).setCellValue("Gender");
             header.createCell(6).setCellValue("Hobbies");
             header.createCell(7).setCellValue("Language");
             header.createCell(8).setCellValue("Skills");
             header.createCell(9).setCellValue("Country");
             header.createCell(10).setCellValue("Password");
         }
         int rowNumber=sheet.getLastRowNum()+1;
        Row data=sheet.createRow(rowNumber);
        data.createCell(0).setCellValue(FirstName);
        data.createCell(1).setCellValue(LastName);
        data.createCell(2).setCellValue(Address);
        data.createCell(3).setCellValue(Email);
        data.createCell(4).setCellValue(Phone);
        data.createCell(5).setCellValue(Gender);
        data.createCell(6).setCellValue(Hobbies);
        data.createCell(7).setCellValue(Language);
        data.createCell(8).setCellValue(Skills);
        data.createCell(9).setCellValue(Country);
        data.createCell(10).setCellValue(Password);

        FileOutputStream outputStream=new FileOutputStream(filePath);
        workbook.write(outputStream);
        outputStream.close();
        workbook.close();
         System.out.println("Data added in Excel Row:"+rowNumber);
    }

}
