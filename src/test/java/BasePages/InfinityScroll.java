package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class InfinityScroll extends TestBase {
    public InfinityScroll IScroll_Actions(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Object intialLength = js.executeScript("return document.body.scrollHeight");

        while(true){
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Object currentLength = js.executeScript("return document.body.scrollHeight");
            if(intialLength == currentLength) {
                break;
            }
            intialLength = currentLength;

        }
        return this;
    }

    public InfinityScroll navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
