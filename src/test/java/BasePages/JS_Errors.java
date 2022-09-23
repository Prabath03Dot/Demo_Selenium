package BasePages;

import BaseClasses.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.List;
import java.util.Set;
import java.util.logging.Level;

import static BaseClasses.StaticData.BASE_URL;

public class JS_Errors extends TestBase {

    public JS_Errors JS_Errors_List() throws InterruptedException {

        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        List<LogEntry> lg = logEntries.getAll();

        for(LogEntry logEntry : lg) {
//            System.out.println(logEntry);
            System.out.println(logEntry.getMessage());
        }


        return this;
    }

    public JS_Errors navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
