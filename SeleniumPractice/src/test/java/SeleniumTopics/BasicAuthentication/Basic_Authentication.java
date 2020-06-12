package SeleniumTopics.BasicAuthentication;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Basic_Authentication {
        static String pageMessage;
        public static void CodeBlock (WebDriver driver) throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.manage().window().maximize();
            Thread.sleep(3000);
            driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
            Thread.sleep(3000);
          pageMessage=  driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
            driver.quit();
        }


    //  1. Create a method (public static and no return type) and name it to CodeBlock and use " WebDriver driver " as a parameter


    //  2. Create a static String variable in instance field and name it to PageMessage


    // Inside CodeBlock method:

    // 1. Maximize the browser



    // 2. Get following URL and authenticate credentials (username and password) to it.
    // driver.get("https://the-internet.herokuapp.com/basic_auth");


    /*
     to authenticate credentials (username and password)
         http://username:password@test.com

         For this website;
         Username: admin
         Password: admin
     */





    // 3.  Put an Implicit wait, this means that
    //     any search for elements on the page could take the time
    //      the implicit wait is set for before throwing exception



    // 4. Get the text from page that shows successfully logged in. (Congratulations! You must have the proper credentials.)



    // 5. Quit from browser


    // Inside the main method:

    // 1. Call the CodeBlock method (use driver as parameter)

    // 2. Print the pageMessage

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        CodeBlock(driver);
        System.out.println(pageMessage);

    }
}
