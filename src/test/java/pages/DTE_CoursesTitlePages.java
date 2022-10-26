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
    @FindBy(xpath="//span[.='Create']")
    public WebElement createBtn;

   @FindBy(id="r1:1:r1:2:it1::content")
    public WebElement CourseTitleId;


    //@FindBy(xpath = "//a[.='Course Titles']")
    //public WebElement courseTitleHprLink;


    @FindBy(xpath = "//span[.='Cancel']")
        public WebElement cancelBtn;

        @FindBy(xpath = "(//button[@class='xg8 p_AFTextOnly'])[1]")
        public WebElement advancedBtn;

        @FindBy(xpath = "(//span[.='Buffalo'])[2]")
        public WebElement courseSearchResult;

        @FindBy(xpath = "(//span[@class='x1al'])[3]")
        public WebElement educationCtrCrsScreen;
    }

