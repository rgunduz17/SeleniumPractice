package Jenkins;

public class Jenkins {

    /*
    Path: /Users/ridvangunduz/Desktop/selenium
    Code: java -jar jenkins.war
    To exit: CTRL + C
     */


    // Continuous Integration Tool : Jenkins

    // Installation

    //1. Download jenkins.war file from https://www.jenkins.io/download/
    //      (will run in local host 8080)

    // 2. Go to command prompt and find your jenkins.war file path

    // 3. Type java -jar jenkins.war -httpPort=8080 (by default gives 8080)   press enter
    //  Wait for installation and it will ask username and password (password will be in command prompt)

    // 4. After installation, go to "Manage Jenkins" and find "Global Tool Configuration"
    //      Choose jkd intallation automatically and maven installation automatically then click save


    // 5. To create simple Jenkins job from local computer
    //  Click "New Item" Type name of the project and choose "Freestyle Project" click OK
    //  Go to "General" click on "Advanced" then click on "Use custom workspace"
    //  Paste your project path there
    //  Find "Build" Section and Click on "Add build step" choose "Invoke top level Maven targets"
    //  Near the Goals : "test -P(profile id from pom.xml file)
    //              EX:   test -PRegression     or   test -PSmoke
    //  Click on save and you can click "Build now" to run your test

    // 6. To add TestNG-result.xml file to current project
    //  Click on project then "Configure"
    //  Find "Post-build Actions" and click on "add post build action"
    //  Choose "Publish TestNG result" it will automatically create a path for your file
    //  Click save and click build now to run your project

    // 7. Scheduling Jenkins Jobs for a specific time:

    // Configure the project
    // Find "Build Triggers" and choose "Build periodically"
    // Paste your time in   30 5 * * *     format and save (every day at 5:30 am)

    //Jenkins uses a cron expression, the different fields are :

    //MINUTES Minutes in one hour (0-59)
    //HOURS Hours in one day (0-23)
    //DAYMONTH Day in a month (1-31)
    //MONTH Month in a year (1-12)
    //DAYWEEK Day of the week (0-7) where 0 and 7 are sunday

    //      Min Hour Day Month DayWeek
    // Ex : 30 5 * * *   (For every put * ===> Every day at 5:30 am)

    // More info: https://itisatechiesworld.wordpress.com/jenkins-related-articles/jenkins-configuration/jenkins-scheduling-jenkins-jobs-for-a-specific-time/
}
