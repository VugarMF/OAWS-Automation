package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DTE_CoursesTitlePages {

    public DTE_CoursesTitlePages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(xpath = "//a[.='Course Titles']")
        public WebElement courseTitleTab;

    @FindBy(xpath = "//h1[.='Search OTI Course Titles']")
    public WebElement otiCourseTitle;
    @FindBy(xpath="//span[@class='xfx']")
    public WebElement createCourseTitleBtn;

   @FindBy(id="r1:1:r1:2:it1::content")
    public WebElement CourseTitleId;

   @FindBy(id="r1:1:r1:2:it2::content")
    public WebElement CourseTitleName;

   @FindBy(id="r1:1:r1:2:it4::content")
    public WebElement CourseTitleTextArea;

    @FindBy(xpath = "(//span[@class='xfx'])[1]")
    public WebElement saveBtn;

     @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement popUpBtn;

    @FindBy(xpath = "//span[.='Cancel']")
        public WebElement cancelBtn;

    @FindBy(id="r1:1:r1:1:qryId1:val00::content")
    public WebElement courseTitleSearch;

    @FindBy(id="r1:1:r1:1:qryId1::search")
    public WebElement searchBtn;

    //@FindBy(xpath = "(//button[@class='xg8 p_AFTextOnly'])[2]")
    //public WebElement searchBtn;

    @FindBy(xpath = "(//span[.='#2233 Hazardous Materials'])[1]")
    public WebElement courseTitleVerify;

        @FindBy(xpath = "(//button[@class='xg8 p_AFTextOnly'])[1]")
        public WebElement advancedBtn;

        @FindBy(xpath = "(//span[.='Buffalo'])[2]")
        public WebElement courseSearchResult;

        @FindBy(xpath = "(//span[@class='x1al'])[3]")
        public WebElement educationCtrCrsScreen;
    }

