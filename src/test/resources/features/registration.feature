@wip
Feature: Registration form

  Background: verify the page
    Given user should see the "Let’s get you started!" header

  Scenario Outline: Registration page 1/4
    When user enters "<email>" and "<password>"
    And user clicks on next button
    Then user displays following "<emailErrorMessage>" in email and "<passwordErrorMessage>" in password
    Examples:
      | email           | password   | emailErrorMessage                                  | passwordErrorMessage                               |
      | abc@gmail.com   | As1234!Sa  | valid                                              | valid                                              |
      |                 | As123456Sa | Please complete this step to continue registration | valid                                              |
      | abc@gmail.co.uk |            | valid                                              | Please complete this step to continue registration |
      | abc@yahoo.com   | SlotsMer   | valid                                              | Password does not meet requirements.               |
      | @hotmail.com    | Password12 | Email address is invalid.                          | valid                                              |

  Scenario Outline: Registration Page 2/4
    When user enters "abc@gmail.com" and "As1234!Sa"
    And user clicks on next button
    And user should see the "Great! Now let's get to know you!" header
    And user enters "<firstname>" "<lastname>" and "<dateOfBirth>"
    And user clicks on next button
    And user displays following "<firstnameErrorMessage>" in firstname "<lastnameErrorMessage>" in lastname and "<dobErrorMessage>" in dateOfBirth
    Then user clicks on next button
    Examples:
      | firstname | lastname | dateOfBirth | firstnameErrorMessage                              | lastnameErrorMessage                               | dobErrorMessage                                    |
      |           |          |             | Please complete this step to continue registration | Please complete this step to continue registration | Please complete this step to continue registration |
      | P         | D        | 01011990    | First name must contain at least 2 characters      | Last name must contain at least 2 characters       | valid                                              |
      | D6        | H5       | 12042005    | First name contains invalid characters.            | Last name contains invalid characters.             | You must be over 18 to register.                   |

  Scenario Outline: Registration Page 3/4
    When user enters "abc@gmail.com" and "As1234!Sa"
    And user clicks on next button
    And user should see the "Great! Now let's get to know you!" header
    And user enters "John" "Doe" and "10101995"
    And user clicks on next button
    And user should see the "Thanks John! We just need a few more details" header
    When user enters "<addressLine1>" "<town>" "<postCode>" "<areaCode>" and "<phoneNumber>"
    Then user clicks on next button
    And user displays following "<addressLine1ErrorMessage>" in addressLine1 "<townErrorMessage>" in town and "<postCodeErrorMessage>" in postCode "<phoneNumberErrorMessage>" in phoneNumber
    Examples:
      | addressLine1 | town | postCode | areaCode | phoneNumber | addressLine1ErrorMessage                               | townErrorMessage                                   | postCodeErrorMessage                               | phoneNumberErrorMessage                            |
      |              |      |          |          |             | This field must be corrected to complete registration. | Please complete this step to continue registration | Please complete this step to continue registration | Please complete this step to continue registration |

  Scenario Outline: Valid registration Page 3/4
    When user enters "abc@gmail.com" and "As1234!Sa"
    And user clicks on next button
    And user should see the "Great! Now let's get to know you!" header
    And user enters "John" "Doe" and "10101995"
    And user clicks on next button
    And user should see the "Thanks John! We just need a few more details" header
    When user enters "<addressLine1>" "<town>" "<postCode>" "<areaCode>" and "<phoneNumber>"
    Then user clicks on next button
    And user should see the "Want to hear about our latest offers?" header
    Examples:
      | addressLine1 | town   | postCode | areaCode | phoneNumber |
      | 12 Xyz St    | London | W2 5DT   |          | 984373      |

  Scenario: Registration Page 4/4
    When user enters "abc@gmail.com" and "As1234!Sa"
    And user clicks on next button
    And user should see the "Great! Now let's get to know you!" header
    And user enters "John" "Doe" and "10101995"
    And user clicks on next button
    And user should see the "Thanks John! We just need a few more details" header
    When user enters "12 Xyz St" "London" "W2 5DT" "<areaCode>" and "984373"
    Then user clicks on next button
    And user should see the "Want to hear about our latest offers?" header
    And user accepts terms and conditions
    Then user clicks on register button
    # Currently, I'm not able to see the "account created" page after clicking on the register button, the page does not load




