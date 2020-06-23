package PageObjectModel.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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








}
