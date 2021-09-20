package com.gameaccount.qa.moneygaming.pages;

import com.gameaccount.qa.moneygaming.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage{

    public SignUpPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "title")
    public WebElement title;

    @FindBy(id = "forename")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='map(lastName)']")
    public WebElement surname;

    @FindBy(css = "select[name='map(dobMonth)']")
    public WebElement month;

    @FindBy(xpath = "//select[@name='map(dobDay)']")
    public WebElement day;

    @FindBy(css = "select[name='map(dobYear)']")
    public WebElement year;

    @FindBy(css = "input[name = 'map(terms)']")
    public WebElement termsAndConditions;

    @FindBy(id = "form")
    public WebElement joinNow;

    @FindBy(css = "label[for='dob']")
    public WebElement dobErrorMessage;

    public void navigateToSignUpPage(){
        Driver.getDriver().get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");
    }

    public void validateSignUpPageTitle(){
        Assert.assertEquals("Join now to Play Online Casino Games - Free or Cash | MoneyGaming.com", Driver.getDriver().getTitle());
    }

    public void selectTitle(String personTitle){
        Select select = new Select(title);
        select.selectByVisibleText(personTitle);
    }

    public void enterFirstName(String personFirstName){
        this.firstName.sendKeys(personFirstName);
    }

    public void enterLastName(String personLastName){
        this.surname.sendKeys(personLastName);
    }

    public void clickOnTermsAndCondCheckbox(){
        this.termsAndConditions.click();
    }

    public void clickOnJoinNow(){
        this.joinNow.click();
    }

    public void validateDobErrorMessage(String errorMessage){
        Assert.assertTrue(this.dobErrorMessage.isDisplayed());
        Assert.assertEquals(errorMessage, this.dobErrorMessage.getText());
    }




    }