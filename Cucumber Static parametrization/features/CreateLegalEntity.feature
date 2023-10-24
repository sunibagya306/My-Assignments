Feature: CreateLegalEntity to salesForce Applications

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
And Click on the dropDown
When Click on the createnew
Given Enter the namefield in new legalentity
When Click on the savebutton in new legalentity
Then Verify the legal entity created
