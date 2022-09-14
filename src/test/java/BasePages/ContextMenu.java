package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class ContextMenu extends TestBase {
    public ContextMenu ContextMenuActions() throws InterruptedException {
        Actions rightClick = new Actions(driver);
        WebElement contextMenu = driver.findElement(By.xpath("//div[@id='hot-spot']"));
        rightClick.contextClick(contextMenu).perform();

        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        String alertMsg = driver.switchTo().alert().getText();
        String actualMsg = "You selected a context menu";

        Assert.assertEquals(actualMsg,actualMsg);

        driver.switchTo().alert().accept();

        return this;
    }

    public ContextMenu navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
