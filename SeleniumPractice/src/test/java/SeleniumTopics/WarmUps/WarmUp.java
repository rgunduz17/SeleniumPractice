package SeleniumTopics.WarmUps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp {
/*
XPATH PRACTICESDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.TC
#1: PracticeCybertek.com_ForgotPassword WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered byCybertek School” text
4. Verify all WebElements are displayed. 
 */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/forgot_password");

        // Home

     //   driver.findElement(By.xpath("//*[@class=\"nav-link\"]")).click();
        // Xpath     "//*[@attribute='attributeValue']"
         // Relative xpath            "//*[@id='content']"

        //  Absolute xpath           /html/body/nav/ul/li/a

        // Forgot password

        WebElement ActualForgotPassword = driver.findElement(By.xpath("//*[@id='content']/div/h2"));

        if(ActualForgotPassword.isDisplayed()){
            System.out.println("Text is displayed");
        }else {
            System.out.println("Test is not displayed");
        }
        // E-mail Text

        WebElement emailText =driver.findElement(By.xpath("//*[@name='forgot_password']/div/div/label"));

        if (emailText.isDisplayed()){
            System.out.println("Email text is dislayed");

        }else {
            System.out.println("Email text is not displayed");
        }
        // E-mail input box

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test");

        // “Retrieve password” button

        driver.findElement(By.xpath("//*[@id='form_submit']/i")).click();


        // “Powered byCybertek School” text

      WebElement CybertekText =  driver.findElement(By.xpath("//*[@id='page-footer']/div/div"));
        if (CybertekText.isDisplayed()){
            System.out.println("Cybertek Text is displayed");
        }else {
            System.out.println("Cybertek Text is not displayed");
        }
    }
}
