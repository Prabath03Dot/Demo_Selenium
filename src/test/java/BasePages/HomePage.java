package BasePages;

import BaseClasses.BaseSetup;
import BaseClasses.Reporting;
import BaseClasses.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

import javax.swing.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static BaseClasses.StaticData.BASE_URL;
import static java.util.concurrent.TimeUnit.SECONDS;

public class HomePage extends TestBase {

    //--------------1.AB_Testing------------------------
    @CacheLookup
    @FindBy (xpath ="/html[1]/body[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
    private WebElement ABlink;

    public HomePage clickOnABLinkButton() {
        ABlink.click();
        return this;
    }


    //----------------2.Add Remove-------------------------
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
    private WebElement clickOnAddRemoveLinkButton;

    public HomePage clickOnAddRemoveLinkButton(){
        clickOnAddRemoveLinkButton.click();
        return this;
    }


    //------------------User Auth----------------------
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    private WebElement AuthLink;

    public HomePage ClickOnAuthPage(){
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth/");

        return this;
    }

    //----------------6.CheckBoxes-------------------------
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/ul[1]/li[6]/a[1]")
    private WebElement CheckBoxLink;

    public HomePage ClickOnCheckBoxPage(){
        CheckBoxLink.click();
        return this;
    }

    //---------------- Broken Images

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
    private WebElement brokenImgLink;

    public HomePage ClickOnBrokenImagesLink(){
         brokenImgLink.click();
        return this;
    }

    //---------------Inputs---------------
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/ul[1]/li[27]/a[1]")
    private WebElement InputsLink;

    public HomePage ClickOnInputsLink(){
        InputsLink.click();
        return this;
    }

    //---------------Drag and Drop---------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Drag and Drop']")
    private WebElement DDLink;

    public HomePage ClickOnDDLink(){
        DDLink.click();
        return this;
    }


    //----------------DropDown------------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Dropdown']")
    private WebElement DropDownLink;

    public HomePage ClickOnDropDownLink(){
        DropDownLink.click();
        return this;
    }

    //----------------Hovers------------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Hovers']")
    private WebElement HoverLink;

    public HomePage ClickOnHoverLink(){
        HoverLink.click();
        return this;
    }

    //-------------Slider----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Horizontal Slider']")
    private WebElement hSliderLink;

    public HomePage ClickOnHSliderLink(){
        hSliderLink.click();
        return this;
    }

    //-------------Infinity Scroll----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Infinite Scroll']")
    private WebElement IScrollLink;

    public HomePage ClickOnIScrollLink(){
        IScrollLink.click();
        return this;
    }

    //-------------Dynamic Controls----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Dynamic Controls']")
    private WebElement DynamicControlLink;

    public HomePage ClickOnDynamicControlLink(){
        DynamicControlLink.click();
        return this;
    }

    //-------------Context Menu----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Context Menu']")
    private WebElement ContextMenuLink;

    public HomePage ClickOnContextMenuLink(){
        ContextMenuLink.click();
        return this;
    }


    //-------------Model Dialog----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Entry Ad']")
    private WebElement ModelDialogLink;

    public HomePage ClickOnModelDialogLink(){
        ModelDialogLink.click();
        BaseSetup.waitTime();
        return this;
    }

    //-------------File Upload----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='File Upload']")
    private WebElement FileUploadLink;

    public HomePage ClickOnFileUploadLink(){
        FileUploadLink.click();
        return this;
    }

    //-------------Floating Menu----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Floating Menu']")
    private WebElement FloatingMenuLink;

    public HomePage ClickOnFloatingMenuLink(){
        FloatingMenuLink.click();
        return this;
    }

    //-------------JQuarry Menu----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='JQuery UI Menus']")
    private WebElement JQMenuLink;

    public HomePage ClickOnJQMenuLink(){
        JQMenuLink.click();
        return this;
    }











    public HomePage navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
