package BasePages;

import BaseClasses.BaseSetup;
import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static BaseClasses.StaticData.BASE_URL;
import static java.util.concurrent.TimeUnit.SECONDS;

public class AB_Testing extends TestBase {

    @CacheLookup
    @FindBy (xpath ="/html[1]/body[1]/div[2]/div[1]/div[1]/h3[1]")
    private WebElement Txt1;

    public AB_Testing abAssertions(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "The Internet";
        Assert.assertEquals(expectedTitle, actualTitle);
        return this;
    }


    public AB_Testing navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
