package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class ModelDialog extends TestBase {
    public ModelDialog ModelDialogActionClose(){
        driver.findElement(By.xpath("//p[normalize-space()='Close']")).click();

        return this;
    }

    public ModelDialog ModelDialogActionReEnable() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='restart-ad']")).click();

        return this;
    }

    public ModelDialog navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
