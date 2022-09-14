package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static BaseClasses.StaticData.BASE_URL;

public class DropDown extends TestBase {

    public DropDown Select_DropDown(){
        Select se = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        se.selectByIndex(1);
        return this;
    }


    public DropDown navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
