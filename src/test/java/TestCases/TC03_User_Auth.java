package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;

import static org.junit.Assert.assertEquals;

public class TC03_User_Auth extends TestBase {

    final static Logger logger = Logger.getLogger(TC03_User_Auth.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_User_Auth_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnAuthPage();

//        String pageMessage = driver.findElement(By.cssSelector("p")).getText();
//        assertEquals(pageMessage, "Congratulations!");


        logger.info("Log: User clicked on Auth Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Auth_page");

    }

    @Test(priority = 2)
    public void Send_User_Name_Auth() {

        //HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        String url ="https://the-internet.herokuapp.com/basic_auth";
        driver.get(url);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.dismiss();

//      simpleAlert.sendKeys("admin");
//        driver.switchTo().alert().dismiss();

        logger.info("Log: User Entered UserName");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "User_Name");

    }

//    @Test(priority = 3)
//    public void Click_On_Delete_Button() {
//
//        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//
//        homePage.clickOnDeleteButton();
//
//        logger.info("Log: User Clicked on Delete Button");
//        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Delete_page");
//    }


}

