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

    //---------------- Broken Images-----------------------

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

    //-------------JQuarry Alerts----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='JavaScript Alerts']")
    private WebElement JQAlertsLink;

    public HomePage ClickOnJQAlertsLink(){
        JQAlertsLink.click();
        return this;
    }

    //-------------KeyPress ----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Key Presses']")
    private WebElement KeyPressLink;

    public HomePage ClickOnKeyPressLink(){
        KeyPressLink.click();
        return this;
    }

    //-------------Notification Msg----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Notification Messages']")
    private WebElement MsgLink;

    public HomePage ClickOnMsgLink(){
        MsgLink.click();
        return this;
    }

    //-------------New Window----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Multiple Windows']")
    private WebElement WindowLink;

    public HomePage ClickOnWindowLink(){
        WindowLink.click();
        return this;
    }

    //-------------Nested Frames----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Nested Frames']")
    private WebElement NestedFramesLink;

    public HomePage ClickOnNestedFramesLink(){
        NestedFramesLink.click();
        return this;
    }

    //-------------Redirect Links----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Redirect Link']")
    private WebElement RedirectLink;

    public HomePage ClickOnRedirectLink(){
        RedirectLink.click();
        return this;
    }

    //-------------Redirect Links----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Secure File Download']")
    private WebElement FileDownloadLink;

    public HomePage ClickOnFileDownloadLink(){
        FileDownloadLink.click();
        return this;
    }

    //-------------Redirect Links----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Shadow DOM']")
    private WebElement ShadowTextLink;

    public HomePage ClickOnShadowTextLink(){
        ShadowTextLink.click();
        return this;
    }

   //-------------Slow Contents----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Slow Resources']")
    private WebElement SlowContentsLink;

    public HomePage ClickOnSlowContentsLink(){
        SlowContentsLink.click();
        return this;
    }

   //-------------Shift Contents----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Shifting Content']")
    private WebElement ShiftContentLink;

    public HomePage ClickOnShiftContentsLink(){
        ShiftContentLink.click();
        return this;
    }

   //-------------Spell Check----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Typos']")
    private WebElement SpellCheckLink;

    public HomePage ClickOnSpellCheckLink(){
        SpellCheckLink.click();
        return this;
    }

    //-------------Editor----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='WYSIWYG Editor']")
    private WebElement EditorLink;

    public HomePage ClickOnEditorLink(){
        EditorLink.click();
        return this;
    }

    //-------------JS Errors----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='JavaScript onload event error']")
    private WebElement JSErrorsLink;

    public HomePage ClickOnJSErrorsLink(){
        JSErrorsLink.click();
        return this;
    }

    //-------------Exit Content----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Exit Intent']")
    private WebElement ExitContentLink;

    public HomePage ClickOnExitContentLink(){
        ExitContentLink.click();
        return this;
    }

    //-------------Dynamic Contents----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Dynamic Content']")
    private WebElement Dynamic_ContentsLink;

    public HomePage ClickOnDynamic_ContentsLink(){
        Dynamic_ContentsLink.click();
        return this;
    }

    //-------------Digest Auth----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Digest Authentication']")
    private WebElement DigestAuthLink;

    public HomePage ClickOnDigestAuthLink(){
        driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth/");

        return this;
    }











    public HomePage navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
