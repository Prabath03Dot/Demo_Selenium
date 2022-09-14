package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.JQMenu;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC17_JQ_Menu extends TestBase {

    final static Logger logger = Logger.getLogger(TC17_JQ_Menu.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_JQ_Menu_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnJQMenuLink();

        logger.info("Log: User clicked on JQ_Menu_Page Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "JQ_Menu_Page");

    }

    @Test(priority = 2)
    public void JQ_Menu_Actions() throws InterruptedException {

        JQMenu jqMenu = PageFactory.initElements(driver, JQMenu.class);
        jqMenu.JQ_Menu_Actions();

        logger.info("Log: JQ_Menu_Actions");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "JQ_Menu_Actions");

    }


}

