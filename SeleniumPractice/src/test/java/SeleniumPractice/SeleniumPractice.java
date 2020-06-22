package SeleniumPractice;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumPractice {
    private static String[] links = null;
    private static int linksCount = 0;
    public static void main(String[] args) {
        //  LOCATORS
        /*
        Locators:

By Id
By Name
By ClassName
By TagName
By LinkText
By PartialLinkText
By XPath
By CSS Selector

         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.navigate().to("http://practice.cybertekschool.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        linksCount= allLinks.size();
        System.out.println("Available links: "+ linksCount);

//        links = new String[linksCount];
//        System.out.println("Print all available links from this page:");
//       for (int i =0; i< linksCount; i++){
//            links[i]= allLinks.get(i).getAttribute("href");
//            System.out.println("Number of links: #"+(i+1)+" "+allLinks.get(i).getAttribute("href"));
//        }
//        for (int i =0; i<linksCount; i++){
//            driver.navigate().to(links[i]);
//
//        }

        for( int i=0; i<linksCount; i++){
            if(!(allLinks.get(i).getText().isEmpty())){
                System.out.println(allLinks.get(i).getAttribute("href"));
                allLinks.get(i).sendKeys(Keys.chord(Keys.COMMAND,Keys.RETURN)); // Mac users
           //     allLinks.get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN)); // Windows Users

            }
        }

















        driver.quit();





    }
}
