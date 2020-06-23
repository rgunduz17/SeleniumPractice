package PageObjectModel.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectFactory {

    WebDriver driver;

   public PageObjectFactory(WebDriver driver){
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }

/*
    By username = By.xpath("//*[@id=\"login1\"]");
    By password = By.id("password");
    By SignInButton = By.name("proceed");
    By HomeLink = By.xpath("/html/body/div/div[1]/div[1]/div[1]/a");


 */

    @FindBy(xpath ="//*[@id=\"login1\"]" )
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

//    @FindBy(name = "proceed")
//    WebElement SignInButton;

    @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[1]/a")
    WebElement HomeLink;


    public WebElement EmailID(){
       return username;
    }

    public WebElement Password(){
      return  password;
    }

//    public WebElement SignInButton(){
//        return SignInButton;
//    }

    public WebElement HomeLink(){
        return HomeLink;
    }
}
