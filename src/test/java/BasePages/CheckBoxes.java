package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class CheckBoxes extends TestBase {

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/input[1]")
    private WebElement CheckBox1;

    public CheckBoxes ClickOnCheckBox1(){
        CheckBox1.click();
        return this;
    }

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/input[2]")
    private WebElement CheckBox2;

    public CheckBoxes ClickOnCheckBox2(){
        boolean isSelected = CheckBox2.isSelected();
        if(isSelected == true){
            System.out.println("Check Box Selected:");
        }else{
            System.out.println("Check Box Not Selected:");
        }

        return this;
    }


    public CheckBoxes navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
