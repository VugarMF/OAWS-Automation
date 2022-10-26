package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginOshaPages {

    public LoginOshaPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(name="userID")
        public WebElement userNameInput;

        @FindBy(name="password")
        public WebElement passwordInput;

        @FindBy(id="rob")
        public WebElement acceptRules;

        @FindBy(xpath="//input[contains(@type,'submit')]")
        public WebElement loginBtn;

    }

