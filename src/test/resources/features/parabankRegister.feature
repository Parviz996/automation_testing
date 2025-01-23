@AccountRegister
  Feature: Bank_Account_Register

    Scenario: Register a new bank account
      And User visits the url
      And Click register section
      And User writes firstName
      And User writes lastName
      And User writes Address
      And User writes City
      And User writes State
      And User writes Zipcode
      And User writes Phone
      And User writes SSN
      And User writes Username
      And User writes Password
      And User writes Confirm
      And User clicks Register button
