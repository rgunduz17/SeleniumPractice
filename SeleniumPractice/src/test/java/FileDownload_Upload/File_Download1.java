package FileDownload_Upload;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class File_Download1 {
    WebDriver driver;
   static public File folder;
    Faker faker;
    @BeforeMethod
    public void setUp(){
        faker= new Faker();
        folder = new File(faker.file().fileName("download","file","txt",null));
     //   folder.mkdir();



        // Chrome:

        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<String, Object>();

        prefs.put("profile.default_content_settings.popups",0);
        prefs.put("download.default_directory",folder.getAbsolutePath());

     //   System.out.println(folder.getAbsolutePath());

        options.setExperimentalOption("prefs", prefs);
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);


        driver = new ChromeDriver(cap);

    }



    @Test
    public void fileDownload() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/download");

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[3]")).click();

        Thread.sleep(2000);

        File[] listOfFiles = folder.listFiles();

        System.out.println(listOfFiles[listOfFiles.length-1]);
//        Assert.assertTrue(listOfFiles.length>0);
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
//        for(File file: folder.listFiles()){
//            file.delete();
//        }
//        folder.delete();
    }

}
