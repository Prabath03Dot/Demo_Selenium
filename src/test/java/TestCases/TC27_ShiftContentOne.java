package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.ShiftContents;
import BasePages.SlowResource;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class TC27_ShiftContentOne extends TestBase {

    final static Logger logger = Logger.getLogger(TC27_ShiftContentOne.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_ShiftContentOne_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnShiftContentsLink();
        logger.info("Log: User clicked on ShiftContentOne Link");

        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "ShiftContentOne");

    }

    @Test(priority = 2)
    public void ShiftContentOne_Actions_1() throws InterruptedException {

        ShiftContents shiftContents = PageFactory.initElements(driver, ShiftContents.class);
        shiftContents.ShiftContentsActions();
        logger.info("Log: ShiftContents_Actions Testing");
    }

    @Test(priority = 3)
    public void ShiftContentOne_Actions_3() throws InterruptedException {
        ShiftContents shiftContents = PageFactory.initElements(driver, ShiftContents.class);
        shiftContents.ShiftContentsActionRefresh();
        logger.info("Log: ShiftContentsActionRefresh Testing");
    }

    @Test(priority = 4)
    public void ShiftContentOne_Actions_2() throws InterruptedException {
        ShiftContents shiftContents = PageFactory.initElements(driver, ShiftContents.class);
        shiftContents.ShiftContentsActionRandom();
        logger.info("Log: ShiftContentsActionRandom Testing");
    }

    @Test(priority = 5)
    public void ShiftContentOne_Actions_4() throws InterruptedException {
        ShiftContents shiftContents = PageFactory.initElements(driver, ShiftContents.class);
        shiftContents.ShiftContentsActionPixelShift();
        logger.info("Log: ShiftContentsActionPixelShift Testing");
    }

    @Test(priority = 6)
    public void ShiftContentOne_Actions_5() throws InterruptedException {
        ShiftContents shiftContents = PageFactory.initElements(driver, ShiftContents.class);
        shiftContents.ShiftContentsAction_Both_Together();
        logger.info("Log: ShiftContentsAction_Both_Together Testing");
    }


}

