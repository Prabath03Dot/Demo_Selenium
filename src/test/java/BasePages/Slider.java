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
    @FindBy (className = "sliderContainer")
    private WebElement Slider;

    public Slider HSlider_Actions(){
        Actions actions = new Actions(driver);
        actions.moveToElement(Slider, 2, 0).perform();

        return this;
    }


    public Slider navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
