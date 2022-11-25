package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginOspadsPages {

    public LoginOspadsPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(id="pt1:r1:0:it1::content")
        public WebElement ospadsUsernameInput;

        @FindBy(id="pt1:r1:0:it11::content")
        public WebElement ospadsPasswordInput;

        @FindBy(id="pt1:r1:0:sbc1::content")
        public WebElement acceptRulesBtn;

        @FindBy(xpath="(//span[@class='xfx'])[1]")
        public WebElement loginBtn;



    }

