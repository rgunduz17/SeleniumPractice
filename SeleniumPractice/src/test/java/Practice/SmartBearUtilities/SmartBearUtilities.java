package Practice.SmartBearUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SmartBearUtilities {

    public static void login(WebDriver driver){
        //3. Enter username: “Tester”
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        inputUsername.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        inputPassword.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
    }

 /*
    PRACTICE #4: Method: verifyOrder
    •Create a method named verifyOrderin SmartBearUtils class.
    •Methodtakes WebDriver object and String(name).
    •Methodshould verify if given name exists in orders.
    •This method should simply accepts a name(String), and assert whether given name is in the list or not.
    •Create a new TestNG test to test if the method is working as expected.
     */
//  name="Bob Feather"
    public static void verifyOrder(String name, WebDriver driver){
        ////*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[2]/td[2]
        List<WebElement> allNames = driver.findElements(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
       // #ctl00_MainContent_orderGrid > tbody > tr > td:nth-child(2)
       // List<WebElement> allNames = driver.findElements(By.cssSelector("#ctl00_MainContent_orderGrid > tbody > tr > td:nth-child(2)"));

        int listSize= allNames.size();
        String allNamesInTheList ="";

        for(int i =0; i<listSize; i++){
            allNamesInTheList += allNames.get(i).getText()+" ";
        }

        System.out.println(allNamesInTheList);

        // Verification

        if(allNamesInTheList.contains(name)){
            System.out.println("Name: \""+ name + "\""+ " is in the list");
        }else {
            System.out.println("Name: \""+ name + "\""+ " is NOT in the list");
        }

        System.out.println("===========================================");


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

    public static void printNamesAndCities(WebDriver driver){
        //*[@id="ctl00_MainContent_orderGrid"]/tbody/tr/td[2]
        List<WebElement> allNames = driver.findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));
        //*[@id="ctl00_MainContent_orderGrid"]/tbody/tr/td[7]
        List<WebElement> allCities = driver.findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[7]"));

        int listSize = allNames.size();

        for (int i = 0; i<listSize; i++){
            System.out.println("Name"+(i+1)+": "+ allNames.get(i).getText()+" , City"+(i+1)+": "+allCities.get(i).getText());
        }


    }
}
