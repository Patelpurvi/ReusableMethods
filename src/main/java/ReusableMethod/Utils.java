package ReusableMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils<SimpleDateFormate> extends BasePage {

    //All option selected
    public void getAllSelectedOptions(By by,String text){
        Select select = new Select(driver.findElement(by));
        select.getAllSelectedOptions(); }


    //get first selected options
    public void getFirstSelectedOptions(By by ,String text){
        Select select = new Select(driver.findElement(by));
        select.getFirstSelectedOption(); }

    // get selected value from dropdown
    public static void selectByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value); }

    //isdorpdown present
    public static void selectByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text); }

    //dropdown select by index
    public static void selectByIndex(By by, int no) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(0); }

    //genratemail
    public String genratEmail(String startvalue) {
        String email = startvalue.concat(new Date().toString());
        return email; }

    //Enter text in input field
    public void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text); }

    //get text method
    public String Text(By by) {
        return driver.findElement(by).getText(); }

    //Clicking element
    public void clickelement(By by) {
        driver.findElement(by).click(); }

    //wait for element to be clickable for given time in seconds
    public static void waitElementForClickble(By by, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by)); }

    //wait for element to be visible
    public static void waitForElementVisible(By by, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by)); }

    //wait for element to be invisible
    public static void waitForElementToBeInvisible(By by, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOfAllElements()); }

    //wait for AlertPresent
    public static void waitForAlertPresent(long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.alertIsPresent()); }

    //Date format
    public static String randomDate() {
        DateFormat format = new SimpleDateFormat("ddMMyyHHmmss");
        return format.format(new Date()); }

    //Clear Text form inout box/area
    public void clearTextFormInputBoxArea(By by) {
        driver.findElement(by).clear(); }

    //Checking WebElement displayed or not
    public void checkingWebelementDisplayedOrNot(By by, String text) {
        driver.findElement(by).isDisplayed(); }

    //Wait for fixed time given in seconds
    public void waitForFixedTimeGivenInSecond(By by, long time) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); }

    //get css property of element
    public void getCSSPropertyOfElement(By by, String text) {
        driver.findElement(by).getCssValue("text"); }

    //Wait for locator to be clickable for given time in seconds
    // public void WaitForLocatorToBeClickebleForGivenTimeInSeconds(By by, long time){
    //   WebDriverWait wait = new WebDriverWait(driver,time);}


    //Clear and enter text in input field

    //Checking WebElemnt present in DOM


    //Try to click element three times if not available in first go

    //Wait for locator to be clickable for given time in seconds


    //date stamp short

    //date stamp long


    // select from visible text

    //Select from visible number


    //Select from value


    //Scroll to view element;


    //Scroll to element and click

    //Wait for alert to display

    //Get attribute of element




    //take screenshot of browser


    //take screenshot of current display(full)


    //convert date....

}




