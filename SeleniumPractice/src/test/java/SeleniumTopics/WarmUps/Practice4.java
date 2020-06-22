package SeleniumTopics.WarmUps;

import Utilities.WebDriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Practice4 {

    public static void main(String[] args) throws IOException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("http://google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // Create a folder to desktop to save your screenshot
        String pathName = "//Users//ridvangunduz//Desktop//screenshots//cybertekscreenshot.png";

      // Windows users:
      // String pathName2 = "\\Users\\ridvangunduz\\Desktop\\screenshots\\cybertekscreenshot.png";

        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(source, new File(pathName));

    }
}
