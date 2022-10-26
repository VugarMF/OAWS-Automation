package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.DTE_CoursesPages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Utilities;

public class DTE_a_CreateCourse extends Utilities {

    DTE_CoursesPages dte_createCourse=new DTE_CoursesPages();

    @Given("^User login DTE application$")
    public void user_login_DTE_application() throws Throwable {
        Utilities.sleep(3);
        Driver.getDriver().get(ConfigurationReader.getProperty("osha.DTE_url"));
        Utilities.loginDTE();

    }

    @Then("^Verify user is on home page$")
    public void verify_user_is_on_home_page() throws Throwable {
        String expectedUrl="https://portalstage.osha.gov/dte/dteadmin/faces/DTEAdmin";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),expectedUrl);

    }
    @Then("^Click Courses Tab$")
    public void click_Courses_Tab() throws Throwable {
        highlight(dte_createCourse.coursesTab);
        Utilities.click(dte_createCourse.coursesTab);
        //dte_createCourse.coursesTab.click();
    }
    @Then("^verify user is on course page$")
    public void verify_user_is_on_course_page() throws Throwable {
        String expectedTitle="DTEAdmin";
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);

    }
    @When("^Click on 'Create'  on Search OTI Education centers screen$")
    public void click_on_Create_on_Search_OTI_Education_centers_screen() throws Throwable {
        //dte_createCourse.createBtn.click();
        sleep(2);
        highlight(dte_createCourse.createBtn);
        Utilities.click(dte_createCourse.createBtn);
    }
        @And("^Enter data for all mandatory fields$")
    public void enter_data_for_all_mandatory_fields() throws InterruptedException {
        sleep(2);
        Utilities.selectByValue(dte_createCourse.OtiEducationDropdown,"3");
        highlight(dte_createCourse.courseTitleDropdown);
        Utilities.selectByValue(dte_createCourse.courseTitleDropdown,"11");
        highlight(dte_createCourse.location);
        sendKeysOnWebElement(dte_createCourse.location,"NOVA Community College");
        sendKeysOnWebElement(dte_createCourse.address,"1345 Fairfax Blvd");
        sendKeysOnWebElement(dte_createCourse.city,"Springfield");
        selectByValue(dte_createCourse.stateDropdown,"13");
            Utilities.click( dte_createCourse.startCalendarDate);
            selectByValue(dte_createCourse.courseStartMonth, "9");
            Utilities.sleep(2);
            Utilities.click(dte_createCourse.courseStartYear);
           Utilities.click(dte_createCourse.courseStartDay);
           sleep(2);
            Utilities.click(dte_createCourse.endCalendarDate);
            selectByValue(dte_createCourse.courseEndMonth,"10");
            sleep(2);
            Utilities.click(dte_createCourse.courseEndYear);
            Utilities.click(dte_createCourse.courseEndDay);
            sendKeysOnWebElement( dte_createCourse.numberOfDays,"7");
            sendKeysOnWebElement(dte_createCourse.contactHours,"28");
            sendKeysOnWebElement( dte_createCourse.courseCost,"1000");
            System.out.println(2);
            selectByValue(dte_createCourse.industryDropdown,"2");
            selectByValue(dte_createCourse.languageDropdown,"9");

//        Select selectOtiEducation=new Select(dte_createCourse.OtiEducationDropdown);
//        selectOtiEducation.selectByValue("22");
//        Thread.sleep(2000);
//        Select selectCourseTitle=new Select(dte_createCourse.courseTitleDropdown);
//        selectCourseTitle.selectByValue("6");
//        dte_createCourse.location.sendKeys("Utah Community College");
//        dte_createCourse.address.sendKeys("1245 Main st");
//        dte_createCourse.city.sendKeys("Alexandria");
//        Select selectState=new Select(dte_createCourse.stateDropdown);
//        selectState.selectByValue("57");
//        Select selectStartMonth=new Select(dte_createCourse.courseStartMonth);
//        selectStartMonth.selectByValue("9");
//        Thread.sleep(2000);
//        dte_createCourse.endCalendarDate.click();
//        Select selectEndMonth=new Select(dte_createCourse.courseEndMonth);
//        selectEndMonth.selectByValue("10");
//        dte_createCourse.courseEndYear.click();
//        Thread.sleep(2000);
//        dte_createCourse.courseEndDay.click();
//        Thread.sleep(2000);
//        dte_createCourse.numberOfDays.sendKeys("7");
//        dte_createCourse.contactHours.sendKeys("28");
//        dte_createCourse.courseCost.sendKeys("1000");
//        Select selectGeneralIndustry=new Select(dte_createCourse.industryDropdown);
//        selectGeneralIndustry.selectByValue("2");
//        Select selectLanguage=new Select(dte_createCourse.languageDropdown);
//        selectLanguage.selectByValue("9");

    }

    @And("^Click on 'Save' button$")
    public void click_on_Save_button() throws Throwable {
     Utilities.click(dte_createCourse.saveBtn);
     sleep(2);
     Utilities.click(dte_createCourse.alertBtn);
    }

    @And("^Click on 'Cancel' button to go to Search Screen$")
   public void click_on_Cancel_button_to_go_to_Search_Screen() throws Throwable {
    Utilities.click(dte_createCourse.cancelBtn);
    sleep(2);
    }

    @And("^Input the recently created 'Course' as the search parameter$")
    public void input_the_recently_created_Course_as_the_search_parameter() throws Throwable {
//        Select selectEducationCenter=new Select(dte_createCourse.educationCenterDropdown);
//        selectEducationCenter.selectByValue("22");
        selectByValue(dte_createCourse.educationCenterDropdown,"3" );
    }

    @And("^Click on 'Search' button$")
    public void click_on_Search_button() throws Throwable {
        Utilities.click(dte_createCourse.searchBtn);


    }
    @Then("^Verify recently created course successfully displayed on the page$")
    public void verify_recently_created_course_successfully_displayed_on_the_page() throws Throwable {
        String expectedResult="Buffalo";
        Assert.assertEquals(dte_createCourse.createdCourseCenter.getText(),expectedResult);
        //Utilities.verifyElementDisplayed(dte_createCourse.createdCourseCenter);
        Driver.closeDriver();

    }

}