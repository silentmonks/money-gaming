package com.gameaccount.qa.moneygaming.step_definitions;

import com.gameaccount.qa.moneygaming.pages.SignUpPage;
import io.cucumber.java.en.*;

public class SignUpPageStepDefs extends SignUpPage {

    @Given("user is on Sign Up page")
    public void validateSignUpPageTitleSteps() {
        navigateToSignUpPage();
        validateSignUpPageTitle();
    }

    @And("user selects {string} title from dropdown")
    public void selectTitleSteps(String title){
        selectTitle(title);
    }

    @And("user enters {string} to first name field")
    public void enterFirstNameSteps(String firstName){
        enterFirstName(firstName);
    }

    @And("user enters {string} to surname field")
    public void enterLastNameSteps(String lastName){
        enterLastName(lastName);
    }

    @And("user checks the Terms and Conditions checkbox")
    public void clickOnTermsAndCondCheckboxSteps(){
        clickOnTermsAndCondCheckbox();
    }

    @When("user enters Join Now button")
    public void clickOnJoinNowSteps(){
        clickOnJoinNow();
    }

    @Then("the {string} error message should be displayed for {string}")
    public void validateDobErrorMessageSteps(String error, String field){
        switch (field) {
            case "DOB":
                validateDobErrorMessage(error);
                break;
            // Note: we can add error validation for other fields later
        }

    }


}
