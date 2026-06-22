package test_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class TC005_File_Download_Test{
    public static void main(String[] args){
         WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='File Download']")).click();
           driver.findElement(By.xpath("//a[text()='sample-zip-file.zip']")).click();
        File file = new File("C:\\Users\\Archana Satpute\\Downloads\\sample-zip-file.zip");
        if(file.exists())
        {
            System.out.println("File downloaded successfully");
        }
        else
        {
            System.out.println("Download failed");
        }
        driver.quit();
        }

}





