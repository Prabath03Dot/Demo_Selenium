package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.Inputs;
import BasePages.JQAlerts;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC18_JQAlerts extends TestBase {

    final static Logger logger = Logger.getLogger(TC18_JQAlerts.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Alert_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnJQAlertsLink();

        logger.info("Log: User clicked on Alert_Page Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Alert_Page");
    }

    @Test(priority = 2)
    public void ClickOnAlert1() throws InterruptedException {
        JQAlerts jqAlerts = PageFactory.initElements(driver, JQAlerts.class);
        jqAlerts.JQAlertsAction1();
        logger.info("Log: User Clicked Alert1");
    }

    @Test(priority = 3)
    public void Alert1_Verification() throws InterruptedException {
        JQAlerts jqAlerts = PageFactory.initElements(driver, JQAlerts.class);
        jqAlerts.JQAlertsAction1_Verification();
        logger.info("Log: User Clicked Alert1");
    }

    @Test(priority = 4)
    public void ClickOnAlert2() throws InterruptedException {
        JQAlerts jqAlerts = PageFactory.initElements(driver, JQAlerts.class);
        jqAlerts.JQAlertsAction2();
        logger.info("Log: User Clicked Alert2");
    }

    @Test(priority = 5)
    public void Alert2_Verification() throws InterruptedException {
        JQAlerts jqAlerts = PageFactory.initElements(driver, JQAlerts.class);
        jqAlerts.JQAlertsAction2_Verification();
        logger.info("Log: User Clicked Alert2");
    }

    @Test(priority = 6)
    public void ClickOnAlert3() throws InterruptedException {
        JQAlerts jqAlerts = PageFactory.initElements(driver, JQAlerts.class);
        jqAlerts.JQAlertsAction3();
        logger.info("Log: User Clicked Alert3");
    }

    @Test(priority = 7)
    public void Alert3_Verification() throws InterruptedException {
        JQAlerts jqAlerts = PageFactory.initElements(driver, JQAlerts.class);
        jqAlerts.JQAlertsAction3_Verification();
        logger.info("Log: User Clicked Alert3");
    }


}

