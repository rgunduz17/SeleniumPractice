package SeleniumTopics.CheckBoxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        // 1. Choose Radio1 button and click on it


        // 2. Create a boolean result to check Radio1 button isSelected() and print the result



        // 3. Choose Radio2 button and click on it


        // 4. Create a boolean result to check Radio2 button isEnabled() and print the result


        // 5. Choose Radio3 button and click on it


        // 6. GetText of the button Radio3 Button and print it


        // 7. Quit from browser

    }
}
