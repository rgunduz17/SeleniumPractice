package Practice.FindBy.TestCases;

import Practice.FindBy.Pages.LoginPage1;
import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPageTest {

    @Test
    public void homePageFindBy(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");

        LoginPage1 lg1= new LoginPage1(driver);
        lg1.LogIn("user23","UserUser123");

//        lg1.username1.sendKeys("user22");
//        lg1.password1.sendKeys("UserUser123");
//        lg1.logInButton.click();


    }
}
