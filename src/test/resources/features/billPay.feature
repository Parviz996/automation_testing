@BillPay
  Feature: BillPay

  Scenario: Payment
    And User enter name
    And User enter password
    And User click billPay section
    And User enter payeeName
    And User enter address
    And User enter city
    And User enter state
    And User enter zipcode
    And User enter phone
    And User enter account
    And User enter verifyAccount
    And User enter amount
    And User click sendPayment button
