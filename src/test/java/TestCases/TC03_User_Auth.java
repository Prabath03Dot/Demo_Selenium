package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.User_Auth;
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

        logger.info("Log: User clicked on Auth Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Auth_page");

    }

    @Test(priority = 2)
    public void Send_User_Name_Auth() {

        User_Auth user_auth = PageFactory.initElements(driver, User_Auth.class);
        user_auth.abAssertions();

        logger.info("Log: User Authenticated");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "User_Authenticated");

    }


}

