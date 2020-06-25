package Practice;

import Practice.SmartBearUtilities.SmartBearUtilities;
import Utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBearTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //TC #1: Smartbear software link verification
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        SmartBearUtilities.login(driver);


    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }

    @Test
    public void p2_smartbear_order_placing() throws InterruptedException{
        //TC#2: Smartbear software order placing
        //6. Click on Order
        WebElement orderLink = driver.findElement(By.xpath("//a[.='Order']"));
        orderLink.click();

        //7. Select familyAlbum from product, set quantity to 2
        Select productDropdown = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        productDropdown.selectByVisibleText("FamilyAlbum");

        WebElement quantityInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));

        //quantityInput.clear(); //just deletes if there is any existing input in the input box.
        //Thread.sleep(1000);
        //Imitating as if the user is pressing the BACKSPACE key on keyboard to delete something.
        quantityInput.sendKeys(Keys.BACK_SPACE);

        //Thread.sleep(1000);
        quantityInput.sendKeys("2");

        //8. Click to “Calculate” button
        WebElement calculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();

        //9. Fill address Info with JavaFaker
        WebElement inputCustomerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement inputStreet = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement inputCity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement inputState = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement inputZip = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

        Faker faker = new Faker();

        //• Generate: name, street, city, state, zip code
        // Entering name using javafaker.
        inputCustomerName.sendKeys(faker.name().fullName());

        //Entering street using javafaker
        inputStreet.sendKeys(faker.address().streetName());

        //Entering city using javafaker
        inputCity.sendKeys(faker.address().city());

        //Entering state using javafaker
        inputState.sendKeys(faker.address().state());

        //Entering zipcode using javafaker
        String zipcode = faker.address().zipCode().replaceAll("-","");
        inputZip.sendKeys(zipcode);

        //10. Click on “visa” radio button
        WebElement visaRadioButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaRadioButton.click();

        //11. Generate card number using JavaFaker
        WebElement inputCardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));

        //Entering credit card number using faker
        inputCardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));

        //Entering date
        WebElement expirationDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expirationDate.sendKeys("12/25");

        //12. Click on “Process”
        WebElement processButton = driver.findElement(By.xpath("//a[.='Process']"));
        processButton.click();

        //13.Verify success message “New order has been successfully added.”
        //strong
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));

        Assert.assertTrue(successMessage.isDisplayed());


    }

    @Test
    public void p3_smartbear_order_verification() {
        //2. Click on View all orders
        //3. Verify Susan McLaren has order on date “01/05/2010”
        WebElement susansDate = driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[3]"));

        String expectedDate = "01/05/2010";
        String actualDate = susansDate.getText();

        Assert.assertEquals(actualDate, expectedDate);

    }



    /*
    PRACTICE #4: Method: verifyOrder
    •Create a method named verifyOrderin SmartBearUtils class.
    •Methodtakes WebDriver object and String(name).
    •Methodshould verify if given name exists in orders.
    •This method should simply accepts a name(String), and assert whether given name is in the list or not.
    •Create a new TestNG test to test if the method is working as expected.
     */
        @Test
        public void p4_verifyOrder(){
           SmartBearUtilities.verifyOrder("Bob Feather",driver);
           SmartBearUtilities.verifyOrder("Mehmet Subas", driver);
        }


    /*
    Practice #5: Method: printNamesAndCities
    •Create a method named printNamesAndCitiesin SmartBearUtils class.
    •Method takes WebDriver object.
    •This method should simply print all the names in the List of All Orders.
    •Create a new TestNG test to test if the method is working as expected.
    •Output should be like:
    •Name1: name , City1: city
    •Name2: name , City2: city
     */
        @Test
        public void p5_printNamesAndCities(){
           SmartBearUtilities.printNamesAndCities(driver);
        }






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
