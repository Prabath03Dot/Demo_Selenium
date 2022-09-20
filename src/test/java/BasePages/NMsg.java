package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class NMsg extends TestBase {

    @CacheLookup
    @FindBy (xpath ="//a[@class='close']")
    private WebElement CloseBtn;

    @CacheLookup
    @FindBy (xpath ="//div[@id='flash-messages']/div")
    private WebElement CloseBtnMsg;

    @CacheLookup
    @FindBy (xpath ="//a[normalize-space()='Click here']")
    private WebElement ReloadMsgBtn;

    public NMsg NMsgActionsVerification(){
        String actualTitle = CloseBtnMsg.getText();
        String expectedTitle = "Action unsuccesful, please try again";
        Assert.assertEquals(expectedTitle, actualTitle);
        return this;
    }

    public NMsg NMsgActionsClose() throws InterruptedException {
        CloseBtn.click();
        Thread.sleep(1000);
        return this;
    }

    public NMsg NMsgActionsReload(){
        ReloadMsgBtn.click();
        return this;
    }


    public NMsg navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
