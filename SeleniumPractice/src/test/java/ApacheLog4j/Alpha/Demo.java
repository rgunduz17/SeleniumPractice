package ApacheLog4j.Alpha;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Demo {

    private static Logger log = LogManager.getLogger(Demo.class.getName());

    @Test
    public void demoTest() {
            log.debug("I have clicked on button");
            log.info("Button is displayed");
            log.error("Button is NOT displayed");
            log.fatal("Button is missing");

    }
}
