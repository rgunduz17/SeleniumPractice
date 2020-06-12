package SeleniumTopics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp2 {
/*
XPATH PRACTICESDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.TC
#2: PracticeCybertek.com_AddRemoveElements WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS 
 */
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://practice.cybertekschool.com/add_remove_elements/");

        WebElement addButton = driver.findElement(By.xpath("//*[@class='example']/button"));
        addButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));

        if (deleteButton.isDisplayed()){
            System.out.println("Delete button is displayed");
        }else {
            System.out.println("Delete button is NOT displayed");
        }

        boolean result = driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).isDisplayed();
        System.out.println(result);

        deleteButton.click();







    }
}
