package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.Editor;
import BasePages.HomePage;
import BasePages.SpellCheck;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC29_Editor extends TestBase {

    final static Logger logger = Logger.getLogger(TC29_Editor.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Editor_Page () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnEditorLink();
        logger.info("Log: User clicked on ClickOnEditorLink");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "ClickOnEditorLink");
    }

    @Test(priority = 2)
    public void ChangeIFrame() throws InterruptedException {
        Editor editor = PageFactory.initElements(driver, Editor.class);
        editor.ChangeIFrame();
        logger.info("Log: ChangeIFrame Testing");
        editor.EditorAction_Send_Values();
    }

    @Test(priority = 3)
    public void BoldTxt() throws InterruptedException {
        Editor editor = PageFactory.initElements(driver, Editor.class);
        editor.BoldText();
        logger.info("Log: BoldText Testing");
    }

    @Test(priority = 4)
    public void ItalicTxt() throws InterruptedException {
        Editor editor = PageFactory.initElements(driver, Editor.class);
        editor.ItalicText();
        logger.info("Log: ItalicText Testing");
    }

    @Test(priority = 5)
    public void EditorActions() throws InterruptedException {

        Editor editor = PageFactory.initElements(driver, Editor.class);
        editor.AlignCenterText();
        editor.NewLine();
        logger.info("Log: EditorActions Testing");
    }

    @Test(priority = 6)
    public void EditorActions_Change_Heading_Type() throws InterruptedException {

        Editor editor = PageFactory.initElements(driver, Editor.class);
        editor.EditorActions_Change_Heading_Type();
        logger.info("Log: EditorActions_Change_Heading_Type Testing");
    }

    @Test(priority = 7)
    public void EditorActions_Change_Color_Formats() throws InterruptedException {

        Editor editor = PageFactory.initElements(driver, Editor.class);
        editor.EditorActions_Change_Color_Formats();
        logger.info("Log: EditorActions_Change_Color_Formats Testing");
    }

    @Test(priority = 8)
    public void EditorActions_Get_Text() throws InterruptedException {

        Editor editor = PageFactory.initElements(driver, Editor.class);
        editor.EditorActions_Get_Text();
        logger.info("Log: EditorActions_Get_Text Testing");
    }

    @Test(priority = 9)
    public void EditorActions_Change_Font_Family() throws InterruptedException {

        Editor editor = PageFactory.initElements(driver, Editor.class);
        editor.EditorActions_Change_Font_Family();
        logger.info("Log: EditorActions_Change_Font_Family Testing");
    }

    @Test(priority = 10)
    public void EditorActions_Change_Font_Size() throws InterruptedException {

        Editor editor = PageFactory.initElements(driver, Editor.class);
        editor.EditorActions_Change_Font_Size();
        logger.info("Log: EditorActions_Change_Font_Size Testing");
    }

    @Test(priority = 11)
    public void EditorActions_Change_Background_Color() throws InterruptedException {

        Editor editor = PageFactory.initElements(driver, Editor.class);
        editor.EditorActions_Change_Background_Color();
        logger.info("Log: EditorActions_Change_Background_Color Testing");
    }



}

