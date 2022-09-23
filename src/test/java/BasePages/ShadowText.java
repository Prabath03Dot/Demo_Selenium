package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


import static BaseClasses.StaticData.BASE_URL;

public class ShadowText extends TestBase {

    @CacheLookup
    @FindBy (xpath ="//span[@slot='my-text']")
    private WebElement ShadowTxt1;

    @CacheLookup
    @FindBy (xpath ="//div[@id='flash-messages']/div")
    private WebElement CloseBtnMsg;


    public ShadowText ShadowTxtConfirmation1(){
        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        WebElement shadowHost = driver.findElement(By.tagName("my-paragraph"));
//        WebElement shadowHost = driver.findElement(By.tagName("#shadow-root"));
//        Object shadowRootObj = jsDriver.executeScript("return arguments[0].shadowRoot", shadowHost);
//        SearchContext shadowRoot = (SearchContext) shadowRootObj;
//        WebElement shadowContent = shadowRoot.findElement(By.xpath("//span[@slot='my-text']"));

        SearchContext shadowRoot = (SearchContext) jsDriver.executeScript("return arguments[0].shadowRoot", shadowHost);;
        WebElement shadowContent = shadowRoot.findElement(By.xpath("//span[@slot='my-text']"));

        String actualTitle = shadowContent.getText();
        String expectedTitle = "Let's have some differen text!";
        Assert.assertEquals(expectedTitle, actualTitle);
        return this;
    }

    public ShadowText navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
