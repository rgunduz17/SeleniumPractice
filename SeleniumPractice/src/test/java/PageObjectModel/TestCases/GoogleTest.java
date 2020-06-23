package PageObjectModel.TestCases;

import PageObjectModel.ObjectRepository.GoogleHomePage;
import Utilities.WebDriverFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class GoogleTest {

    WebDriver driver;


    @BeforeClass
    public void beforeClass(){
        System.out.println("Test is starting...");
    }

    @BeforeTest
    public void beforeTest(){
         driver= WebDriverFactory.getDriver("chrome");
        assert driver != null;
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
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
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Test ended!!!");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Class was running successfully");
    }
}
