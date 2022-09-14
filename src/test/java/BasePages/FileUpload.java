package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class FileUpload extends TestBase {

    public FileUpload FileUploadActions() throws InterruptedException {
        WebElement upload =  driver.findElement(By.xpath("//input[@id='file-upload']"));
        Thread.sleep(1000);
        upload.sendKeys("C:\\Users\\prabath_p\\Pictures\\Web\\download.jfif");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
        Thread.sleep(4000);
        return this;
    }

    public FileUpload FileUploadVerification(){
        WebElement fileName = driver.findElement(By.xpath("//div[@id='uploaded-files']"));
        String expectedFileName = fileName.getText();
        String actualFileName = "download.jfif";

        Assert.assertEquals(expectedFileName,actualFileName);

        return this;
    }    @FindBy (xpath ="/html[1]/body[1]/div[2]/div[1]/div[1]/h3[1]")
    private WebElement Txt1;

    public FileUpload abAssertions(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "The Internet";
        Assert.assertEquals(expectedTitle, actualTitle);
        return this;
    }


    public FileUpload navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
