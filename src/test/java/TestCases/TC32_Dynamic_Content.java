package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.DynamicContents;
import BasePages.ExitContent;
import BasePages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.awt.*;

public class TC32_Dynamic_Content extends TestBase {

    final static Logger logger = Logger.getLogger(TC32_Dynamic_Content.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Dynamic_Content_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnDynamic_ContentsLink();
        logger.info("Log: User clicked on Dynamic_Content Link");

        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Dynamic_Content_Page");

    }

    @Test(priority = 2)
    public void DynamicContents_Actions() throws InterruptedException {

        DynamicContents dynamicContents = PageFactory.initElements(driver, DynamicContents.class);

        dynamicContents.DynamicContents_Actions();

        logger.info("Log: DynamicContents_Actions Testing");

    }

    @Test(priority = 3)
    public void StaticContents_Actions() throws InterruptedException {

        DynamicContents dynamicContents = PageFactory.initElements(driver, DynamicContents.class);

        dynamicContents.StaticContents_Actions();

        logger.info("Log: StaticContents_Actions Testing");

    }


}

