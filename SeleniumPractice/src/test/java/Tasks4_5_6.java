import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tasks4_5_6 {

        WebDriver driver;
//    @Test
//    public void p4_verify_Order(){
//        SmartBearUtilities.verifyOrder("Bob Feather",driver);
//        SmartBearUtilities.verifyOrder("Abuzittin Kilkuyruk", driver);
//    }


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

//    @Test
//    public void p5_print_Names_And_Cities(){
//        SmartBearUtilities.printNamesAndCities(driver);
//    }


    @Test
    public void p6_registration_confirmation(){
        driver.navigate().to("http://practice.cybertekschool.com/registration_form");

        Faker faker= new Faker();

        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys(faker.name().firstName());
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys(faker.name().lastName());
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys(faker.name().firstName()+faker.name().lastName());
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys(faker.name().username()+"@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(faker.number().digits(10));
        WebElement phone = driver.findElement(By.name("phone"));
        String phoneNumber=faker.number().digits(3)
                +"-"+faker.number().digits(3)
                +"-"+faker.number().digits(4);
        phone.sendKeys(phoneNumber);
        WebElement gender = driver.findElement(By.name("gender"));
        gender.click();
        WebElement birthday = driver.findElement(By.name("birthday"));
        String birthDay= faker.number().numberBetween(1,12)
                +"/"+faker.number().numberBetween(1,30)
                +"/"+faker.number().numberBetween(1900,2020);
        birthday.sendKeys(birthDay);
        Select department =new Select(driver.findElement(By.name("department")));
        department.selectByIndex(1);
        Select job_title = new Select(driver.findElement(By.name("job_title")));
        job_title.selectByIndex(4);
        WebElement language = driver.findElement(By.id("inlineCheckbox2"));
        language.click();
        WebElement signUp = driver.findElement(By.id("wooden_spoon"));
        signUp.click();
        WebElement message= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/p"));
        String actual = message.getText();
        String expected = "You've successfully completed registration!";
        Assert.assertEquals(expected,actual);
        //  Assert.assertTrue(message.isDisplayed());

    }
        // SMART BEAR UTILITIES
    public static void verifyOrder(String name, WebDriver driver){

        //List<WebElement> allNames = driver.findElements(By.cssSelector("#ctl00_MainContent_orderGrid > tbody > tr > td:nth-child(2)"));
        List<WebElement> allNames = driver.findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));

        int listSize= allNames.size();
        String allNamesInTheList="";

        for(int i=0; i<listSize; i++){
            allNamesInTheList += allNames.get(i).getText()+" ";
        }

        System.out.println(allNamesInTheList);

        if (allNamesInTheList.contains(name)){
            System.out.println("Name: \"" +name+ "\""+ " is in the list");
        }else {
            System.out.println("Name: \"" +name+ "\""+ " is NOT in the list");
        }
        System.out.println("==========================");

    }


    public static void printNamesAndCities(WebDriver driver){
        List<WebElement> allNames = driver.findElements(By.cssSelector("#ctl00_MainContent_orderGrid > tbody > tr > td:nth-child(2)"));
        int listSize= allNames.size();

        List<WebElement> allCities = driver.findElements(By.cssSelector("#ctl00_MainContent_orderGrid > tbody > tr > td:nth-child(7)"));

        for(int i=0; i<listSize; i++){

            System.out.println("Name"+(i+1)+": "+ allNames.get(i).getText()+ ", City"+(i+1)+": "+allCities.get(i).getText());
        }

    }
}
