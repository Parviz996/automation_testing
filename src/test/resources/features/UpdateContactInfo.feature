@UpdateInfo

  Feature: Update

    Scenario: UpdateInfo
      Given User includes page
      And User sends name
      And User sends password
      And User clicked button
      And Click UpdateContactInfo section
      And Update address
      And Update zipcode
      And Click Update button
      Then User should see updated contact info