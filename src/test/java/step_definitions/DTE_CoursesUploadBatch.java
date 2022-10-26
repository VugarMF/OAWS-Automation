package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.DTE_EducationCenterPages;
import utilities.Driver;
import utilities.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DTE_CoursesUploadBatch extends Utilities {

    DTE_EducationCenterPages coursesUploadBatch=new DTE_EducationCenterPages();


    @When("^Click on \"Courses batch Upload' tab$")
    public void click_on_Courses_batch_Upload_tab() throws Throwable {
        highlight(coursesUploadBatch.courseBatchUploadHprLink);
        Utilities.click(coursesUploadBatch.courseBatchUploadHprLink);

    }

    @When("^Click on 'Choose File' Button$")
    public void click_on_Choose_File_Button() throws Throwable {
        highlight(coursesUploadBatch.chooseFile);
        sleep(2);
//        Utilities.click(coursesUploadBatch.chooseFile);
//        String path= System.getProperty("user.dir") +"" +
//               "C:\\Users\\mammadovv\\Desktop.CourseUploadFile.xlsx\"";
                coursesUploadBatch.chooseFile.sendKeys("C:\\Users\\mammadovv\\IdeaProjects\\OAWS-Automation\\test.xlsx");



//        Path path= Paths.get(System.getProperty("user.dir") +"\\Users\\mammadovv\\IdeaProjects\\OAWS-Automation\\src\\test\\java\\uploadFile\\CourseUploadFile.xlsx");
//        coursesUploadBatch.chooseFile.sendKeys(path.toString());

        //String path1 ="test.xlsx";
        //FileInputStream fileInputStream=new FileInputStream(path1);
       // XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);


    }
    


    @When("^Select the 'Courses Template' from Local drive$")
    public void select_the_Courses_Template_from_Local_drive() throws Throwable {

    }

    @When("^Click on 'Upload' button$")
    public void click_on_Upload_button() throws Throwable {

        Utilities.click(coursesUploadBatch.uploadBtn);
        sleep(4);
        highlight(coursesUploadBatch.uploadPopUpBtn);
        Utilities.click(coursesUploadBatch.uploadPopUpBtn);


    }

    @Then("^Verify Uploaded  Data shown in the Temporary holding database table, it reflects the received data from the excel file$")
    public void verify_Uploaded_Data_shown_in_the_Temporary_holding_database_table_it_reflects_the_received_data_from_the_excel_file() throws Throwable {
        String expectedResult="Note: The Data shown in the table below reflects the received data from the excel file.";
        Assert.assertEquals(coursesUploadBatch.noteToVerify.getText(),expectedResult);
    }

    @Then("^Data will be processed overnight' from the table$")
    public void data_will_be_processed_overnight_from_the_table() throws Throwable {

    }

    @Then("^Click on 'Courses\" tab$")
    public void click_on_Courses_tab() throws Throwable {
        Utilities.click(coursesUploadBatch.coursesHprLink);

    }

    @Then("^Input the recently Uploaded 'Course'as the search parameter$")
    public void input_the_recently_Uploaded_Course_as_the_search_parameter() throws Throwable {
        Utilities.click( coursesUploadBatch.startCalendarDate);
       Select selectStartMonth=new Select(coursesUploadBatch.courseStartMonth);
        selectStartMonth.selectByValue("9");
         coursesUploadBatch.courseStartYear.click();
         coursesUploadBatch.courseStartDay.click();
        Thread.sleep(2000);
        coursesUploadBatch.endCalendarDate.click();
        Select selectEndMonth=new Select(coursesUploadBatch.courseEndMonth);
        selectEndMonth.selectByValue("9");
        coursesUploadBatch.courseEndYear.click();
        Thread.sleep(2000);
        coursesUploadBatch.courseEndDay.click();

    }

    @Then("^Click on 'Search'  button$")
    public void click_on_Search_button() throws Throwable {
     Utilities.click(coursesUploadBatch.uploadSearchBtn);

    }

    @Then("^Verify  course successfully displayed on the Page$")
    public void verify_course_successfully_displayed_on_the_Page() throws Throwable {
    String expectedResult="#521 OSHA Guide to Industrial Hygiene";
    Assert.assertEquals(coursesUploadBatch.courseTitleVerify.getText(),expectedResult);
    //String expectedResult="#2225 Respiratory Protection";
    //Assert.assertEquals(coursesUploadBatch.courseTitleVerify.getText(),expectedResult);
//    Driver.closeDriver();
    }

//        String path1 ="test.xlsx";
//        FileInputStream fileInputStream=new FileInputStream(path1);
//        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
//        XSSFSheet sheet = workbook.getSheet("Data");
//        System.out.println("print text ====="+ sheet.getRow(1).getCell(1));
//
//        Path path= Paths.get(System.getProperty("user.dir") +"C:\\Users\\mammadovv\\IdeaProjects\\OAWS-Automation\\test.xlsx");
//        coursesUploadBatch.chooseFile.sendKeys(path.toString());
        //coursesUploadBatch.uploadBtn.click();
        //coursesUploadBatch.poUpBtn.click();


    }

