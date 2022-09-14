package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.DragAndDrop;
import BasePages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC08_DragDrop extends TestBase {

    final static Logger logger = Logger.getLogger(TC08_DragDrop.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_DragDrop_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnDDLink();

        logger.info("Log: User clicked on DD Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "DD_page");

    }

    @Test(priority = 2)
    public void DD_Actions() throws InterruptedException {

        DragAndDrop dragAndDrop = PageFactory.initElements(driver, DragAndDrop.class);
        dragAndDrop.DD();

        logger.info("Log: DD Actions");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "DD_Actions");

    }


}

