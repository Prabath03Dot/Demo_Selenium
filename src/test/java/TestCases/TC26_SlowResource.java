package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.ShadowText;
import BasePages.SlowResource;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class TC26_SlowResource extends TestBase {

    final static Logger logger = Logger.getLogger(TC26_SlowResource.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_SlowResource_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnSlowContentsLink();
        logger.info("Log: User clicked on SlowResource_Pag Link");

        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "SlowResource_Pag");

    }

    @Test(priority = 2)
    public void SlowResource_Actions() throws InterruptedException, MalformedURLException, IOException {

        SlowResource slowResource = PageFactory.initElements(driver, SlowResource.class);
        slowResource.SlowResourceActions();
        logger.info("Log: SlowResource_Actions Testing");
    }


}

