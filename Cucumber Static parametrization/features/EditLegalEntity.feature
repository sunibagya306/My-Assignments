Feature: EditLegalEntity to salesForce Applications

Scenario: Positive Login

Given Intialize the driver
Given Enter the username
Given Enter the password
When Click on the loginbutton
Then Verify the login
When Click on the togglemenu
And Click on the viewall button
Given Enter the value in the searchbar
And Click on the legalentities
Given Enter the value in the searchbar in legalentity
And Click on the dropdown
And Click on the edit in dropdown
Given Enter the companyname in the edit legalentity
Given Enter the description in the edit legalentity
When Click on the status in edit legalentity
Then Select the status as active
When Click on save button
Given Click on displayed legal entity
Then Verify the status as Active