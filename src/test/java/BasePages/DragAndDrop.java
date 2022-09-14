package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class DragAndDrop extends TestBase {

    public DragAndDrop DD(){
        WebElement Element1 = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement Element2 = driver.findElement(By.xpath("//div[@id='column-b']"));

        Actions builder = new Actions(driver);

        Action dragAndDrop = builder.clickAndHold(Element1).moveToElement(Element2).release(Element2).build();
        dragAndDrop.perform();

        return this;
    }
    public DragAndDrop navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
