package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.Inputs;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.Scanner;

public class TC07_Inputs extends TestBase {

    final static Logger logger = Logger.getLogger(TC07_Inputs.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Inputs_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnInputsLink();

        logger.info("Log: User clicked on Input_numbers Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Input_numbers_page");

    }

    @Test(priority = 2)
    public void Enter_valid_number() throws InterruptedException {

        Inputs inputs = PageFactory.initElements(driver, Inputs.class);
//        Scanner userInputNumber = new Scanner(System.in);
//        System.out.println("Enter A Number");
//        String a = userInputNumber.nextLine();

        //Values Available (v1-v9)
        inputs.InsertNumbers(prop.getProperty("v1"));

        logger.info("Log: User Entered Valid_Input_number");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Valid_Input_number");

    }


}

