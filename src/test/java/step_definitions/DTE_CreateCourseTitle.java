package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.DTE_CoursesTitlePages;
import utilities.Utilities;

public class DTE_CreateCourseTitle {

    DTE_CoursesTitlePages dte_createCourseTitle=new DTE_CoursesTitlePages();

    @When("^Click on 'Course Titles' tab$")
    public void click_on_Course_Titles_tab() throws Throwable {
        Utilities.click(dte_createCourseTitle.courseTitleTab);

    }


    @Then("^Verify User  is on 'Search Course Title ' Screen$")
    public void verify_User_is_on_Search_Course_Title_Screen() throws Throwable {
        String expectedResult="Search OTI Course Titles";
        Assert.assertEquals(dte_createCourseTitle.otiCourseTitle.getText(),expectedResult);

    }

    @When("^Click on' Create' On Search OTI Course Title screen$")
    public void click_on_Create_On_Search_OTI_Course_Title_screen() throws Throwable {
        Utilities.click(dte_createCourseTitle.createBtn);
    }

    @When("^Enter  Data for all Mandatory fields$")
    public void enter_Data_for_all_Mandatory_fields() throws Throwable {

    }

    @When("^Click  on Save Button$")
    public void click_on_Save_Button() throws Throwable {

    }

    @When("^Click  'ok' in information pop up$")
    public void click_ok_in_information_pop_up() throws Throwable {

    }

    @When("^Click on  'Cancel' button to go to search screen$")
    public void click_on_Cancel_button_to_go_to_search_screen() throws Throwable {

    }

    @When("^Input the recently created  'Course title'as the search parameter$")
    public void input_the_recently_created_Course_title_as_the_search_parameter() throws Throwable {

    }

    @When("^Click on  'Search' button$")
    public void click_on_Search_button() throws Throwable {

    }

    @Then("^Verify recently  created course title successfully displayed on the Page$")
    public void verify_recently_created_course_title_successfully_displayed_on_the_Page() throws Throwable {

    }

}
