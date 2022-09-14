package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;
import static org.junit.Assert.assertEquals;

public class User_Auth extends TestBase {

    public User_Auth abAssertions(){
        String pageMessage = driver.findElement(By.cssSelector("p")).getText();
        assertEquals(pageMessage, "Congratulations!");
        return this;
    }


    public User_Auth navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
