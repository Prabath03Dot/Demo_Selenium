package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class DynamicControls extends TestBase {

    public DynamicControls DynamicControlActionsRemove() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Remove']")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        Thread.sleep(8000);
        return this;
    }

    public DynamicControls DynamicControlActionsDisable() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Enable']")).click();
        Thread.sleep(12000);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Status OK */-123558 051616 &&  |");
        driver.findElement(By.xpath("//button[normalize-space()='Disable']")).click();

        return this;
    }


    public DynamicControls navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
