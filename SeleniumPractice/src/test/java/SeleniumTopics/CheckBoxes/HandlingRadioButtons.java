package SeleniumTopics.CheckBoxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandlingRadioButtons {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //   Put an Implicit wait, this means that
        //     any search for elements on the page could take the time
        //      the implicit wait is set for before throwing exception
      //  Thread.sleep(3000);

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 1. Choose Radio1 button and click on it
        WebElement radio1 =driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input"));
        radio1.click();



        // 2. Create a boolean result to check Radio1 button isSelected() and print the result
        boolean result1=  radio1.isSelected();
        System.out.println("Radio1 button selected: "+result1);


        // 3. Choose Radio2 button and click on it
        WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input"));
        radio2.click();
        // 4. Create a boolean result to check Radio2 button isEnabled() and print the result

        boolean result2 = radio2.isEnabled();
        System.out.println("Radio2 is enabled: "+ result2);


        // 5. Choose Radio3 button and click on it
        WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input"));
        radio3.click();
        // 6. GetText of the button Radio3 Button and print it
        WebElement radio3text = driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]"));
        System.out.println("Radio3 button text: "+radio3text.getText());
        // 7. Quit from browser
        driver.quit();
    }
}
