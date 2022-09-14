package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.AB_Testing;
import BasePages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC01_AB_Testing extends TestBase {

    final static Logger logger = Logger.getLogger(TC01_AB_Testing.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_AB_Testing_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.clickOnABLinkButton();

        logger.info("Log: User clicked on A/B Link");

        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "AB_Testing_page");

    }

    @Test(priority = 2)
    public void verify_that_selected_wording_includes() {

        AB_Testing ab_testing = PageFactory.initElements(driver, AB_Testing.class);

        ab_testing.abAssertions();

        logger.info("Log: Title Testing");

    }


}

