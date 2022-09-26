package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.Slider;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC10_H_Slider extends TestBase {

    final static Logger logger = Logger.getLogger(TC10_H_Slider.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_H_Slider_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnHSliderLink();

        logger.info("Log: User clicked on H_Slider Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "H_Slider_page");

    }

    @Test(priority = 2)
    public void H_Slider_Action() throws InterruptedException {

        Slider slider = PageFactory.initElements(driver, Slider.class);
        slider.HSlider_Actions();

        logger.info("Log: H_Slider Actions");

    }


}

