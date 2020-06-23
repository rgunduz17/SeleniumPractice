package PageObjectModel.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

   public HomePage(WebDriver driver){
       this.driver=driver;
   }

   By searchBox = By.id("srchword");
   By searchButton = By.xpath("//*[@id=\"queryTop\"]/input");

   public WebElement Search(){
       return driver.findElement(searchBox);
   }

   public WebElement SearchButton(){
       return driver.findElement(searchButton);
   }
}
