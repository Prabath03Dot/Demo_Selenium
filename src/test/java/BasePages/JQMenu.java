package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class JQMenu extends TestBase {

    public JQMenu JQ_Menu_Actions() throws InterruptedException {
        Actions mouseHoverMenu = new Actions(driver);

        WebElement m1 = driver.findElement(By.xpath("//a[normalize-space()='Enabled']"));
        mouseHoverMenu.moveToElement(m1).perform();
        Thread.sleep(1000);
        WebElement m2 = driver.findElement(By.xpath("//a[normalize-space()='Downloads']"));
        mouseHoverMenu.moveToElement(m2).perform();
        Thread.sleep(1000);
        WebElement m3 = driver.findElement(By.xpath("//a[normalize-space()='Excel']"));
        mouseHoverMenu.moveToElement(m3).click().perform();

        return this;
    }

    public JQMenu navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
