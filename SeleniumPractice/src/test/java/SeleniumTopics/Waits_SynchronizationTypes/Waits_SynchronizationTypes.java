package SeleniumTopics.Waits_SynchronizationTypes;

public class Waits_SynchronizationTypes {

    // 1. Implicit Wait:
        /*
        The implicit wait will tell to the web driver to wait
            for certain amount of time before it throws a
            "No Such Element Exception".
         The default setting is 0.
        Once we set the time, web driver will wait for
            that time before throwing an exception.
         */
    // EX: driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


    // 2. Explicit Wait:

    /*
    The explicit wait is used to tell the Web Driver to wait
        for certain conditions (Expected Conditions)
        or the maximum time exceeded before throwing an
        "ElementNotVisibleException" exception.
     */
    //       WebDriverWait wait = new WebDriverWait(WebDriverReference,TimeOut);
    //  EX:  WebDriverWait wait = new WebDriverWait(driver, 20);


    //       WebElement element      = wait.until(ExpectedConditions.methodName(SeleniumCode...);
    //       WebElement SeleniumLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='test']").click();


    // 3. Thread.sleep(timeouts);
        /*
        Thread.sleep causes the current thread to
            suspend execution for a specified period.
        Throws InterruptedException
         */
    //     Ex: Pause for 4 seconds
    //         Thread.sleep(4000);


    // 4. Fluent Wait:
    /*
    The fluent wait is used to tell the web driver to wait
        for a condition, as well as the frequency
        with which we want to check the condition before
        throwing an "ElementNotVisibleException" exception.

    Frequency: Setting up a repeat cycle with the time frame
        to verify/check the condition at the regular interval of time
     */

    //      Wait wait = new FluentWait(WebDriver reference)
    //                  .withTimeout(Duration.ofSeconds(SECONDS))
    //                  .pollingEvery(Duration.ofSeconds(SECONDS))
    //                  .ignoring(Exception.class);

}
