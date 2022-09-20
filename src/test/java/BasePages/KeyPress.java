package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class KeyPress extends TestBase {

    @CacheLookup
    @FindBy (xpath ="//input[@id='target']")
    private WebElement Txt1;

    public KeyPress KeyPressActions1() throws InterruptedException{
        Txt1.sendKeys(prop.getProperty("Letter1"));
        Thread.sleep(1000);
        return this;
    }

    public KeyPress KeyPressActionsVerify1() throws InterruptedException{
        String entered = Txt1.getAttribute("value");
        String expected = "You entered: " + entered.toUpperCase();
        String actual = "You entered: " + prop.getProperty("Letter1");
        Assert.assertEquals(expected,actual);
        Thread.sleep(1000);
        Txt1.clear();
        return this;
    }

    public KeyPress KeyPressActions2() throws InterruptedException{
        Txt1.sendKeys(prop.getProperty("Letter5"));
        Thread.sleep(1000);
        return this;
    }

    public KeyPress KeyPressActionsVerify2() throws InterruptedException{
        String entered = Txt1.getAttribute("value");
        String expected = "You entered: " + entered.toUpperCase();
        String actual = "You entered: " + prop.getProperty("Letter5");
        Assert.assertEquals(expected,actual);
        Thread.sleep(1000);
        Txt1.clear();
        return this;
    }

    public KeyPress KeyPressActions3() throws InterruptedException{
        Txt1.clear();
        Txt1.sendKeys(prop.getProperty("Letter7"));
        Thread.sleep(1000);
        return this;
    }

    public KeyPress KeyPressActionsVerify3() throws InterruptedException{
        String entered = Txt1.getAttribute("value");
        String expected = "You entered: " + entered.toUpperCase();
        String actual = "You entered: " + prop.getProperty("Letter7");
        Assert.assertEquals(expected,actual);
        Thread.sleep(1000);
        return this;
    }


    public KeyPress navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
