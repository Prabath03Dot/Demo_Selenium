package BasePages;

import BaseClasses.BaseSetup;
import BaseClasses.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;

import static BaseClasses.StaticData.BASE_URL;

public class NestedFrames extends TestBase {

    public NestedFrames NestedFramesActions() throws InterruptedException {
        driver.switchTo().frame("frame-left");
        WebElement leftElement = driver.findElement(By.cssSelector("body"));
        String leftText = leftElement.getText();
        System.out.println("Text in left frame :" + leftText);
        Thread.sleep(1000);
        driver.quit();
        return this;
    }

    public NestedFrames navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
