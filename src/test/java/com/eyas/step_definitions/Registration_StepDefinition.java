package com.eyas.step_definitions;

import com.eyas.pages.RegistrationPage;
import com.eyas.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class Registration_StepDefinition {

    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user should see the {string} header")
    public void user_should_see_the_header(String expectedHeader) {
        String actualHeader = registrationPage.pageHeader.getText();
        Assert.assertEquals(expectedHeader, actualHeader);

        try {
            if (registrationPage.cookiesAcceptButton.isDisplayed()) {
                registrationPage.cookiesAcceptButton.click();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String email, String password) {
        registrationPage.emailInput.sendKeys(email);
        registrationPage.passwordInput.sendKeys(password);
    }

    @Then("user clicks on next button")
    public void user_clicks_on_next_button() throws InterruptedException {
        registrationPage.nextButton.click();
        Thread.sleep(1000);
    }

    @Then("user displays following {string} in email and {string} in password")
    public void user_displays_following_in_email_and_in_password(String emailErrorMessage, String passwordErrorMessage) {
        if (!emailErrorMessage.equals("valid")) {
            String actualEmailErrorMessage = registrationPage.emailErrorMessage.getText();
            Assert.assertEquals(emailErrorMessage, actualEmailErrorMessage);
        }
        if (!passwordErrorMessage.equals("valid")) {
            String actualPasswordErrorMessage = registrationPage.passwordErrorMessage.getText();
            Assert.assertEquals(passwordErrorMessage, actualPasswordErrorMessage);
        }
        if (emailErrorMessage.equals("valid") && passwordErrorMessage.equals("valid")) {
            String actualHeader = registrationPage.pageHeader.getText();
            Assert.assertEquals("Great! Now let's get to know you!", actualHeader);
        }
    }

    @When("user enters {string} {string} and {string}")
    public void user_enters_and(String firstname, String lastname, String dateOfBirth){
        registrationPage.dateOfBirthInput.click();
        registrationPage.dateOfBirthInput.sendKeys(dateOfBirth);
        registrationPage.firstnameInput.sendKeys(firstname);
        registrationPage.lastnameInput.sendKeys(lastname);
    }

    @When("user displays following {string} in firstname {string} in lastname and {string} in dateOfBirth")
    public void user_displays_following_in_firstname_in_lastname_and_in_date_of_birth(String firstnameErrorMessage, String lastnameErrorMessage, String dobErrorMessage) {

        if (!firstnameErrorMessage.equals("valid")) {
            String actualFirstnameErrorMessage = registrationPage.firstnameErrorMessage.getText();
            Assert.assertEquals(firstnameErrorMessage, actualFirstnameErrorMessage);
        }
        if (!lastnameErrorMessage.equals("valid")) {
            String actualLastnameErrorMessage = registrationPage.lastnameErrorMessage.getText();
            Assert.assertEquals(lastnameErrorMessage, actualLastnameErrorMessage);
        }
        if (!dobErrorMessage.equals("valid")) {
            String actualDobErrorMessage = registrationPage.dateOfBirthErrorMessage.getText();
            Assert.assertEquals(dobErrorMessage, actualDobErrorMessage);
        }
    }

    @When("user enters {string} {string} {string} {string} and {string}")
    public void user_enters_and(String addressLine1, String town, String postCode, String areaCode, String phoneNumber) {
        registrationPage.addressEnterManually.click();
        registrationPage.addressLine1.sendKeys(addressLine1);
        registrationPage.addressTown.sendKeys(town);
        registrationPage.addressPostCode.sendKeys(postCode);
        registrationPage.areaCodeInput.sendKeys(areaCode);
        registrationPage.phoneNumberInput.sendKeys(phoneNumber);
    }

    @Then("user displays following {string} in addressLine1 {string} in town and {string} in postCode {string} in phoneNumber")
    public void user_displays_following_in_address_line1_in_town_and_in_post_code_in_phone_number(String addressLine1ErrorMessage, String townErrorMessage, String postCodeErrorMessage, String phoneNumberErrorMessage) {

        if (!addressLine1ErrorMessage.equals("valid")) {
            String actualAddressLine1ErrorMessage = registrationPage.addressLine1ErrorMessage.getText();
            Assert.assertEquals(addressLine1ErrorMessage, actualAddressLine1ErrorMessage);
        }
        if (!townErrorMessage.equals("valid")) {
            String actualTownErrorMessage = registrationPage.townErrorMessage.getText();
            Assert.assertEquals(townErrorMessage, actualTownErrorMessage);
        }
        if (!postCodeErrorMessage.equals("valid")) {
            String actualPostCodeErrorMessage = registrationPage.postCodeErrorMessage.getText();
            Assert.assertEquals(postCodeErrorMessage, actualPostCodeErrorMessage);
        }
        if (!phoneNumberErrorMessage.equals("valid")) {
            String actualPhoneNumberErrorMessage = registrationPage.phoneNumberErrorMessage.getText();
            Assert.assertEquals(phoneNumberErrorMessage, actualPhoneNumberErrorMessage);
        }
    }

    @When("user accepts terms and conditions")
    public void user_accepts_terms_and_conditions() {
        registrationPage.acceptTermsButton.click();
    }
    @Then("user clicks on register button")
    public void user_clicks_on_register_button() {
        registrationPage.registerButton.click();
    }

}
