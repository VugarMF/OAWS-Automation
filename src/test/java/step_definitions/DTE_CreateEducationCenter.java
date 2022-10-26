package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.DTE_EducationCenterPages;
import utilities.Driver;
import utilities.Utilities;

public class DTE_CreateEducationCenter extends Utilities {

    DTE_EducationCenterPages educationCenter= new DTE_EducationCenterPages();

    @When("^Click on \"Education Center' tab$")
    public void click_on_Education_Center_tab() throws Throwable {
        Utilities.sleep(3);
        highlight(educationCenter.educationHprLink);
        Utilities.click(educationCenter.educationHprLink);
    }

    @Then("^Verify User is on 'Search OTI Education Center ' Screen$")
    public void verify_User_is_on_Search_OTI_Education_Center_Screen() throws Throwable {
        String expectedResult="Search OTI Education Centers";
        Assert.assertEquals(educationCenter.searchOtiEducationCenter.getText(),expectedResult);
    }

    @When("^Click on' Create' On Search OTI Education Center screen$")
    public void click_on_Create_On_Search_OTI_Education_Center_screen() throws Throwable {
        //highlight(educationCenter.createBtn);
    Utilities.click(educationCenter.createBtn);
    sleep(2);

    }

    @When("^Enter Data for all Mandatory fields$")
    public void enter_Data_for_all_Mandatory_fields() throws Throwable {
        sendKeysOnWebElement(educationCenter.educationCenterName,"George Mason University");
        sendKeysOnWebElement(educationCenter.educationCenterKey,"GMU");
        sendKeysOnWebElement(educationCenter.educationCenterCity, "Fairfax");
        Utilities.click(educationCenter.educationCenterState);
        Select selectState=new Select(educationCenter.educationCenterState);
        selectState.selectByValue("60");
        sendKeysOnWebElement(educationCenter.textArea, "https://www.gmuosha.org/");

    }

    @When("^Click on Save Button$")
    public void click_on_Save_Button() throws Throwable {
        highlight(educationCenter.saveBtn);
        Utilities.click(educationCenter.saveBtn);



    }

    @When("^Click 'ok' in information pop up$")
    public void click_ok_in_information_pop_up() throws Throwable {
        highlight(educationCenter.poUpBtn);
        Utilities.click(educationCenter.poUpBtn);
    }

    @When("^Click on 'Cancel' button to go to search screen$")
    public void click_on_Cancel_button_to_go_to_search_screen() throws Throwable {
      highlight(educationCenter.cancelBtn);
      Utilities.click(educationCenter.cancelBtn);

    }

    @When("^Input the recently created 'Education Center'as the search parameter$")
    public void input_the_recently_created_Education_Center_as_the_search_parameter() throws Throwable {
        highlight(educationCenter.educationNameSearch);
        sendKeysOnWebElement(educationCenter.educationNameSearch, "George Mason University");



    }

    @When("^Click on 'Search center' button$")
    public void click_on_Search_course_button() throws Throwable {
        highlight(educationCenter.searchBtn);
        Utilities.click(educationCenter.searchBtn);
    }

    @Then("^Verify recently created Education Center successfully displayed on the Page\\.$")
    public void verify_recently_created_Education_Center_successfully_displayed_on_the_Page() throws Throwable {
        String expectedResult="George Mason University";
        Assert.assertEquals(educationCenter.educationNameSearch.getAttribute("value"),expectedResult);
        Driver.closeDriver();

    }

}
