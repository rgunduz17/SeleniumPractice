package FileDownload_Upload;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FileDownloadAndUpload {
    WebDriver driver;
    static public File folder;
    Faker faker;

    @BeforeMethod
    public void setUp(){
        faker= new Faker();
        folder = new File(faker.file().fileName("download","file","txt",null));
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_settings.popups",0);
        prefs.put("download.default_directory",folder.getAbsolutePath());
        options.setExperimentalOption("prefs", prefs);
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(cap);


    }

    @Test
    public void downloadAndUpload() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/download");
        driver.findElement(By.linkText("some-file.txt")).click();
        Thread.sleep(3000);
        String newPath= "";
        File[] listOfFiles = folder.listFiles();
        Arrays.sort(listOfFiles);

        if(listOfFiles.length>1) {
            newPath = String.valueOf((listOfFiles[listOfFiles.length - 2]));
            newPath = newPath.substring(18);
            System.out.println(newPath);

        }else {
            newPath = String.valueOf((listOfFiles[listOfFiles.length - 1]));
            newPath = newPath.substring(18);
            System.out.println(newPath);
        }



        String url="http://practice.cybertekschool.com/upload";
        String filePath = folder.getAbsolutePath()+"/"+newPath;


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
