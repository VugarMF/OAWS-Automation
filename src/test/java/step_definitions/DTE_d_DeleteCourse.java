package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.DTE_CoursesPages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Utilities;

public class DTE_d_DeleteCourse extends Utilities {

    DTE_CoursesPages dte_deleteCourse = new DTE_CoursesPages();

    @Given("^User Login DTE Application$")
    public void user_Login_DTE_Application() throws Throwable {
        Driver.getDriver().get(ConfigurationReader.getProperty("osha.DTE_url"));
        Utilities.loginDTE();
    }

    @Then("^Verify user is on home Page$")
    public void verify_user_is_on_home_Page() throws Throwable {
        String expectedUrl = "https://portalstage.osha.gov/dte/dteadmin/faces/DTEAdmin";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedUrl);

    }

    @Then("^Click  Courses Tab$")
    public void click_Courses_Hyper_link() throws Throwable {
        Utilities.click(dte_deleteCourse.coursesTab);
    }

    @Then("^Verify User is on Course Page$")
    public void verify_User_is_on_Course_Page() throws Throwable {
        String expectedTitle = "DTEAdmin";
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    @Then("^Enter input Criteria for Search on Search OTI Education Center Course  Screen$")
    public void enter_input_Criteria_for_Search_on_Search_OTI_Education_Center_Course_Screen() throws Throwable {
        Utilities.sleep(2);
        Utilities.click(dte_deleteCourse.SearchOtiEducationDropdown);
        selectByValue(dte_deleteCourse.SearchOtiEducationDropdown, "3");
    }

    @Then("^Click on Search button$")
    public void click_on_Search_button() throws Throwable {
        Utilities.sleep(2);
        highlight(dte_deleteCourse.searchBtn);
        Utilities.click(dte_deleteCourse.searchBtn);
    }

    @Then("^Verify  Grid table displayed a search results$")
    public void verify_Grid_table_displayed_a_search_results() throws Throwable {
        Utilities.verifyElementDisplayed(dte_deleteCourse.courseSearchResult);
    }

    @When("^Click on 'Course Title' hyper link of the record to see the details$")
    public void click_on_Course_Title_hyper_link_of_the_record_to_see_the_details() throws Throwable {
        Utilities.sleep(2);
        highlight(dte_deleteCourse.courseTitleHprLink);
        Utilities.click(dte_deleteCourse.courseTitleHprLink);
    }

    @Then("^Verify Navigates to 'Education center Course' screen$")
    public void verify_Navigates_to_Education_center_Course_screen() throws Throwable {
        String expectedResult = "OTI Education Center Course";
        Assert.assertEquals(dte_deleteCourse.verifyOtiEducationCenter.getText(), expectedResult);
    }

    @When("^Click on 'Delete' button$")
    public void click_on_Delete_button() throws Throwable {
        Utilities.click(dte_deleteCourse.deleteBtn);

    }

    @When("^Click  'Yes' button on Warning pop up$")
    public void click_Yes_button_on_Warning_pop_up() throws Throwable {
        highlight(dte_deleteCourse.popUpYesBtn);
        Utilities.click(dte_deleteCourse.popUpYesBtn);
    }

    @When("^Enter  deleted record input Criteria for Search on Search OTI Education Center Course  Screen$")
    public void enter_deleted_record_input_Criteria_for_Search_on_Search_OTI_Education_Center_Course_Screen() throws Throwable {
        selectByValue(dte_deleteCourse.educationCenterDropdown, "3");
    }

    @When("^Click on the Search button$")
    public void click_on_the_Search_button() throws Throwable {
        Utilities.click(dte_deleteCourse.searchBtn);
    }

    @Then("^Verify record deleted successfully$")
    public void verify_record_deleted_successfully() throws Throwable {
        //verifyElementNotDisplayed(dte_deleteCourse.courseTitleHprLink);
       verifyElementIsNotDisplayed((dte_deleteCourse.courseTitleHprLink));
       Driver.closeDriver();
    }
}