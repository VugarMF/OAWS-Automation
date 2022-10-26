package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.DTE_SearchCoursePages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Utilities;

import java.io.File;

import static org.apache.commons.io.FileUtils.waitFor;

public class DTE_SearchCourse {

DTE_SearchCoursePages dte_searchCourse=new DTE_SearchCoursePages();

    @Given("^Enter input Criteria for Search on Search OTI Education Center Course Screen and Click on 'Search' button$")
    public void enter_input_Criteria_for_Search_on_Search_OTI_Education_Center_Course_Screen_and_Click_on_Search_button() throws Throwable {

        Driver.getDriver().get(ConfigurationReader.getProperty("osha.url1"));
        Utilities.login();
        Utilities.sleep(2);
        dte_searchCourse.coursesHprLink.click();
        dte_searchCourse.OtiEducationDropdown.click();
        //String expectedOtiCenter="Utah";
        Select selectOtiEducation=new Select(dte_searchCourse.OtiEducationDropdown);
        selectOtiEducation.selectByValue("21");
        Utilities.sleep(2);
        Utilities.click(dte_searchCourse.searchBtn);


      // Utilities.dropdownOptionsAsString(dte_searchCourse.OtiEducationDropdown);

        }
          //  Assert.assertEquals(actualOtiCenter.expectedOtiCenter);


    @When("^Click on 'Course Title' hyper link of the record to see the details and navigate to 'Education center Course' screen$")
    public void click_on_Course_Title_hyper_link_of_the_record_to_see_the_details_and_navigate_to_Education_center_Course_screen() throws Throwable {

        dte_searchCourse.courseTitleHprLink.click();
        Utilities.sleep(2);
    }
    @Then("^Click on 'Cancel' button$")
    public void click_on_Cancel_button() throws Throwable {
    dte_searchCourse.cancelBtn.click();

    Utilities.verifyElementDisplayed(dte_searchCourse.advancedBtn);

    }

}

