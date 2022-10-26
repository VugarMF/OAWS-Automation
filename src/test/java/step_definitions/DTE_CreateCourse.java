package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.DTE_CreateCoursePages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Utilities;

public class DTE_CreateCourse {

    DTE_CreateCoursePages dte_createCourse=new DTE_CreateCoursePages();
    @Given("^User login DTE application and click courses hyperlink$")
    public void user_login_DTE_application_and_click_courses_hyperlink() throws Throwable {
        Driver.getDriver().get(ConfigurationReader.getProperty("osha.url1"));
        Utilities.login();
        dte_createCourse.coursesHprLink.click();
    }
    @When("^Click on 'Create'  on Search OTI Education centers screen$")
    public void click_on_Create_on_Search_OTI_Education_centers_screen() throws Throwable {
    dte_createCourse.createBtn.click();
    }

    @And("^Enter data for all mandatory fields$")
    public void enter_data_for_all_mandatory_fields() throws InterruptedException {
        Select selectOtiEducation=new Select(dte_createCourse.OtiEducationDropdown);
        selectOtiEducation.selectByValue("21");
        Thread.sleep(2000);
        Select selectCourseTitle=new Select(dte_createCourse.courseTitleDropdown);
        selectCourseTitle.selectByValue("6");
        dte_createCourse.location.sendKeys("Utah Community College");
        dte_createCourse.address.sendKeys("1245 Main st");
        dte_createCourse.city.sendKeys("Alexandria");
        Select selectState=new Select(dte_createCourse.stateDropdown);
        selectState.selectByValue("56");
       Utilities.click( dte_createCourse.startCalendarDate);
        Select selectStartMonth=new Select(dte_createCourse.courseStartMonth);
        selectStartMonth.selectByValue("9");
        dte_createCourse.courseStartYear.click();
        dte_createCourse.courseStartDay.click();
        Thread.sleep(2000);
        dte_createCourse.endCalendarDate.click();
        Select selectEndMonth=new Select(dte_createCourse.courseEndMonth);
        selectEndMonth.selectByValue("10");
        dte_createCourse.courseEndYear.click();
        Thread.sleep(2000);
        dte_createCourse.courseEndDay.click();
        Thread.sleep(2000);
        dte_createCourse.numberOfDays.sendKeys("7");
        dte_createCourse.contactHours.sendKeys("28");
        dte_createCourse.courseCost.sendKeys("1000");
        Select selectGeneralIndustry=new Select(dte_createCourse.industryDropdown);
        selectGeneralIndustry.selectByValue("2");
        Select selectLanguage=new Select(dte_createCourse.languageDropdown);
        selectLanguage.selectByValue("9");

    }
    @And("^Click on 'Save' button$")
    public void click_on_Save_button() throws Throwable {
    dte_createCourse.saveBtn.click();
    Thread.sleep(2000);
    dte_createCourse.alertBtn.click();
    }

    @And("^Click on 'Cancel' button to go to Search Screen$")
    public void click_on_Cancel_button_to_go_to_Search_Screen() throws Throwable {
    dte_createCourse.cancelBtn.click();
    Thread.sleep(2000);
    }

    @And("^Input the recently created 'Course' as the search parameter$")
    public void input_the_recently_created_Course_as_the_search_parameter() throws Throwable {
        Select selectEducationCenter=new Select(dte_createCourse.educationCenterDropdown);
        selectEducationCenter.selectByValue("21");
    }

    @Then("^Click on 'Search' button$")
    public void click_on_Search_button() throws Throwable {
        dte_createCourse.searchBtn.click();
        //Driver.closeDriver();

    }
}