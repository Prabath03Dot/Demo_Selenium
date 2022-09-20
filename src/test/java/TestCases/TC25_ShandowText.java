package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.NewWindow;
import BasePages.ShadowText;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC25_ShandowText extends TestBase {

    final static Logger logger = Logger.getLogger(TC25_ShandowText.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Shadow_Text_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.ClickOnShadowTextLink();

        logger.info("Log: User clicked on Shadow_Text_Page Link");

        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Shadow_Text_Page");

    }

    @Test(priority = 2)
    public void Verify_Shadow_Text_Page_1() {

        ShadowText shadowText = PageFactory.initElements(driver, ShadowText.class);

        shadowText.ShadowTxtConfirmation1();

        logger.info("Log: Shadow_Text_1 Testing");

    }


}

