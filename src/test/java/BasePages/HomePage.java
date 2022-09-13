package BasePages;

import BaseClasses.BaseSetup;
import BaseClasses.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

import javax.swing.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static BaseClasses.StaticData.BASE_URL;
import static java.util.concurrent.TimeUnit.SECONDS;

public class HomePage extends TestBase {

    @CacheLookup
    @FindBy (xpath ="/html[1]/body[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
    private WebElement ABlink;

    @CacheLookup
    @FindBy (xpath ="/html[1]/body[1]/div[2]/div[1]/div[1]/h3[1]")
    private WebElement Txt1;

    public HomePage clickOnABLinkButton() {
        ABlink.click();
        return this;
    }

    public HomePage abAssertions(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "The Interne";
        Assert.assertEquals(expectedTitle, actualTitle);
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

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement clickOnAddButton;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/button")
    List<WebElement> addingElements;

    public HomePage clickOnAddButton(int numberOfClicks){

        for (int i=0;i<numberOfClicks;i++) {
            clickOnAddButton.click();
        }

        Assert.assertEquals(numberOfClicks, addingElements.size());

        driver.manage().timeouts().pageLoadTimeout(10, SECONDS);
        return this;
    }

    public HomePage clickOnDeleteButton(int numberOfClicks) throws InterruptedException {

        List<WebElement> manullyAddedBtns = driver.findElements(By.cssSelector("button.added-manually"));
        for(int i=0; i<manullyAddedBtns.size(); i++){
            manullyAddedBtns.get(i).click();
            driver.manage().timeouts().pageLoadTimeout(10, SECONDS);
        }
        return this;
    }


    //------------------User Auth----------------------
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    private WebElement AuthLink;

    public HomePage ClickOnAuthPage(){
        AuthLink.click();
        driver.manage().timeouts().pageLoadTimeout(10, SECONDS);

        Alert simpleAlert = driver.switchTo().alert();
//        simpleAlert.dismiss();
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

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/input[1]")
    private WebElement CheckBox1;

    public HomePage ClickOnCheckBox1(){
        CheckBox1.click();
        return this;
    }

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/input[2]")
    private WebElement CheckBox2;

    public HomePage ClickOnCheckBox2(){
        boolean isSelected = CheckBox2.isSelected();
        if(isSelected == true){
            System.out.println("Check Box Selected:");
        }else{
            System.out.println("Check Box Not Selected:");
        }

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

    @CacheLookup
    @FindBy(tagName = "img")
    List<WebElement> brokenImages;

    public HomePage BrokenImages(){
        System.out.println("Number Of Images"+ brokenImages.size());

        //checking the links fetched
        for (int i = 0; i<brokenImages.size();i++ ){
            WebElement image = brokenImages.get(i);
            String imgUrl = image.getAttribute("src");
            System.out.println("URL of Image " + (i+1) + " is: " + imgUrl);
            verifyLinks(imgUrl);

            //Validate image display using JavaScript executor
            try {
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK");
                }else {
                    System.out.println("DISPLAY - BROKEN");
                }
            }
            catch (Exception e) {
                System.out.println("Error Occurred");
            }


        }
        return this;
    }

    public static void verifyLinks(String linkUrl){
        try{
            URL url = new URL(linkUrl);
            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();

            if(httpURLConnect.getResponseCode()>=400)
            {
                System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage() + "is a broken link");
            }

            //Fetching and Printing the response code obtained
            else{
                System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage());
            }

        }catch (Exception e){

        }
    }

    //---------------Inputs---------------
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/ul[1]/li[27]/a[1]")
    private WebElement InputsLink;

    public HomePage ClickOnInputsLink(){
        InputsLink.click();
        return this;
    }

    public HomePage InsertNumbers(String num) throws InterruptedException {
        WebElement inputNumber = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        inputNumber.sendKeys(num);
        BaseSetup.waitTime();
        inputNumber.sendKeys("-3");
        inputNumber.clear();
        BaseSetup.waitTime();
        inputNumber.sendKeys("0");
        inputNumber.clear();
        BaseSetup.waitTime();
        inputNumber.sendKeys("8");
        inputNumber.clear();
        BaseSetup.waitTime();
        inputNumber.sendKeys("iopppppppppppppp");
        inputNumber.clear();
        BaseSetup.waitTime();
        inputNumber.sendKeys("7ioo");
        inputNumber.clear();
        BaseSetup.waitTime();
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

    public HomePage DD(){
        WebElement Element1 = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement Element2 = driver.findElement(By.xpath("//div[@id='column-b']"));

        Actions builder = new Actions(driver);

        Action dragAndDrop = builder.clickAndHold(Element1).moveToElement(Element2).release(Element2).build();
        dragAndDrop.perform();

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

    public HomePage Select_DropDown(){
        Select se = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        se.selectByIndex(1);

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

    public HomePage Hover(){
        WebElement H1 = driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));
        WebElement H2 = driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));
        WebElement H3 = driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));

        Actions action = new Actions(driver);
        action.moveToElement(H1).perform();

        String actualTitleHover = driver.findElement(By.xpath("//h5[normalize-space()='name: user1']")).getText();
        String expectedTitleHover = "name: user1";

        BaseSetup.waitTime();
        Assert.assertEquals(actualTitleHover,expectedTitleHover);


        BaseSetup.waitTime();

        WebElement p1 = driver.findElement(By.xpath("//div[@class='example']//div[1]//div[1]//a[1]"));
        p1.click();


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

    public HomePage HSlider_Actions(){
        WebElement Start = driver.findElement(By.xpath("//input[@value='0']"));
        String minValue = Start.getAttribute("min");
        String maxValue = Start.getAttribute("max");
        System.out.println(minValue + " " + maxValue);

        Actions slide = new Actions(driver);
        slide.moveToElement(Start).dragAndDropBy(Start,4, 0).perform();
        return this;
    }



    //-------------I Scroll----------------
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Infinite Scroll']")
    private WebElement IScrollLink;

    public HomePage ClickOnIScrollLink(){
        IScrollLink.click();
        return this;
    }

    public HomePage IScroll_Actions(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Object intialLength = js.executeScript("return document.body.scrollHeight");

        while(true){
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Object currentLength = js.executeScript("return document.body.scrollHeight");
            if(intialLength == currentLength) {
                break;
            }
            intialLength = currentLength;

        }
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

    public HomePage DynamicControlActionsRemove() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Remove']")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        return this;
    }

    public HomePage DynamicControlActionsDisable() throws InterruptedException {
        driver.findElement(By.xpath("//button[normalize-space()='Enable']")).click();
        Thread.sleep(8000);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Status OK */-123558 051616 &&  |");
        Thread.sleep(8000);

        driver.findElement(By.xpath("//button[normalize-space()='Add']]")).click();

        return this;
    }












    public HomePage navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
