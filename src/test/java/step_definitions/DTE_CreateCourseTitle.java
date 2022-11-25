package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.DTE_CoursesTitlePages;
import utilities.Driver;
import utilities.Utilities;

public class DTE_CreateCourseTitle  extends Utilities{

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

    @When("^Click on 'Create' On Search OTI  Course Title screen$")
    public void click_on_Create_On_Search_OTI_Course_Title_screen() throws Throwable {
        sleep(2);
        //Utilities.highlight(dte_createCourseTitle.createCourseTitleBtn);
        Utilities.click(dte_createCourseTitle.createCourseTitleBtn);
    }

    @When("^Enter  Data for all Mandatory fields$")
    public void enter_Data_for_all_Mandatory_fields() throws Throwable {
        highlight(dte_createCourseTitle.CourseTitleId);
        sendKeysOnWebElement(dte_createCourseTitle.CourseTitleId,"2233");
        highlight(dte_createCourseTitle.CourseTitleName);
        sleep(2);
        sendKeysOnWebElement(dte_createCourseTitle.CourseTitleName,"Hazardous Materials");
        highlight(dte_createCourseTitle.CourseTitleTextArea);
        sendKeysOnWebElement(dte_createCourseTitle.CourseTitleTextArea,"This shortened version of #2010 covers " +
                "OSHA general industry standards and integrates materials");


    }

    @When("^Click  on Save Button$")
    public void click_on_Save_Button() throws Throwable {
        Utilities.click(dte_createCourseTitle.saveBtn);

    }

    @When("^Click  'ok' in information pop up$")
    public void click_ok_in_information_pop_up() throws Throwable {
        Utilities.click(dte_createCourseTitle.popUpBtn);

    }

    @When("^Click on  'Cancel' button to go to search screen$")
    public void click_on_Cancel_button_to_go_to_search_screen() throws Throwable {
Utilities.click(dte_createCourseTitle.cancelBtn);
    }

    @When("^Input the recently created  'Course title'as the search parameter$")
    public void input_the_recently_created_Course_title_as_the_search_parameter() throws Throwable {
        sendKeysOnWebElement(dte_createCourseTitle.courseTitleSearch, "2233");

    }

    @When("^Click on  'Search' button$")
    public void click_on_Search_button() throws Throwable {
        Utilities.click(dte_createCourseTitle.searchBtn);

    }

    @Then("^Verify recently  created course title successfully displayed on the Page$")
    public void verify_recently_created_course_title_successfully_displayed_on_the_Page() throws Throwable {
        //String expectedResult="2233";
        //Assert.assertEquals(dte_createCourseTitle.courseTitleVerify,expectedResult);
        //Assert.assertEquals(dte_createCourseTitle.courseTitleVerify.getText(),"2233");
        verifyElementDisplayed(dte_createCourseTitle.courseTitleVerify);
        Driver.closeDriver();

    }

}
