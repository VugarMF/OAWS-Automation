package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DTE_Homepages {

     public DTE_Homepages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="r1:0:l2::text")
    public WebElement coursesTab;
}
