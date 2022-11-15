package step_definitions;

import cucumber.api.java.en.Then;
import org.testng.Assert;
import pages.DTE_EducationCenterPages;
import utilities.Driver;
import utilities.Utilities;

public class DTE_SearchEducationCenter extends Utilities {

    DTE_EducationCenterPages searchEducationCenter=new DTE_EducationCenterPages();

    @Then("^Input the 'Education Center'as the search parameter$")
    public void input_the_Education_Center_as_the_search_parameter() throws Throwable {
        Utilities.sleep(3);
        highlight(searchEducationCenter.educationNameSearch);
        sendKeysOnWebElement(searchEducationCenter.educationNameSearch,"George Mason University");
        sleep(2);
        highlight(searchEducationCenter.searchBtn);
        Utilities.click(searchEducationCenter.searchBtn);
    }

    @Then("^Verify  Education Center successfully displayed on the Page$")
    public void verify_Education_Center_successfully_displayed_on_the_Page() throws Throwable {
        String expectedResult="George Mason University";
        Assert.assertEquals(searchEducationCenter.educationNameSearch.getAttribute("value"),expectedResult);
        Driver.closeDriver();

    }


}
