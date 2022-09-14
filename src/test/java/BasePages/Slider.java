package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class Slider extends TestBase {

    @CacheLookup
    @FindBy (xpath ="/html[1]/body[1]/div[2]/div[1]/div[1]/h3[1]")
    private WebElement Txt1;

    public Slider HSlider_Actions(){
        WebElement Start = driver.findElement(By.xpath("//input[@value='0']"));
        String minValue = Start.getAttribute("min");
        String maxValue = Start.getAttribute("max");
        System.out.println(minValue + " " + maxValue);

        Actions slide = new Actions(driver);
        slide.moveToElement(Start).dragAndDropBy(Start,4, 0).perform();
        return this;
    }


    public Slider navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
