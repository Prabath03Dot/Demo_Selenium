package BasePages;

import BaseClasses.BaseSetup;
import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class Hover extends TestBase {

    public Hover Hover(){
        WebElement H1 = driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(H1).perform();

        String actualTitleHover = driver.findElement(By.xpath("//h5[normalize-space()='name: user1']")).getText();
        String expectedTitleHover = "name: user1";

        BaseSetup.waitTime();
        Assert.assertEquals(actualTitleHover,expectedTitleHover);
        BaseSetup.waitTime();

        WebElement p1 = driver.findElement(By.xpath("//div[@class='example']//div[1]//div[1]//a[1]"));
        p1.click();

        return this;
    }

    public Hover navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
