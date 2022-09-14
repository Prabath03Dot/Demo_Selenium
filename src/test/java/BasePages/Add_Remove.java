package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static BaseClasses.StaticData.BASE_URL;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Add_Remove extends TestBase {

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement clickOnAddButton;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/button")
    List<WebElement> addingElements;

    public Add_Remove clickOnAddButton(int numberOfClicks){

        for (int i=0;i<numberOfClicks;i++) {
            clickOnAddButton.click();
        }

        Assert.assertEquals(numberOfClicks, addingElements.size());

        driver.manage().timeouts().pageLoadTimeout(10, SECONDS);
        return this;
    }

    public Add_Remove clickOnDeleteButton(int numberOfClicks) throws InterruptedException {

        List<WebElement> manullyAddedBtns = driver.findElements(By.cssSelector("button.added-manually"));
        for(int i=0; i<manullyAddedBtns.size(); i++){
            manullyAddedBtns.get(i).click();
            driver.manage().timeouts().pageLoadTimeout(10, SECONDS);
        }
        return this;
    }



    public Add_Remove navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
