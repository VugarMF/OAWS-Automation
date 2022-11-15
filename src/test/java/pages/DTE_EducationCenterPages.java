package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DTE_EducationCenterPages {

    public DTE_EducationCenterPages(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//a[@class='x18w'])[4]")
    public WebElement educationHprLink;

    @FindBy(xpath = "//input[@name='r1:1:r1:2:it1']")
    public WebElement educationCenterName;


    @FindBy(xpath = "//input[@name='r1:1:r1:2:it3']")
    public WebElement educationCenterKey;

    @FindBy(xpath = "//input[@name='r1:1:r1:2:it2']")
    public WebElement educationCenterCity;

    @FindBy(xpath = "//select[@name='r1:1:r1:2:soc1']")
    public WebElement educationCenterState;

    @FindBy(xpath = "(//div[@title='Search OTI Education Centers'])[2]")
    public WebElement searchOtiEducationCenter;

    @FindBy(xpath = "//span[.='Create']")
    public WebElement createBtn;

    @FindBy(xpath = "//textarea[@name='r1:1:r1:2:it5']")
    public WebElement textArea;

    @FindBy(xpath = "(//span[@class='xfx'])[1]")
    public WebElement saveBtn;

    @FindBy(id = "d1::msgDlg::cancel")
    public WebElement poUpBtn;

    @FindBy(xpath = "(//span[@class='xfx'])[2]")
    public WebElement cancelBtn;


    @FindBy(id = "r1:1:r1:1:qryId1::search")
    public WebElement searchBtn;

    @FindBy(id = "r1:1:r1:1:qryId1:val00::content")
    public WebElement educationNameSearch;

    @FindBy( xpath = "(//a[@class='x18w'])[5]")
    public WebElement courseBatchUploadHprLink;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement chooseFile;

    @FindBy( xpath = "(//span[@class='xfx'])[1]")
    public WebElement uploadBtn;

    @FindBy(xpath="//button[@type='button'][1]")
    public WebElement uploadPopUpBtn;

    @FindBy(id="r1:1:r1:1:ot12")
    public WebElement noteToVerify;

    @FindBy(xpath="(//a[@class='x18w'])[2]")
    public WebElement coursesHprLink;

    @FindBy(id="r1:1:r1:2:qryId1:val50::glyph")
    public  WebElement startCalendarDate;
    @FindBy(id="r1:1:r1:2:qryId1:val60::glyph")
    public  WebElement endCalendarDate;

    @FindBy(id="r1:1:r1:2:qryId1:val50::pop::cd::mSel::content")
    public  WebElement courseStartMonth;
    @FindBy(id="r1:1:r1:2:qryId1:val60::pop::cd::mSel::content")
    public  WebElement courseEndMonth;

    @FindBy(xpath ="//td[.='24']")
    public WebElement courseStartDay;

    @FindBy(xpath ="(//td[.='26'])[4]")
    public WebElement courseEndDay;

    @FindBy(id = "r1:1:r1:2:qryId1:val50::pop::cd::ys::content")
    public WebElement courseStartYear;

    @FindBy(id= "r1:1:r1:2:qryId1:val60::pop::cd::ys::content")
    public WebElement courseEndYear;

    @FindBy(id= "r1:1:r1:2:qryId1::search")
    public WebElement uploadSearchBtn;
    @FindBy(id="r1:1:r1:2:pc1:resId1:0:l1::text")
    public WebElement courseTitleVerify;

    //@FindBy(id="r1:1:r1:2:pc1:resId1:0:l1::text")
    //public WebElement courseTitleVerify;








}
