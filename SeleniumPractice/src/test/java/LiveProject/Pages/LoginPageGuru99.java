package LiveProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageGuru99 {

    WebDriver driver;

    public LoginPageGuru99(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "uid")
    public WebElement usernameGuru;

    @FindBy(name = "password")
    public  WebElement passwordGuru;

    @FindBy(name = "btnLogin")
    public WebElement loginButton;

    @FindBy(xpath = "//marquee[@class='heading3']")
    public WebElement welcomeMessage;

    public void LoginMethod(String username, String password){
        usernameGuru.sendKeys(username);
        passwordGuru.sendKeys(password);
        loginButton.click();
    }




}
