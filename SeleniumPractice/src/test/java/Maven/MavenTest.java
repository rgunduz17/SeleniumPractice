package Maven;

import org.testng.annotations.Test;

public class MavenTest {

    /*
    Plugin for maven surefire and testNG xml file configurations

             <build>
                <pluginManagement>
                    <plugins>
                        <plugin>
                            <groupId>org.apache.maven.plugins</groupId>
                            <artifactId>maven-surefire-plugin</artifactId>
                            <version>3.0.0-M5</version>
                            <configuration>
                                <suiteXmlFiles>
                                    <suiteXmlFile>testng2.xml</suiteXmlFile>
                                </suiteXmlFiles>
                            </configuration>
                        </plugin>
                    </plugins>
                </pluginManagement>
            </build>
     */
    // Enter these command to command prompt(go to project level in command prompt, find the path)
    // Maven.Maven Commands:

    // 0. mvn -version or mvn --version   :   check current version of mvn

    // 1. mvn clean    : This command cleans the maven project by deleting the target directory

    // 2. mvn compile    : It’s used to compile the source Java classes of the project.

    // 3. mvn test      :   This command is used to run the test cases of the project using the maven-surefire-plugin

    // 4. mvn -Dtest=(Class name here) test :  To run single test case from all test cases
    // Ex: mvn -Dtest=WebDriverClassTest test      : Specifically run WebDriverClassTest class

    // 5. mvn test -P(Profile id from pom.xml file)   : to run specific profile from specific testNG.xml files
    //  Ex:  mvn test -PRegression      : Run all cases from regression (use given/ assigned testNG.xml file)
    //  Ex: mvn test -PSmoke            : Run all cases from regression (use given/ assinged testNG.xml file)

    // for more commands visit : https://www.journaldev.com/33645/maven-commands-options-cheat-sheet


       @Test
        public void BrowserAutomation(){
            System.out.println("Browser Automation");
        }

        @Test
    public void elementsUI(){
            System.out.println("Elements UI");
        }

}
