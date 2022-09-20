package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.AB_Testing;
import BasePages.HomePage;
import BasePages.NewWindow;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC21_NewWindow extends TestBase {

    final static Logger logger = Logger.getLogger(TC21_NewWindow.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_New_Window_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.ClickOnWindowLink();

        logger.info("Log: User clicked on New_Window_Page Link");

        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "New_Window_Page");

    }

    @Test(priority = 2)
    public void Verify_Actions_New_Window() {

        NewWindow newWindow = PageFactory.initElements(driver, NewWindow.class);

        newWindow.NewWindowActions();

        logger.info("Log: New Window Testing");

    }


}

