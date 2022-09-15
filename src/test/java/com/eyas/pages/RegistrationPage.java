package com.eyas.pages;

import com.eyas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h5")
    public WebElement pageHeader;

    @FindBy(xpath = "//span[.='ACCEPT ALL']")
    public WebElement cookiesAcceptButton;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//span[.='NEXT']")
    public WebElement nextButton;

    @FindBy(xpath = "//p[contains(@id, 'account-details-form-email')]")
    public WebElement emailErrorMessage;

    @FindBy(xpath = "//p[contains(@id, 'account-details-form-password')]")
    public WebElement passwordErrorMessage;

    @FindBy(id = "firstname")
    public WebElement firstnameInput;

    @FindBy(id = "lastname")
    public WebElement lastnameInput;

    @FindBy(id = "dateOfBirth")
    public WebElement dateOfBirthInput;

    @FindBy(xpath = "//p[contains(@id, 'personal-details-form-firstname')]")
    public WebElement firstnameErrorMessage;

    @FindBy(xpath = "//p[contains(@id, 'personal-details-form-lastname')]")
    public WebElement lastnameErrorMessage;

    @FindBy(xpath = "//p[contains(@id, 'personal-details-form-dateOfBirth')]")
    public WebElement dateOfBirthErrorMessage;

    @FindBy(xpath = "//button//span[.='Enter Manually']")
    public WebElement addressEnterManually;

    @FindBy(name = "line1")
    public WebElement addressLine1;

    @FindBy(name = "town")
    public WebElement addressTown;

    @FindBy(name = "postCode")
    public WebElement addressPostCode;

    @FindBy(xpath = "//input[@data-testid='select-non-native-button']")
    public WebElement areaCodeInput;

    @FindBy(id = "countryCode")
    public WebElement phoneNumberInput;

    @FindBy(xpath = "//p[contains(@id, 'address-details-form-line1')]")
    public WebElement addressLine1ErrorMessage;

    @FindBy(xpath = "//p[contains(@id, 'address-details-form-town')]")
    public WebElement townErrorMessage;

    @FindBy(xpath = "//p[contains(@id, 'address-details-form-postCode')]")
    public WebElement postCodeErrorMessage;

    @FindBy(id = "address-details-form-telephone-pattern")
    public WebElement phoneNumberErrorMessage;

    @FindBy(xpath = "(//div[@class='switch switch--checked'])[1]")
    public WebElement selectAllButton;

    @FindBy(xpath = "(//div[@class='switch switch--checked'])[2]")
    public WebElement selectEmailButton;

    @FindBy(xpath = "(//div[@class='switch switch--checked'])[3]")
    public WebElement selectTextButton;

    @FindBy(xpath = "(//div[@class='switch switch--checked'])[4]")
    public WebElement selectPhoneButton;

    @FindBy(xpath = "(//div[@class='switch switch--checked'])[5]")
    public WebElement selectPostButton;

    @FindBy(xpath = "//span[.='Terms & Conditions']")
    public WebElement termsAndConditions;

    @FindBy(xpath = "//span[.='Privacy Policy']")
    public WebElement privacyPolicy;

    @FindBy(id = "acceptTerms")
    public WebElement acceptTermsButton;

    @FindBy(id = "marketing-details-form-acceptTerms-required")
    public WebElement acceptTermsErrorMessage;

    @FindBy(xpath = "//button[@class='button button--success button--large']")
    public WebElement registerButton;

    @FindBy(xpath = "//span[.='Account created']")
    public WebElement accountCreatedPageVerify;
}
