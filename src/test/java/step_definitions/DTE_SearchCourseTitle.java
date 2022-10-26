package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.DTE_SearchCourseTitlePages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Utilities;

public class DTE_SearchCourseTitle {

    DTE_SearchCourseTitlePages dte_searchCourseTitle= new DTE_SearchCourseTitlePages();

    @Given("^User  Login DTE Application$")
    public void user_Login_DTE_Application() throws Throwable {
        Driver.getDriver().get(ConfigurationReader.getProperty("osha.DTE_url"));
        Utilities.loginDTE();

    }

    @Then("^Verify user  is on home Page$")
    public void verify_user_is_on_home_Page() throws Throwable {
        String expectedUrl = "https://portalstage.osha.gov/dte/dteadmin/faces/DTEAdmin";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedUrl);
    }

    @Then("^Click Courses  Hyper  link$")
    public void click_Courses_Hyper_link() throws Throwable {
Utilities.click(dte_searchCourseTitle.coursesHprLink);
    }

    @Then("^Verify User is on  Course Page$")
    public void verify_User_is_on_Course_Page() throws Throwable {
        String expectedTitle = "DTEAdmin";
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    @When("^Click on \"Course Titles' tab$")
    public void click_on_Course_Titles_tab() throws Throwable {
        Utilities.sleep(2);
     Utilities.click(dte_searchCourseTitle.courseTitleHprLink);
    }

    @Then("^Verify User is on 'Search Course Title ' Screen$")
    public void verify_User_is_on_Search_Course_Title_Screen() throws Throwable {
        String expectedResult="Search OTI Course Titles";
        Assert.assertEquals(dte_searchCourseTitle.otiCourseTitle.getText(),expectedResult);
        //Driver.closeDriver();

    }

    @Then("^Input the 'Course title' as the search parameter$")
    public void input_the_Course_title_as_the_search_parameter() throws Throwable {


    }

    @Then("^Click on 'Search'   button$")
    public void click_on_Search_button() throws Throwable {

    }

    @Then("^Verify course title successfully displayed on the Page$")
    public void verify_course_title_successfully_displayed_on_the_Page() throws Throwable {

    }

}
