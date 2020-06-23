package Jenkins;

import Utilities.WebDriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReportsClass {

    /*
            Add dependency to pom.xml file
        <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
        <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports</artifactId>
            <version>4.1.6</version>
        </dependency>


     */

    ExtentReports extent;

    @BeforeTest
    public void config(){
      // ExtentReports ,  ExtentSparkReporter
        String path = System.getProperty("user.dir")+"//reports//index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Result");
        reporter.config().setDocumentTitle("Test Results");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Automation Tester", "Ridvan Gunduz");

    }


    @Test(priority = 1)
    public void initialDemo(){

        ExtentTest test = extent.createTest("Initial Demo");
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());


     //   extent.flush();

    }

    @Test(priority = 2)
    public void SecondDemo(){

        ExtentTest test = extent.createTest("Second Demo");
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());


        extent.flush();

    }


}
