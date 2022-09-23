package BasePages;

import BaseClasses.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class Editor extends TestBase {
    Actions actions = new Actions(driver);

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Format']")
    WebElement formatElement;

    @CacheLookup
    @FindBy(xpath = "//div[@title='Bold']")
    WebElement boldElement;

    @CacheLookup
    @FindBy(xpath = "//div[normalize-space()='Italic']")
    WebElement italicElement;

    @CacheLookup
    @FindBy(className = "tox-edit-area__iframe")
    WebElement iframeElement;

    @CacheLookup
    @FindBy(id = "tinymce")
    WebElement textArea;


    public Editor ChangeIFrame() throws InterruptedException {
        driver.switchTo().frame(iframeElement);
        return this;
    }

    public Editor MainFrame() throws InterruptedException {
        driver.switchTo().defaultContent();
        return this;
    }

    public Editor EditorAction_Send_Values() throws InterruptedException {
        textArea.clear();
        textArea.sendKeys(prop.getProperty("DummyText"));
        return this;
    }

    public Editor BoldText() throws InterruptedException {
        MainFrame();
        actions.moveToElement(formatElement);
        formatElement.click();
        actions.moveToElement(boldElement);
        boldElement.click();
        ChangeIFrame();
        textArea.sendKeys(prop.getProperty("BoldText"));
        return this;
    }

    public Editor ItalicText() throws InterruptedException {
        MainFrame();
        actions.moveToElement(formatElement);
        formatElement.click();
        actions.moveToElement(italicElement);
        italicElement.click();
        ChangeIFrame();
        textArea.sendKeys(prop.getProperty("ItalicText"));
        return this;
    }

    public Editor AlignCenterText() throws InterruptedException {
        MainFrame();
        actions.moveToElement(formatElement);
        formatElement.click();
        WebElement alignElementMenu = driver.findElement(By.xpath("//div[contains(text(),'Align')]"));
        actions.moveToElement(alignElementMenu);
        alignElementMenu.click();
        WebElement alignElementCenter = driver.findElement(By.xpath("//div[contains(text(),'Center')]"));
        actions.moveToElement(alignElementCenter);
        alignElementCenter.click();
        ChangeIFrame();
        textArea.sendKeys(prop.getProperty("AlignCenter"));
        return this;
    }

    public Editor NewLine() throws InterruptedException {
        textArea.sendKeys(Keys.ENTER);
        textArea.sendKeys(prop.getProperty("NewLine"));
        return this;
    }

    public Editor EditorActions_Change_Heading_Type() throws InterruptedException {
        MainFrame();
        actions.moveToElement(formatElement);
        formatElement.click();
        WebElement headingFormat = driver.findElement(By.xpath("//div[contains(text(),'Formats')]"));
        actions.moveToElement(headingFormat);
        headingFormat.click();
        WebElement headingMenu = driver.findElement(By.xpath("//div[contains(text(),'Headings')]"));
        actions.moveToElement(headingMenu);
        headingMenu.click();
        WebElement heading1 = driver.findElement(By.xpath("//h1[normalize-space()='Heading 1']"));
        actions.moveToElement(heading1);
        heading1.click();
        ChangeIFrame();
        textArea.sendKeys(prop.getProperty("Heading1"));
        return this;
    }

    public Editor EditorActions_Change_Color_Formats() throws InterruptedException {
        MainFrame();
        actions.moveToElement(formatElement);
        formatElement.click();
        WebElement TextColor = driver.findElement(By.xpath("//div[contains(text(),'Text color')]"));
        actions.moveToElement(TextColor);
        TextColor.click();
        WebElement Dark_Blue_Color = driver.findElement(By.xpath("//div[@title='Dark Blue']"));
        actions.moveToElement(Dark_Blue_Color);
        Dark_Blue_Color.click();
        ChangeIFrame();
        textArea.sendKeys(prop.getProperty("DarkBlue"));
        return this;
    }

    public Editor EditorActions_Change_Font_Family() throws InterruptedException {
        MainFrame();
        actions.moveToElement(formatElement);
        formatElement.click();
        WebElement FontFamily = driver.findElement(By.xpath("//div[contains(text(),'Fonts')]"));
        actions.moveToElement(FontFamily);
        FontFamily.click();
        WebElement VerdanaFont = driver.findElement(By.xpath("//div[contains(text(),'Verdana')]"));
        actions.moveToElement(VerdanaFont);
        VerdanaFont.click();
        ChangeIFrame();
        textArea.sendKeys(prop.getProperty("VerdanaFont"));
        return this;
    }

    public Editor EditorActions_Change_Font_Size() throws InterruptedException {
        MainFrame();
        actions.moveToElement(formatElement);
        formatElement.click();
        WebElement FontSizes = driver.findElement(By.xpath("//div[contains(text(),'Font sizes')]"));
        actions.moveToElement(FontSizes);
        FontSizes.click();
        WebElement Font14 = driver.findElement(By.xpath("//div[contains(text(),'14pt')]"));
        actions.moveToElement(Font14);
        Font14.click();
        ChangeIFrame();
        textArea.sendKeys(prop.getProperty("Font14Size"));
        return this;
    }

    public Editor EditorActions_Change_Background_Color() throws InterruptedException {
        MainFrame();
        actions.moveToElement(formatElement);
        formatElement.click();
        WebElement BackgroundColor = driver.findElement(By.xpath("//div[contains(text(),'Background color')]"));
        actions.moveToElement(BackgroundColor);
        BackgroundColor.click();
        WebElement Color_DarkTurquoise = driver.findElement(By.xpath("//div[@title='Dark Turquoise']"));
        actions.moveToElement(Color_DarkTurquoise);
        Color_DarkTurquoise.click();
        ChangeIFrame();
        textArea.sendKeys(prop.getProperty("Color_DarkTurquoise"));
        return this;
    }

    public Editor EditorActions_Get_Text() throws InterruptedException {
        String getText = textArea.getText();
        System.out.println(getText);
        return this;
    }

    public Editor navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
