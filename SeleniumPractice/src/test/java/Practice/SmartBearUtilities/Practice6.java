package Practice.SmartBearUtilities;

import Utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practice6 {

    /*
TC#6: Cybertek registration form confirmationNote: Use JavaFaker when possible.
1.Open browser
2.Go to website: http://practice.cybertekschool.com/registration_form
3.Enter first name
4.Enter last name
5.Enter username
6.Enter email address
7.Enter password
8.Enter phone number
9.Select a gender from radio buttons
10.Enter date of birth
11.Select Department/Office
12.Select Job Title
13.Select programming language from checkboxes
14.Clickto sign up button
15.Verify success message “You’ve successfully completed registration.”is displayed.
 */

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //TC #1: Smartbear software link verification
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/registration_form");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void cyberTekRegistration(){
        Faker faker = new Faker();

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys(faker.name().firstName());

        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys(faker.name().lastName());

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys(faker.name().username().replace(".",""));

        WebElement email = driver.findElement(By.name("email"));
        String emailAddress = faker.name().firstName().toLowerCase()
                            +faker.name().lastName().toLowerCase()+"@gmail.com";
        email.sendKeys(emailAddress);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(faker.name().firstName() + faker.number().digits(6));

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys(faker.number().digits(3)
                        +"-"+ faker.number().digits(3)
                        +"-"+ faker.number().digits(4));

        WebElement gender = driver.findElement(By.name("gender"));
        gender.click();

        WebElement birthday = driver.findElement(By.name("birthday"));
        String birthDay= faker.number().numberBetween(1,12)
                +"/"+ faker.number().numberBetween(1,30)
                +"/"+ faker.number().numberBetween(1900,2020);
        birthday.sendKeys(birthDay);

        Select deparment = new Select(driver.findElement(By.name("department")));
        deparment.selectByIndex(1);

        Select job_title = new Select(driver.findElement(By.name("job_title")));
        job_title.selectByVisibleText("SDET");

        WebElement checkbox = driver.findElement(By.id("inlineCheckbox2"));
        checkbox.click();

        WebElement signUpButton =driver.findElement(By.id("wooden_spoon"));
        signUpButton.click();

        WebElement message = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/p"));
        Assert.assertTrue(message.isDisplayed());
        System.out.println("Assert Passed");


       driver.quit();
    }

}