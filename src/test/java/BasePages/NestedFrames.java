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

    public NestedFrames SwitchFrame_Child_Top() throws InterruptedException {
        driver.switchTo().frame("frame-top");
        return this;
    }

    public NestedFrames SwitchFrame_Left() throws InterruptedException {
        SwitchFrame_Child_Top();
        driver.switchTo().frame("frame-left");
        return this;
    }

    public NestedFrames NestedFramesActions_Left() throws InterruptedException {
        WebElement leftElement = driver.findElement(By.tagName("body"));
        String leftText = leftElement.getText();
        System.out.println("Text in left frame :" + leftText);
        return this;
    }

    public NestedFrames SwitchFrame_Child_Bottom() throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        return this;
    }

    public NestedFrames NestedFramesActions_Bottom() throws InterruptedException {
        WebElement leftElement = driver.findElement(By.tagName("body"));
        String leftText = leftElement.getText();
        System.out.println("Text in Bottom frame :" + leftText);
        driver.quit();
        return this;
    }

    public NestedFrames navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
