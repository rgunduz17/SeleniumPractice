package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicCommands {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        // Launch Website 1. Way
        driver.get("https://www.testandquiz.com/selenium/testing.html");

        // Launch Website 2. Way
        // driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        // Fetch the text "This is sample text." and print it on console
        // Use the class name of the div to locate it and then fetch text using getText() method
        String sampleText = driver.findElement(By.className("col-md-12")).getText();
        System.out.println(sampleText);

        // Click on the textbox and send value
        driver.findElement(By.id("fname")).sendKeys("Selenium Test 1"); // By.id
        driver.findElement(By.name("firstName")).sendKeys(" -2"); // By.name
        driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys(" -3"); //By.xpath
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(" -4"); // By.xpath ==> Custom xpath
        driver.findElement(By.cssSelector("#fname")).sendKeys(" -5"); // By.cssSelector
        driver.findElement(By.cssSelector("input#fname")).sendKeys(" -6"); // By.cssSelector ==> Custom selector


        // Use the linkText locator method to find the link and perform click using click() method
        driver.findElement(By.linkText("This is a link")).click();

        // navigating backward in browser history
        driver.navigate().back();

        // Clear the text written in the textbox
        driver.findElement(By.id("fname")).clear();

        // refresh/ reload a web page
        driver.navigate().refresh();

        // Click on the Submit button using click() command
        driver.findElement(By.id("idOfButton")).click();                    //By.id
        //  driver.findElement(By.xpath("//*[@type=\"button\"]")).click();    // By.xpath
        //  driver.findElement(By.cssSelector("button#idOfButton")).click();  // By.cssSelector

        // Locate the radio button by id and check it using click() function
        //   xpaths           cssSelector
        driver.findElement(By.id("male")).click();  //    //*[@id="male"]       #male
        driver.findElement(By.id("female")).click();//    //*[@id="female"]     #female


        // Locate the checkbox by className and check it using click() function
        driver.findElement(By.className("Automation")).click();
        driver.findElement(By.className("Performance")).click();

        // Use Select class for selecting value from dropdown
        Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
        dropdown.selectByVisibleText("Automation Testing");

        Select dropdown2= new Select((driver.findElement(By.cssSelector("select#testingDropdown"))));
        dropdown2.selectByVisibleText("Performance Testing");

        Select dropdown3= new Select(driver.findElement(By.xpath("//*[@id=\"testingDropdown\"]")));
        dropdown3.selectByVisibleText("Manual Testing");

        Select dropdown4 = new Select(driver.findElement(By.xpath("//select[@id=\"testingDropdown\"]")));
        dropdown4.selectByVisibleText("Database Testing");


        // Close the Browser
        driver.close();


    }
}
