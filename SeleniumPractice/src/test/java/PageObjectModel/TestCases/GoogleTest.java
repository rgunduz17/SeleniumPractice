package PageObjectModel.TestCases;

import PageObjectModel.ObjectRepository.GoogleHomePage;
import Utilities.WebDriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class GoogleTest {

    private static Logger log = LogManager.getLogger(GoogleTest.class.getName());

    WebDriver driver;


    @BeforeClass
    public void beforeClass(){
        System.out.println("Test is starting...");
        log.info("Test is starting...");
    }


    @BeforeTest
    public void beforeTest(){
         driver= WebDriverFactory.getDriver("chrome");
        assert driver != null;
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        log.debug("Goes to given url");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void RunTestCases(){


        GoogleHomePage homePage = new GoogleHomePage(driver);
        homePage.getSearchBox().sendKeys("Book"+ Keys.ENTER);
        homePage.getHomePage().click();
        homePage.getGmailLink().click();
        log.debug("Running Test Cases");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
        System.out.println(driver.getTitle());
        driver.quit();
        log.debug("gets title and quit driver");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Test ended!!!");
        log.info("Test ended!!!");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Running successfully");
        log.info("Completed Successfully");
    }
}
