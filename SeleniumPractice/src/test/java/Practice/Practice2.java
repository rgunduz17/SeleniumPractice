package Practice;

import Utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practice2 {

    WebDriver driver;


    @BeforeTest
    public void setDriver(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @Test
    public void Test() throws InterruptedException {
        // 3.Enter username: “Tester”
       WebElement username= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]"));
       username.sendKeys("Tester");
        //4.Enter password: “test”
       WebElement password = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]"));
       password.sendKeys("test");
        // 5.Click on Login button
       WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]"));
       loginButton.click();


        // 6.Click on Order
        WebElement orderLink=driver.findElement(By.xpath("//a[.='Order']"));
        orderLink.click();


        // 7.Select familyAlbum from product, set quantity to 2
        Select familyAlbum=new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        familyAlbum.selectByVisibleText("FamilyAlbum");
        WebElement quantity=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));

     //   quantity.clear();//just delete if there is any existing input in box

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('ctl00_MainContent_fmwOrder_txtQuantity').value='2';");


        // 8.Click to "Calculate" button
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();

        // 9.Fill address Info with JavaFaker
        WebElement customerName=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement street=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement city=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement state=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zipCode=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        // •Generate: name, street, city, state, zip code
        Faker faker=new Faker();
        customerName.sendKeys(faker.name().fullName());
        street.sendKeys(faker.address().streetName());
        city.sendKeys(faker.address().city());
        state.sendKeys(faker.address().state());
        String zipcode=faker.address().zipCode().replaceAll("-","" );
        zipCode.sendKeys(zipcode);

        // 10.Click on "visa" radio button
        WebElement visa=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visa.click();

        // 11.Generate card number using JavaFaker
        WebElement cardNum=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNum.sendKeys(faker.finance().creditCard().replaceAll("-","" ));
        WebElement date=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        date.sendKeys("12/25");


        // 12.Click on "Process"
      //  WebElement processButton=driver.findElement(By.id("//a[.='Process']"));

        WebElement processButton = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]"));
        processButton.click();

        // 13.Verify success message "New order has been successfully added

        String expectedMessage = "New order has been successfully added.";
        WebElement successMessage=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/div/strong"));
        String actualMessage = successMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

        System.out.println("Assert Passed");
    }
}
