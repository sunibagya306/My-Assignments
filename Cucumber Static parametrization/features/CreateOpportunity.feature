Feature: CreateOpportunity to salesForce Applications

Scenario: Positive Login

Given Intialize the driver
Given Enter the username
Given Enter the password
When Click on the loginbutton
Then Verify the login
When Click on the togglemenu
And Click on the viewall button
Given Enter the value in the opportunity searchbar
And Click on the Opportunity
When Click on the newbutton
Given Enter the value in the opportunity namefield
And Click on the Calendar symbol in close date
Then Select todays date in calendar
And Click on the Stage Field
Then Select stage field as need analysis
When Click on save button in the opportunity
Then Verify the Opportunity was created
