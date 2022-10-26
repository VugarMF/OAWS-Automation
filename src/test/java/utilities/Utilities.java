package utilities;

<<<<<<< HEAD
=======
import org.openqa.selenium.By;
>>>>>>> a47670c (Cucumber BDD framework with TestNG1)
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
<<<<<<< HEAD
=======
import org.testng.mustache.Value;
>>>>>>> a47670c (Cucumber BDD framework with TestNG1)
import pages.LoginOshaPages;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.apache.commons.io.FileUtils.waitFor;

public class Utilities {

    /**
    This method will accept int (in seconds) and execute Thread.sleep
    for given duration
     **/
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }


    /**
     This method will accept login OSHA page
     **/

<<<<<<< HEAD
    public static void login() {
        LoginOshaPages loginOshaPages = new LoginOshaPages();
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("osha.url1"));
        //pass username
        loginOshaPages.userNameInput.sendKeys(ConfigurationReader.getProperty("login.username"));
        //pass password
        loginOshaPages.passwordInput.sendKeys(ConfigurationReader.getProperty("login.psw"));
=======
    public static void loginDTE() {
        LoginOshaPages loginOshaPages = new LoginOshaPages();
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("osha.DTE_url"));
        //pass username
        loginOshaPages.userNameInput.sendKeys(ConfigurationReader.getProperty("login.DTE_username"));
        //pass password
        loginOshaPages.passwordInput.sendKeys(ConfigurationReader.getProperty("login.DTE_psw"));
>>>>>>> a47670c (Cucumber BDD framework with TestNG1)
        loginOshaPages.acceptRules.click();
        loginOshaPages.loginBtn.click();

    }

<<<<<<< HEAD

    /**
     * This method will accept a dropdown as a WebElement
     * and return all the options' text in a List of String.
     * @param dropdownElement
     * @return List<String> actualOptionsAsString
     */
=======
    public static void loginDte() {
        LoginOshaPages loginOshaPages = new LoginOshaPages();
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("osha.url"));
        //pass username
        loginOshaPages.userNameInput.sendKeys(ConfigurationReader.getProperty(""));
        //pass password
        loginOshaPages.passwordInput.sendKeys(ConfigurationReader.getProperty(""));
        loginOshaPages.acceptRules.click();
        loginOshaPages.loginBtn.click();

    }

        /**
         * This method will accept a dropdown as a WebElement
         * and return all the options' text in a List of String.
         * @param dropdownElement
         * @return List<String> actualOptionsAsString
         */
>>>>>>> a47670c (Cucumber BDD framework with TestNG1)
    public static List<String> dropdownOptionsAsString(WebElement dropdownElement) {
        Select select = new Select(dropdownElement);

        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        List<String> actualOptionsAsString=new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement){
            actualOptionsAsString.add(each.getText());

        }

<<<<<<< HEAD
        return actualOptionsAsString;
    }

=======

        return actualOptionsAsString;
    }

    public static void selectByValue(WebElement element,String value ){
        Select select=new Select(element);
        select.selectByValue(value);
    }

>>>>>>> a47670c (Cucumber BDD framework with TestNG1)


    /**
     * This method will accept a group radio buttons as a List of WebElement.
     */
    public static void click (WebElement webElement) {
    webElement.click();
    }
<<<<<<< HEAD
=======
    /**
     * This method is for sendKeys Action::::: on text field
     */
    public static void sendKeysOnWebElement(WebElement element,String text){
        element.click();
        element.clear();
        element.sendKeys(text);
    }
>>>>>>> a47670c (Cucumber BDD framework with TestNG1)



    /**
     * Performs double click action on an element
     */
    public static void doubleClick (WebElement webElement) {
        Actions actions=new Actions(Driver.getDriver());
        actions.doubleClick().perform();
    }


    /**
     * Waits for the provided element to be visible on the page
     *
     * @param element
     * @param timeToWaitInSec
     * @return
     */
    public static WebElement waitForVisibility(WebElement element,int timeToWaitInSec){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }


/** Waits for provided element to be clickable
     ** @param element

     * @return
             */
    public static WebElement waitForClickability(WebElement element, int timeOut){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),timeOut);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }



<<<<<<< HEAD

=======
>>>>>>> a47670c (Cucumber BDD framework with TestNG1)
    /**
     This method will verify Title
     **/
    public static void verifyTitle(WebDriver driver ,String expectedTitle){
<<<<<<< HEAD
        Assert.assertEquals(expectedTitle,driver.getTitle());
=======
        Assert.assertEquals(driver.getTitle(),expectedTitle);
>>>>>>> a47670c (Cucumber BDD framework with TestNG1)
    }


    /**
     This method will verify Element Displayed in page
     **/
    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue( element.isDisplayed(),"Element not visible: " + element);
        } catch (NoSuchElementException e) {
<<<<<<< HEAD
            e.printStackTrace();
=======
        //    e.printStackTrace();
>>>>>>> a47670c (Cucumber BDD framework with TestNG1)
            Assert.fail("Element not found: " + element);

        }
    }

<<<<<<< HEAD
=======


    public static void verifyElementIsNotDisplayed(WebElement element) {
        try {
        element.isDisplayed();
            Assert.assertFalse( element.isDisplayed(),"Element should not be visible: " + element);
        } catch ( org.openqa.selenium.NoSuchElementException e) {

            System.out.println("Element not found, it is deleted " );


        }
    }

>>>>>>> a47670c (Cucumber BDD framework with TestNG1)
    /**
     * Highlighs an element by changing its background and border color
     *
     * @param element
     */
    public static void highlight(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
       sleep(2);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].removeAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }



    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }

    }


}
