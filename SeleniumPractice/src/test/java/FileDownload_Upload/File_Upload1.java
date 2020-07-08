package FileDownload_Upload;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class File_Upload1 extends File_Download1{
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");


    }

    @Test
    public void fileUpload(){
        String url="http://practice.cybertekschool.com/upload";
        String filePath = "/Users/ridvangunduz/Desktop/Cybertek.png";


       driver.get(url);
       WebElement chooseFile = driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
       chooseFile.sendKeys(filePath);

       driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
