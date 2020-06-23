package ApacheLog4j.Beta;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Demo1 {

    private static Logger log = LogManager.getLogger(Demo1.class.getName());

    @Test
    public void demoTest() {
            log.debug("I am debugging");
            log.info("object is present");
            log.error("object is not present");
            log.fatal("this is fatal");

//        log.debug("I have clicked on button");
//        log.info("Button is displayed");
//        log.error("Button is NOT displayed");
//        log.fatal("Button is missing");

    }
}
