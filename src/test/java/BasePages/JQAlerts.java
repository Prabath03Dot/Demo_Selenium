package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class JQAlerts extends TestBase {

    @CacheLookup
    @FindBy (xpath ="//button[@onclick='jsAlert()']")
    private WebElement btn1;

    @CacheLookup
    @FindBy (xpath ="//button[@onclick='jsConfirm()']")
    private WebElement btn2;

    @CacheLookup
    @FindBy (xpath ="//button[@onclick='jsPrompt()']")
    private WebElement btn3;

    public JQAlerts JQAlertsAction1() throws InterruptedException {
        btn1.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        return this;
    }

    public JQAlerts JQAlertsAction1_Verification() throws InterruptedException {
        String expected = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String actual = "You successfully clicked an alert";
        Assert.assertEquals(expected,actual);
        Thread.sleep(1000);
        return this;
    }

    public JQAlerts JQAlertsAction2() throws InterruptedException {
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", btn2);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1000);
        return this;
    }

    public JQAlerts JQAlertsAction2_Verification() throws InterruptedException {
        String expected = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String actual = "You clicked: Ok";
        Assert.assertEquals(expected,actual);
        Thread.sleep(1000);
        return this;
    }

    public JQAlerts JQAlertsAction3() throws InterruptedException {
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", btn3);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(prop.getProperty("Text1"));
        Thread.sleep(1000);
        alert.accept();
        Thread.sleep(1000);
        return this;
    }

    public JQAlerts JQAlertsAction3_Verification() throws InterruptedException {
        String expected = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String actual = "You entered: " + prop.getProperty("Text1");
        Assert.assertEquals(expected,actual);
        Thread.sleep(1000);
        return this;
    }


    public JQAlerts navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
