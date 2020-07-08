package Practice.ActionClass;

import Utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Action_Class {

   /*
   TC	#16:	Double	ClickTest
   1.Go	to	https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
   2.Switch	to	iframe.
   3.Double	click	on	the	text	“Double-click	me	to	change	my	text	color.”
   4.Assert:	Text’s	“style”	attribute	value	contains red"
    */

    WebDriver driver;

    @Test
    public void hoverTest(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        Actions actions = new Actions(driver);
        WebElement iframe = driver.findElement(By.xpath("//body//iframe"));
        driver.switchTo().frame(iframe);

        WebElement text = driver.findElement(By.id("demo"));
        actions.moveToElement(text).doubleClick().perform();


        String actual=  text.getAttribute("style");
        String expected ="color: red;";

        Assert.assertEquals(expected, actual);

    }

    /*

    TC	#16:	Hover	Test
    1.Go	to	https://demos.telerik.com/kendo-ui/dragdrop/index
    2.Drag	and	drop	the	small	circle	to	bigger	circle.
    3.Assert:	-Text	in	big	circle	changed to:	“You	did	great!
     */

    @Test
    public void DragAndDrop() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        Thread.sleep(2000);

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions= new Actions(driver);




//        int x = target.getLocation().getX();
//        int y= target.getLocation().getY();
//        Thread.sleep(2000);
//        System.out.println("X coordinate: "+ x +" "+ "Y coordinate: "+ y);
//
//    //   actions.dragAndDropBy(source,x,y).build().perform();

       actions.clickAndHold(source).moveToElement(target).release().perform();


// actions.dragAndDrop(source,target).perform();
//        String actual = target.getText();
//        String expected = "You did great!";
//        Assert.assertEquals(expected, actual);


    }

    /*
    TC	#17:	Context	Click	–HOMEWORK
    1.Go	to	https://the-internet.herokuapp.com/context_menu
    2.Right	click	to	the	box.
    3.Alert	will	open.
    4.Accept	alert
     */

    @Test
    public void ContextClick() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement box = driver.findElement(By.id("hot-spot"));

        Actions actions = new Actions(driver);

        actions.moveToElement(box).contextClick().perform();

        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        String alertMessage= alert.getText();
        System.out.println(alertMessage);
        alert.accept();



    }
}
