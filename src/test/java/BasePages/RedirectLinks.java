package BasePages;

import BaseClasses.TestBase;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import static BaseClasses.StaticData.BASE_URL;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RedirectLinks extends TestBase {

    @CacheLookup
    @FindBy(xpath = "//a[@id='redirect']")
    private WebElement PageLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='200']")
    private WebElement HTTP200;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='301']")
    private WebElement HTTP301;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='404']")
    private WebElement HTTP404;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='500']")
    private WebElement HTTP500;

    public RedirectLinks RedirectAction() throws InterruptedException, MalformedURLException, IOException {
        PageLink.click();
        return this;
    }

    public RedirectLinks RedirectAction_200() throws InterruptedException, MalformedURLException, IOException {
        HTTP200.click();
        Thread.sleep(2000);

        HttpURLConnection cn = (HttpURLConnection) new URL("https://the-internet.herokuapp.com/status_codes/200").openConnection();
        // set the HEAD request with setRequestMethod
        cn.setRequestMethod("HEAD");
        // connection initiated and obtain status code
        cn.connect();
        int c = cn.getResponseCode();
        System.out.println("Http status code: " + c);
        Thread.sleep(1000);
        driver.navigate().back();
        return this;
    }

    public RedirectLinks RedirectAction_301() throws InterruptedException, MalformedURLException, IOException {
        HTTP301.click();
        Thread.sleep(2000);

        HttpURLConnection cn = (HttpURLConnection) new URL("https://the-internet.herokuapp.com/status_codes/301").openConnection();
        // set the HEAD request with setRequestMethod
        cn.setRequestMethod("HEAD");
        // connection initiated and obtain status code
        cn.connect();
        int c = cn.getResponseCode();
        System.out.println("Http status code: " + c);
        Thread.sleep(1000);
        driver.navigate().back();
        return this;
    }

    public RedirectLinks RedirectAction_404() throws InterruptedException, MalformedURLException, IOException {
        HTTP404.click();
        Thread.sleep(2000);

        HttpURLConnection cn = (HttpURLConnection) new URL("https://the-internet.herokuapp.com/status_codes/404").openConnection();
        // set the HEAD request with setRequestMethod
        cn.setRequestMethod("HEAD");
        // connection initiated and obtain status code
        cn.connect();
        int c = cn.getResponseCode();
        System.out.println("Http status code: " + c);
        Thread.sleep(1000);
        driver.navigate().back();
        return this;
    }

    public RedirectLinks RedirectAction_500() throws InterruptedException, MalformedURLException, IOException {
        HTTP500.click();
        Thread.sleep(2000);

        HttpURLConnection cn = (HttpURLConnection) new URL("https://the-internet.herokuapp.com/status_codes/500").openConnection();
        // set the HEAD request with setRequestMethod
        cn.setRequestMethod("HEAD");
        // connection initiated and obtain status code
        cn.connect();
        int c = cn.getResponseCode();
        System.out.println("Http status code: " + c);
        Thread.sleep(1000);
        driver.quit();
        return this;
    }


    public RedirectLinks navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
