package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXPath {
        // Extra information about xPath: https://www.guru99.com/xpath-selenium.html

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");

        // 1. Maximize the page
        driver.manage().window().maximize();

        // 2. Delete all cookies

        driver.manage().deleteAllCookies();


        /*
        HOW TO CREATE XPATH
            //*[@Attribute = 'value']
            //tagName[@Attribute = 'value']


            // : Select current node.
            Tagname: Tagname of the particular node.
            @: Select attribute.
            Attribute: Attribute name of the node.
            Value: Value of the attribute.


         OTHER TYPE OF XPATHS
                //*[contains(@type,'sub')]
                //*[contains(@name,'btn')]
                //*[contains(@id,'message')]
                //*[contains(text(),'here')]
                //input[@type='submit' and @name='btnLogin']
                //label[starts-with(@id,'message')]
                //*[@type='text']//following::input
                //*[text()='Enterprise Testing']//ancestor::div
                //*[@id='java_technologies']//child::li
                //*[@type='submit']//preceding::input
                //*[@type='submit']//following-sibling::input

*/

        // 3. Find the xpath of "username" input box and send key your random username

        driver.findElement(By.xpath("//*[@id ='username']")).sendKeys("Test");
      //  driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Test");

        //  //*[@id="username"]



        // 4. Find the xpath of "password" input box and send key your random password

        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password");

        // 5. Find the xpath of "Log In" button and click

        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();














        // HOW TO GET XPATH IN EASY WAY:
        // 1. Right click on element and choose inspect
        // 2. Go to source code and right click on it and choose copy XPath
        //  Example XPath:   //*[@id="Login"]


        // Be careful while pasting  double quote inside double quote
        // Either change it to single quote or provide \" pathName \"

        // Find the XPath below elements (Do not use id attribute)

        // Username XPath:
        // Password XPath:
        // Forget Password XPath:
        // Try for Free XPath:


        // HOW TO CHECK VALIDATION OF XPATH BY USING CONSOLE

        // SELECT INSPECT PAGE AND GO TO CONSOLE AND TYPE CODES BELOW

//            For XPath:
        /*
           1. Get the Xpath as usual(Right click,choose inspect and choose copy XPath)
                  Ex: //*[@id="username"]

           2. Go to browser console and type : $x("") inside quote copy the XPath
                  Ex: $x("//*[@id='username']")
            ==>       do not forget to change double quote to single quote
         */


    }
}
