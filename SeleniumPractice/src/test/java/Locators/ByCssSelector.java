package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector {
        // Extra information about CSS Selector: https://www.guru99.com/locators-in-selenium-ide.html#4
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");


        // 1. Maximize the page
        driver.manage().window().maximize();

        // 2. Delete all cookies

        driver.manage().deleteAllCookies();
        /*
        HOW TO CREATE CSS

            #value
            tagName#value


        tagName = the HTML tag of the element being accessed
        # = the hash sign. This should always be present when using a CSS Selector with attribute value
        attribute value = the value of the element being accessed

            tagName.className
            tagName[attribute=value]
            tagName.className[attribute=value]
            tagName:contains("inner text")

         */

        // 3. Find the CSS Selector of "username" input box and send key your random username

        // a)  #value
            driver.findElement(By.cssSelector("#username")).sendKeys("HelloWorld");

        // b)  tagName#value

     //   driver.findElement(By.cssSelector("input#username")).sendKeys("HelloWorld");



        // 4. Find the CSS Selector of "password" input box and send key your random password
        driver.findElement(By.cssSelector("#password")).sendKeys("Password");


        // 5. Find the CSS Selector of "Log In" button and click
        driver.findElement(By.cssSelector("#Login")).click();





        // HOW TO GET CSS Selector IN EASY WAY:
        // 1. Right click on element and choose inspect
        // 2. Go to source code and right click on it and choose copy Css Selector
        //  Example Css Selector:   #username


//             VALIDATING CSS SELECTOR
//
//              SELECT INSPECT PAGE AND GO TO CONSOLE AND TYPE CODES BELOW


        //             For Css Selector:
        /*
            1. Get the selector as usual(Right click,choose inspect and choose copy selector)
         Ex:  #username

           2. Go to browser console and type : $("")  inside quote copy Css Selector
         Ex: $("#username")
         */
    }
}
