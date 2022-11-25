package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OSPADS_Pages {

     public OSPADS_Pages(){

         PageFactory.initElements(Driver.getDriver(),this);
     }
     @FindBy(xpath = "//h1[@class='x12f ']")
     public WebElement searchPartnership;

     @FindBy(xpath = "(//span[@class='xfx'])[11]")
     public WebElement newPartnershipBtn;

     @FindBy(xpath = "//h2[@class='x12f ']")
     public WebElement partnershipDetails;




}
