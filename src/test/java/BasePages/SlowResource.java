package BasePages;

import BaseClasses.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static BaseClasses.StaticData.BASE_URL;

public class SlowResource extends TestBase {

    public SlowResource SlowResourceActions() throws InterruptedException, MalformedURLException, IOException {
        Thread.sleep(35000);

        HttpURLConnection cn = (HttpURLConnection) new URL("https://the-internet.herokuapp.com/slow").openConnection();
        cn.setReadTimeout(35000);
        // set the HEAD request with setRequestMethod
        cn.setRequestMethod("HEAD");
        // connection initiated and obtain status code
        cn.connect();

        int statusCode = cn.getResponseCode();

        if (statusCode == 503){
            System.out.println("Slow Content Detected");
        }else {
            System.out.println("No Slow Content Found");
        }

//        System.out.println("Http status code: " + statusCode);
//        driver.quit();



        return this;
    }

    public SlowResource navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
