package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.AB_Testing;
import BasePages.HomePage;
import BasePages.SpellCheck;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC28_Spell_Check extends TestBase {

    final static Logger logger = Logger.getLogger(TC28_Spell_Check.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Spell_Check_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnSpellCheckLink();
        logger.info("Log: User clicked on SpellCheckLink");

        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "AB_Testing_page");

    }

    @Test(priority = 2)
    public void verify_that_navigate_to_spell_check_site_and_initiate_spell_check_operations() throws InterruptedException {

        SpellCheck spellCheck = PageFactory.initElements(driver, SpellCheck.class);

        spellCheck.SpellCheck_WebSite_Navigation();

        logger.info("Log: SpellCheck_WebSite_Navigation and word spell check Testing");

    }


}

