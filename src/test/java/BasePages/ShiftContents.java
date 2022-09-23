package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.MalformedURLException;

import static BaseClasses.StaticData.BASE_URL;

public class ShiftContents extends TestBase {

    public ShiftContents ShiftContentsActions() throws InterruptedException {
        WebElement ShiftContentOne = driver.findElement(By.xpath("//a[normalize-space()='Example 1: Menu Element']"));
        ShiftContentOne.click();
        Thread.sleep(1000);
        WebElement ShiftContentPortfolio = driver.findElement(By.xpath("//a[normalize-space()='Portfolio']"));
        ShiftContentPortfolio.click();
//        WebElement GalleryElement = driver.findElement(By.xpath("//a[@class='shift']"));
//        Point C1 = GalleryElement.getLocation();
//        System.out.println("C1: " + C1);
//        driver.navigate().refresh();
        driver.navigate().back();


        return this;
    }

    public ShiftContents ShiftContentsActionRefresh() throws InterruptedException {
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        WebElement ShiftContentPortfolio = driver.findElement(By.xpath("//a[normalize-space()='Portfolio']"));
        ShiftContentPortfolio.click();
        Thread.sleep(1000);
        String PortfolioText = driver.findElement(By.xpath("//h1[normalize-space()='Not Found']")).getText();
        System.out.println("Portfolio Txt:" + PortfolioText);
        driver.navigate().back();

        return this;
    }

    public ShiftContents ShiftContentsActionRandom() throws InterruptedException {
        Thread.sleep(1000);
        WebElement ShiftContentPortfolioRandom = driver.findElement(By.xpath("//a[@href='/shifting_content/menu?mode=random']"));
        ShiftContentPortfolioRandom.click();
        Thread.sleep(1000);
        WebElement ShiftContentPortfolio = driver.findElement(By.xpath("//a[normalize-space()='Portfolio']"));
        ShiftContentPortfolio.click();
        Thread.sleep(1000);
        String PortfolioText = driver.findElement(By.xpath("//h1[normalize-space()='Not Found']")).getText();
        System.out.println("Portfolio  Txt Random Actions:" + PortfolioText);
        driver.navigate().back();

        return this;
    }

    public ShiftContents ShiftContentsActionPixelShift() throws InterruptedException {
        Thread.sleep(1000);
        WebElement ShiftContentPortfolioRandom = driver.findElement(By.xpath("//p[contains(text(),'To specify a differant numbor of pixels to shift t')]//a[contains(text(),'click here')]"));
        ShiftContentPortfolioRandom.click();
        Thread.sleep(1000);
        WebElement ShiftContentPortfolio = driver.findElement(By.xpath("//a[normalize-space()='Portfolio']"));
        ShiftContentPortfolio.click();
        Thread.sleep(1000);
        String PortfolioText = driver.findElement(By.xpath("//h1[normalize-space()='Not Found']")).getText();
        System.out.println("Portfolio Pixel Actions:" + PortfolioText);
        driver.navigate().back();

        return this;
    }

    public ShiftContents ShiftContentsAction_Both_Together() throws InterruptedException {
        Thread.sleep(1000);
        WebElement ShiftContentPortfolioBoth = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/p[4]/a[1]"));
        ShiftContentPortfolioBoth.click();
        Thread.sleep(1000);
        WebElement ShiftContentPortfolio = driver.findElement(By.xpath("//a[normalize-space()='Portfolio']"));
        ShiftContentPortfolio.click();
        Thread.sleep(1000);
        String PortfolioText = driver.findElement(By.xpath("//h1[normalize-space()='Not Found']")).getText();
        System.out.println("Portfolio Both Together Actions:" + PortfolioText);
        driver.quit();

        return this;
    }



    public ShiftContents navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
