package Practice.DataProviders;

import Practice.FindBy.Pages.LoginPage1;
import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeTest1 {


//https://qa2.vytrack.com/user/login
    WebDriver driver;

    @Test(dataProvider = "getData")
    public void homePageLogin(String username, String password){
       driver = WebDriverFactory.getDriver("chrome");
       driver.get("https://qa2.vytrack.com/user/login");

//       driver.findElement(By.id("prependedInput")).sendKeys(username);
//       driver.findElement(By.id("prependedInput2")).sendKeys(password);
//       driver.findElement(By.id("_submit")).click();

        LoginPage1 login1= new LoginPage1(driver);
        login1.LogIn(username, password);

       driver.quit();
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"user22","UserUser123"},
                {"user23","UserUser123"},
                {"storemanager65","UserUser123"},
                {"storemanager66","UserUser123"},
                {"salesmanager122","UserUser123"},
                {"salesmanager123","UserUser123"},
                {"salesmanager124","UserUser123"}
        };
    }


}
