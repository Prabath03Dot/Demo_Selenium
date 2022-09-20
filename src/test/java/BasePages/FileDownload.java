package BasePages;

import BaseClasses.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static BaseClasses.StaticData.BASE_URL;

public class FileDownload extends TestBase {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='text.txt']")
    private WebElement File1;

    public FileDownload ClickOnFileAction1() throws InterruptedException{
//        Thread.sleep(2000);
//        File1.click();
//        String file1Location = File1.getAttribute("href");
//        System.out.println(file1Location);

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", System.getProperty("user.dir") + File.separator + "externalFiles" + File.separator + "downloadFiles");
        driver.get("http://admin:admin@the-internet.herokuapp.com/download_secure");
        Thread.sleep(2000);
        System.out.println("Before clicking");
        driver.findElement(By.linkText("some-file.txt")).click();
        Thread.sleep(5000);
        driver.quit();


        return this;
    }

    public FileDownload navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
