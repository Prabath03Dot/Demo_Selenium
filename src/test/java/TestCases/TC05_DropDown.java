package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC05_DropDown extends TestBase {

    final static Logger logger = Logger.getLogger(TC05_DropDown.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Drop_Down_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnDropDownLink();

        logger.info("Log: User clicked on DropDown Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "DropDown_page");

    }

    @Test(priority = 2)
    public void Select_On_Drop_Down() throws InterruptedException {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.Select_DropDown();

        logger.info("Log: User Selected DropDown");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Select_DropDown");

    }


}

