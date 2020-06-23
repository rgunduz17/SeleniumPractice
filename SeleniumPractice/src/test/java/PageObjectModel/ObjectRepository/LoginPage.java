package PageObjectModel.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

   public LoginPage(WebDriver driver){
       this.driver=driver;
   }


    By username = By.xpath("//*[@id=\"login1\"]");
    By password = By.id("password");
    By SignInButton = By.name("proceed");
    By HomeLink = By.xpath("/html/body/div/div[1]/div[1]/div[1]/a");

    public WebElement EmailID(){
       return driver.findElement(username);
    }

    public WebElement Password(){
      return  driver.findElement(password);
    }

    public WebElement SignInButton(){
        return driver.findElement(SignInButton);
    }

    public WebElement HomeLink(){
        return driver.findElement(HomeLink);
    }
}
