package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DTE_CoursesPages;
import utilities.Driver;
import utilities.Utilities;

public class DTE_ExportToExcel extends Utilities{

    DTE_CoursesPages dte_exportToExcel=new DTE_CoursesPages();

    @Then("^Click on'Menu'$")
    public void click_on_Menu() throws Throwable {
        highlight(dte_exportToExcel.menuBtn);
        Utilities.click(dte_exportToExcel.menuBtn);
        Utilities.sleep(3);

    }

    @When("^Click on 'Export to Excel' Button$")
    public void click_on_Export_to_Excel_Button() throws Throwable {
        highlight(dte_exportToExcel.exportBtn);
        Utilities.click(dte_exportToExcel.exportBtn);


    }

    @Then("^Verify Export to excel downloaded Successfully$")
    public void verify_Export_to_excel_downloaded_Successfully() throws Throwable {
        System.out.println("Excel file downloaded successfully");
        Driver.closeDriver();
    }

}
