package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DTE_SearchCourseTitlePages {

    public DTE_SearchCourseTitlePages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="r1:0:l2::text")
    public WebElement coursesHprLink;

        @FindBy(xpath = "(//button[@class='xg8 p_AFTextOnly'])[2]")
        public WebElement searchBtn;

        @FindBy(xpath = "//a[.='Course Titles']")
        public WebElement courseTitleHprLink;


        @FindBy(xpath = "(//span[.='Buffalo'])[2]")
        public WebElement courseSearchResult;


        @FindBy(xpath = "//h1[.='Search OTI Course Titles']")
        public WebElement otiCourseTitle;
    }
