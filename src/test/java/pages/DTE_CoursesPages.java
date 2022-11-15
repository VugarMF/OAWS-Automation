package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DTE_CoursesPages {

    public DTE_CoursesPages(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="r1:0:l2::text")
    public WebElement coursesTab;

    @FindBy(xpath="//span[.='Create']")
    public WebElement createBtn;

    @FindBy(name="r1:1:r1:1:soc1")
    public WebElement OtiEducationDropdown;

    @FindBy(id="r1:1:r1:1:soc2::content")
    public WebElement courseTitleDropdown;

    @FindBy(name="r1:1:r1:1:it1")
    public WebElement location;

    @FindBy(name="r1:1:r1:1:it2")
    public WebElement address;

    @FindBy(name="r1:1:r1:1:it3")
    public WebElement city;

    @FindBy(id="r1:1:r1:1:soc3::content")
    public WebElement stateDropdown;

    @FindBy(id="r1:1:r1:1:id1::content")
    public WebElement inputStartDate;

    @FindBy(id="r1:1:r1:1:id1::glyph")
    public  WebElement startCalendarDate;
    @FindBy(id="r1:1:r1:1:id2::glyph")
    public  WebElement endCalendarDate;

    @FindBy(id="r1:1:r1:1:id1::pop::cd::mSel::content")
    public  WebElement courseStartMonth;
    @FindBy(id="r1:1:r1:1:id2::pop::cd::mSel::content")
    public  WebElement courseEndMonth;


    @FindBy(xpath ="//td[.='24']")
    public WebElement courseStartDay;

    @FindBy(xpath ="//td[.='1']")
    public WebElement courseEndDay;

    @FindBy(xpath = "//input[@value='2022']")
    public WebElement courseStartYear;

    @FindBy(xpath = "//input[@value='2022']")
    public WebElement courseEndYear;


    @FindBy(xpath="(//input[@class='x25'])[5]")
    public WebElement numberOfDays;

    @FindBy(xpath="(//input[@class='x25'])[6]")
    public WebElement contactHours;

    @FindBy(xpath="(//input[@class='x25'])[7]")
    public WebElement courseCost;

    @FindBy(xpath="(//select[@class='x2h'])[4]")
    public WebElement industryDropdown;

    @FindBy(xpath="(//select[@class='x2h'])[5]")
    public WebElement languageDropdown;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//span[.='Cancel']")
    public WebElement cancelBtn;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement alertBtn;
    @FindBy(xpath = "(//select[@class='x2h'])[1]")
    public WebElement educationCenterDropdown;

    //@FindBy(xpath = "(//button[@class='xg8 p_AFTextOnly'])[2]")
    //public WebElement searchBtn;

    @FindBy(id = "r1:1:r1:0:qryId1::search")
    public WebElement searchBtn;

    @FindBy(xpath = "(//span[@title='OTI Education Center'])[1]")
    public WebElement createdCourseCenter;

    @FindBy(xpath="(//select[@class='x2h'])[1]")
    public WebElement SearchOtiEducationDropdown;

    //@FindBy(xpath = "(//button[@class='xg8 p_AFTextOnly'])[2]")
    //public WebElement searchBtn;

    //@FindBy(xpath = "//a[.='Course Titles']")
    //public WebElement courseTitleHprLink;

    @FindBy(xpath = "(//span[.='#2225 Respiratory Protection'])[2]")
    public WebElement courseTitleHprLink;

    @FindBy(xpath = "//h1[.='OTI Education Center Course']")
    public WebElement verifyOtiEducationCenter;

    @FindBy(id = "r1:1:r1:1:it3::content")
    public WebElement modifyCityName;

    @FindBy(id="d1::msgDlg::cancel")
    public WebElement popUpBtn;

    @FindBy(xpath="(//span[@class='xfx'])[3]")
    public WebElement deleteBtn;
   @FindBy(xpath="(//span[@class='xfx'])[4]")
    public WebElement popUpYesBtn;




//@FindBy(id="r1:1:r1:1:it3::content")
    //public WebElement verifyCityName;






   // @FindBy(xpath = "//span[.='Cancel']")
    //public WebElement cancelBtn;

    @FindBy(xpath = "(//button[@class='xg8 p_AFTextOnly'])[1]")
    public WebElement advancedBtn;

    @FindBy(xpath = "//select[@name='r1:1:r1:0:qryId1:val00']")
    public WebElement courseSearchResult;

    @FindBy(xpath = "(//span[@class='x1al'])[3]")
    public WebElement educationCtrCrsScreen;

    @FindBy(xpath = "//h1[.='OTI Course Title']")
    public WebElement otiCourseTitle;



}
