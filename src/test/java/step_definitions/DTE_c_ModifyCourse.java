package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.DTE_CoursesPages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Utilities;

public class DTE_c_ModifyCourse extends Utilities{

    DTE_CoursesPages dte_modifyCourse=new DTE_CoursesPages();
    @Given("^User Login DTE  Application$")
    public void user_Login_DTE_Application() throws Throwable {
        Utilities.sleep(3);
        Driver.getDriver().get(ConfigurationReader.getProperty("osha.DTE_url"));
        Utilities.loginDTE();
    }

    @Then("^Verify user is  on home Page$")
    public void verify_user_is_on_home_Page() throws Throwable {
        String expectedUrl = "https://portalstage.osha.gov/dte/dteadmin/faces/DTEAdmin";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedUrl);

    }

    @Then("^Click  Courses  Tab$")
    public void click_Courses_Tab() throws Throwable {
        highlight(dte_modifyCourse.coursesTab);
        sleep(2);
        Utilities.click(dte_modifyCourse.coursesTab);
    }

    @Then("^Verify User  is on Course Page$")
    public void verify_User_is_on_Course_Page() throws Throwable {
        String expectedTitle = "DTEAdmin";
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }

    @Then("^Enter input Criteria for  Search on Search OTI Education Center Course  Screen$")
    public void enter_input_Criteria_for_Search_on_Search_OTI_Education_Center_Course_Screen() throws Throwable {
        Utilities.sleep(2);
        Utilities.click(dte_modifyCourse.SearchOtiEducationDropdown);
        Utilities.sleep(3);
        selectByValue(dte_modifyCourse.SearchOtiEducationDropdown,"3");

    }

    @When("^Click on 'Search ' button$")
    public void click_on_Search_button() throws Throwable {
     Utilities.sleep(2);
     Utilities.click(dte_modifyCourse.searchBtn);    }

    @Then("^Verify Grid table displayed  a search results$")
    public void verify_Grid_table_displayed_a_search_results() throws Throwable {
        Utilities.verifyElementDisplayed(dte_modifyCourse.courseSearchResult);

    }

    @When("^Click on 'Course  Title' hyper link of the record to see the details$")
    public void click_on_Course_Title_hyper_link_of_the_record_to_see_the_details() throws Throwable {
        Utilities.sleep(2);
        Utilities.click(dte_modifyCourse.courseTitleHprLink);

    }

    @Then("^Verify  Navigate to 'Education center Course' screen$")
    public void verify_Navigate_to_Education_center_Course_screen() throws Throwable {
        String expectedResult="OTI Education Center Course";
        Assert.assertEquals(dte_modifyCourse.verifyOtiEducationCenter.getText(),expectedResult);
    }

    @Then("^Modify the data in selected course$")
    public void modify_the_data_in_selected_course() throws Throwable {
        Utilities.highlight(dte_modifyCourse.modifyCityName);
        highlight(dte_modifyCourse.modifyCityName);
        sendKeysOnWebElement(dte_modifyCourse.modifyCityName,"Richmond");


    }

    @When("^Click on Save button$")
    public void click_on_Save_button() throws Throwable {
        Utilities.highlight(dte_modifyCourse.saveBtn);
        Utilities.click(dte_modifyCourse.saveBtn);
        Utilities.sleep(2);
        Utilities.highlight(dte_modifyCourse.popUpBtn);
        Utilities.click(dte_modifyCourse.popUpBtn);

    }

    @Then("^Verify Modified data successfully Saved$")
    public void verify_Modified_data_successfully_Saved() throws Throwable {
      String expectedResult="Richmond";
        System.out.println("print text = "+ dte_modifyCourse.modifyCityName.getAttribute("value"));
  Assert.assertEquals(dte_modifyCourse.modifyCityName.getAttribute("value"),expectedResult);
        Driver.closeDriver();

    }

}
