package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.NestedFrames;
import BasePages.RedirectLinks;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class TC23R_RedirectLinks extends TestBase {

    final static Logger logger = Logger.getLogger(TC23R_RedirectLinks.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_RedirectLinks_Page () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnRedirectLink();
        logger.info("Log: User clicked on RedirectLinks_Page Link");

        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "RedirectLinks_Page");

    }

    @Test(priority = 2)
    public void RedirectLinkAction() throws InterruptedException, MalformedURLException, IOException {
        RedirectLinks redirectLinks = PageFactory.initElements(driver, RedirectLinks.class);
        redirectLinks.RedirectAction();

        logger.info("Log: RedirectAction Testing");

    }

    @Test(priority = 3)
    public void RedirectLinks_200() throws InterruptedException, MalformedURLException, IOException {
        RedirectLinks redirectLinks = PageFactory.initElements(driver, RedirectLinks.class);
        redirectLinks.RedirectAction_200();

        logger.info("Log: RedirectAction_200 Testing");

    }

    @Test(priority = 4)
    public void RedirectLinks_301() throws InterruptedException, MalformedURLException, IOException {
        RedirectLinks redirectLinks = PageFactory.initElements(driver, RedirectLinks.class);
        redirectLinks.RedirectAction_301();

        logger.info("Log: RedirectAction_301 Testing");

    }

    @Test(priority = 5)
    public void RedirectLinks_404() throws InterruptedException, MalformedURLException, IOException {
        RedirectLinks redirectLinks = PageFactory.initElements(driver, RedirectLinks.class);
        redirectLinks.RedirectAction_404();

        logger.info("Log: RedirectAction_404 Testing");

    }

    @Test(priority = 6)
    public void RedirectLinks_500() throws InterruptedException, MalformedURLException, IOException {
        RedirectLinks redirectLinks = PageFactory.initElements(driver, RedirectLinks.class);
        redirectLinks.RedirectAction_500();

        logger.info("Log: RedirectAction_404 Testing");

    }


}

