package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static BaseClasses.StaticData.BASE_URL;

public class BrokenImages extends TestBase {

    @CacheLookup
    @FindBy(tagName = "img")
    List<WebElement> brokenImages;

    public BrokenImages Broken_Images(){
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

    public BrokenImages navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
