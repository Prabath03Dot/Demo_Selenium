package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class FloatingMenu extends TestBase {
    public FloatingMenu FloatingMenuActions() throws InterruptedException{
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();

        //Scroll Down to Page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[normalize-space()='About']")).click();
        return this;
    }

    public FloatingMenu navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
