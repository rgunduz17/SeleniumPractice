package PageObjectModel.TestCases;

import PageObjectModel.ObjectRepository.HomePage;
import PageObjectModel.ObjectRepository.LoginPage;
import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginApplication {

    @Test
    public void Login(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.EmailID().sendKeys("Hello");
        loginPage.Password().sendKeys("World");
     //   loginPage.SignInButton().click();
        loginPage.HomeLink().click();



        HomePage homePage = new HomePage(driver);

        homePage.Search().sendKeys("Book");
        homePage.SearchButton().click();

    }
}
