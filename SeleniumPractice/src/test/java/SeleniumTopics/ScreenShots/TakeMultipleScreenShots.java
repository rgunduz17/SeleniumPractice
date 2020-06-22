package SeleniumTopics.ScreenShots;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TakeMultipleScreenShots {

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);




        // Set the local Date Time

        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);

        // Use Date Time Formatter if you want to change the Pattern of Date/Year/Hour

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, MM-dd-yyyy hh:mm:ss a");
        System.out.println(date.format(dateTimeFormatter));
        // Your each screenshot will be taken as this format "Month-Date-Year -Hours-Minutes-Seconds AM/PM"


        // Create a pathway to save your screenshots(Use // between paths)
        String pathName= "//Users//ridvangunduz//Desktop//selenium//Screenshots//"+date.format(dateTimeFormatter)+".png ";

        // Create File Class assign it to output type

        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Locate your path and your screenshots will be save to this location

        FileUtils.copyFile(sourceFile, new File(pathName));
        //your screenshot path and convert date string to SimpleDateFormat because windows can't capture screenshot with(:)

        driver.quit();


    }
}



