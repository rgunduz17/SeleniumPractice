package LiveProject;

import LiveProject.Pages.LoginPageGuru99;
import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LiveProject_Guru99Bank {

    /*
    Day 1:

    Steps to get access to Test Site

1.       Visit - http://demo.guru99.com/

2.       Enter your email id

3.       Login credentials is allocated to you and mailed at your id

4.       Login credentials are only valid for 20 days! So Hurry Up and quickly create your Selenium Test Cases

        Access details to demo site.
        User ID :	mngr271605
        Password :	jubehYs
        This access is valid only for 20 days.


    SR: SS1

    Test Scenario:
    - Verify the Login Section

    Test Cases:
    - Enter valid UserId & Password

    Test Steps:
    - 1. Go to http://demo.guru99.com/V4/
    - 2. Enter valid UserId
    - 3. Enter valid Password
    - 4. Click Login

    Test Data:
    UserId
    Password

    Expected Result:
    Login successfully

      The client has requested you to use WebDriver (Firefox Driver) for the project.
      Go ahead and record the script in Webdriver.
     */

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }

    @Test
    public void LoginTest() throws InterruptedException {
        driver.get("http://demo.guru99.com/V4/");

        //1. WAY
        /*


        WebElement username = driver.findElement(By.name("uid"));
        username.sendKeys("mngr271605");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("jubehYs");

        WebElement loginButton = driver.findElement(By.name("btnLogin"));
        loginButton.click();

        String expected= "Welcome To Manager's Page of Guru99 Bank";
        String actual = driver.findElement(By.xpath("//marquee[@class='heading3']")).getText();
        Assert.assertEquals(actual, expected);
        */

        // 2. WAY

        LoginPageGuru99 login = new LoginPageGuru99(driver);
        login.LoginMethod("mngr271605", "jubehYs");

        Assert.assertEquals("Welcome To Manager's Page of Guru99 Bank",login.welcomeMessage.getText());





    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
