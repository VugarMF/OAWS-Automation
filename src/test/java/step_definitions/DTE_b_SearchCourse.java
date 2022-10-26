package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.DTE_CoursesPages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Utilities;

public class DTE_b_SearchCourse extends Utilities{

    DTE_CoursesPages dte_searchCourse = new DTE_CoursesPages();

    @Given("^User Login  DTE Application$")
    public void user_Login_DTE_Application() throws Throwable {
        Driver.getDriver().get(ConfigurationReader.getProperty("osha.DTE_url"));
        Utilities.loginDTE();
    }

    @Then("^Verify user is on  home Page$")
    public void verify_user_is_on_home_Page() throws Throwable {
        String expectedUrl = "https://portalstage.osha.gov/dte/dteadmin/faces/DTEAdmin";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedUrl);

    }

    @Then("^Click Courses  Tab$")
    public void click_Courses_Tab() throws Throwable {
        Utilities.sleep(2);
        dte_searchCourse.coursesTab.click();
    }

    @Then("^Verify User is on Course  Page$")
    public void verify_User_is_on_Course_Page() throws Throwable {
        String expectedTitle = "DTEAdmin";
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    @Then("^Enter input  Criteria for Search on Search OTI Education Center Course  Screen$")
    public void enter_input_Criteria_for_Search_on_Search_OTI_Education_Center_Course_Screen() throws Throwable {
        Utilities.sleep(2);
        Utilities.click(dte_searchCourse.SearchOtiEducationDropdown);
        selectByValue(dte_searchCourse.SearchOtiEducationDropdown,"3");

//        Select selectOtiEducation = new Select(dte_searchCourse.OtiEducationDropdown);
//        selectOtiEducation.selectByValue("10");
    }


    @When("^Click on Search  button$")
    public void click_on_Search_button() throws Throwable {
        Utilities.sleep(2);
        Utilities.click(dte_searchCourse.searchBtn);

    }
    @Then("^Verify Grid table displayed a search results$")
    public void verify_Grid_table_displayed_a_search_results() throws Throwable {
     Utilities.verifyElementDisplayed(dte_searchCourse.courseSearchResult);
    }
    @When("^Click on 'Course Title'  hyper link of the record to see the details$")
    public void click_on_Course_Title_hyper_link_of_the_record_to_see_the_details() throws Throwable {
        Utilities.click(dte_searchCourse.courseTitleHprLink);
        //Utilities.sleep(2);
    }
        //dte_searchCourse.coursesHprLink.click();
    //String expectedOtiCenter="Utah";
    // Utilities.dropdownOptionsAsString(dte_searchCourse.OtiEducationDropdown);
    //  Assert.assertEquals(actualOtiCenter.expectedOtiCenter);


    @Then("^Verify Navigate to 'Education center Course' screen$")
    public void verify_Navigate_to_Education_center_Course_screen() throws Throwable {
        String expectedResult="OTI Education Center Course";
        Assert.assertEquals(dte_searchCourse.verifyOtiEducationCenter.getText(),expectedResult);
        Driver.closeDriver();

    }


    }


