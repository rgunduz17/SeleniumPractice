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
import java.util.concurrent.TimeUnit;

public class TakeAScreenshot {

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Create a pathway to save your screenshots(Use // between paths)
        String pathName= "//Users//ridvangunduz//Desktop//selenium//Screenshots//screenshot.png";

        // Create File Class assign it to output type

        File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Locate your path and your screenshots will be save to this location

        FileUtils.copyFile(source, new File(pathName));
    }

}
