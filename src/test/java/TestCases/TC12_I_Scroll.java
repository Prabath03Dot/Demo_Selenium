package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.InfinityScroll;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC12_I_Scroll extends TestBase {

    final static Logger logger = Logger.getLogger(TC12_I_Scroll.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_I_Scroll_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnIScrollLink();

        logger.info("Log: User clicked on I_Scroll_Page Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "I_Scroll_Page");

    }

    @Test(priority = 2)
    public void H_Slider_Action() throws InterruptedException {

        InfinityScroll infinityScroll = PageFactory.initElements(driver, InfinityScroll.class);
        infinityScroll.IScroll_Actions();

        logger.info("Log: I_Scroll_Page Actions");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "I_Scroll_Page_Actions");

    }

}

