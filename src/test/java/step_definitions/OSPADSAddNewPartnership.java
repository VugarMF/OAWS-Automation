package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.LoginOspadsPages;
import pages.OSPADS_Pages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Utilities;

public class OSPADSAddNewPartnership extends Utilities {

    OSPADS_Pages ospadsAddNewPartnership=new OSPADS_Pages();
    @Given("^User Login OSPADS Application$")
    public void user_Login_OSPADS_Application() throws Throwable {
        Driver.getDriver().get(ConfigurationReader.getProperty("osha.OSPADS_url"));
        sleep(2);
        Utilities.loginOSPADS();

    }

    @Then("^Verify user is on Search Partnership Page$")
    public void verify_user_is_on_Search_Partnership_Page() throws Throwable {
        String expectedResult="Search Partnerships";
        Assert.assertEquals(ospadsAddNewPartnership.searchPartnership.getText(),expectedResult);



    }

    @Then("^Click New Partnership button$")
    public void click_New_Partnership_button() throws Throwable {
        highlight(ospadsAddNewPartnership.newPartnershipBtn);
        Utilities.click(ospadsAddNewPartnership.newPartnershipBtn);

    }

    @Then("^Verify User is on Partnership details page$")
    public void verify_User_is_on_Partnership_details_page() throws Throwable {
        String expectedResult="Partnership Details";
        Assert.assertEquals(ospadsAddNewPartnership.partnershipDetails.getText(),expectedResult);

    }

    @Then("^Enter Data for  all Mandatory fields$")
    public void enter_Data_for_all_Mandatory_fields() throws Throwable {



    }

    @When("^Click on 'commit all changes\" Button$")
    public void click_on_commit_all_changes_Button() throws Throwable {

    }

    @Then("^Verify User is on Participants/Signatories sub tab screen$")
    public void verify_User_is_on_Participants_Signatories_sub_tab_screen() throws Throwable {

    }

    @Then("^Click \"([^\"]*)\" button on information pop up$")
    public void click_button_on_information_pop_up(String arg1) throws Throwable {

    }

    @Then("^Click \"([^\"]*)\" button$")
    public void click_button(String arg1) throws Throwable {

    }

    @Then("^Click \"([^\"]*)\" on Is this OSHA Office Popup$")
    public void click_on_Is_this_OSHA_Office_Popup(String arg1) throws Throwable {

    }

    @Then("^Select Office name$")
    public void select_Office_name() throws Throwable {

    }

    @Then("^Click on \"([^\"]*)\" button$")
    public void click_on_button(String arg1) throws Throwable {

    }

    @Then("^Click on Origination office \"([^\"]*)\"$")
    public void click_on_Origination_office(String arg1) throws Throwable {

    }

    @When("^Click  \"([^\"]*)\" on Information popup$")
    public void click_on_Information_popup(String arg1) throws Throwable {

    }

    @When("^Click on 'Evaluation info'  sub tab$")
    public void click_on_Evaluation_info_sub_tab() throws Throwable {

    }

    @Then("^Verify User is on \"([^\"]*)\" Screen$")
    public void verify_User_is_on_Screen(String arg1) throws Throwable {

    }

    @Then("^Select \"([^\"]*)\" and \"([^\"]*)\"$")
    public void select_and(String arg1, String arg2) throws Throwable {

    }

    @When("^Click on 'Commit all changes' button$")
    public void click_on_Commit_all_changes_button() throws Throwable {

    }

    @When("^Click On \"([^\"]*)\" tab$")
    public void click_On_tab(String arg1) throws Throwable {

    }

    @Then("^Verify user is on \"search Partnership Page$")
    public void verify_user_is_on_search_Partnershp_Page() throws Throwable {

    }

    @Then("^Enter \"([^\"]*)\" as search input$")
    public void enter_as_search_input(String arg1) throws Throwable {

    }

    @When("^Click on \"([^\"]*)\" Button$")
    public void click_on_Button(String arg1) throws Throwable {

    }

    @Then("^Verify recently created Partnership successfully displayed on the Page$")
    public void verify_recently_created_Partnership_successfully_displayed_on_the_Page() throws Throwable {

    }

    @Then("^Click on view/edit button$")
    public void click_on_view_edit_button() throws Throwable {

    }

    @Then("^Verify user navigates to partnership details screen$")
    public void verify_user_navigates_to_partnership_details_screen() throws Throwable {

    }

}
