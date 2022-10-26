package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DTE_SearchCoursePages {

    public DTE_SearchCoursePages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="r1:0:l2::text")
    public WebElement coursesHprLink;

    @FindBy(xpath="(//select[@class='x2h'])[1]")
    public WebElement OtiEducationDropdown;

    @FindBy(xpath = "(//button[@class='xg8 p_AFTextOnly'])[2]")
    public WebElement searchBtn;

    @FindBy(xpath = "(//span[@class='x1al'])[30]")
    public WebElement courseTitleHprLink;

    @FindBy(xpath = "//span[.='Cancel']")
    public WebElement cancelBtn;

    @FindBy(xpath = "(//button[@class='xg8 p_AFTextOnly'])[1]")
    public WebElement advancedBtn;
}
