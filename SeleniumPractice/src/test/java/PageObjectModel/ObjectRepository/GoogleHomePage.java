package PageObjectModel.ObjectRepository;

import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GoogleHomePage {

    WebDriver driver;

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
       PageFactory.initElements(driver, this);
    }

    @FindBy(name="q")
    WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"logo\"]/img")
    WebElement homePage;

    @FindBy(linkText = "Gmail")
    WebElement GmailLink;

    public WebElement getSearchBox(){
        return searchBox;
    }

    public WebElement getHomePage(){
        return homePage;
    }

    public WebElement getGmailLink(){
        return GmailLink;
    }




    @Test
    public void RunTestCase(){
        driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");

//        GoogleHomePage homePage = new GoogleHomePage(driver);
//        homePage.getSearchBox().sendKeys("Book");
//        homePage.getHomePage().click();
//        homePage.getGmailLink().click();

        getSearchBox().sendKeys("Book");
    }



}
