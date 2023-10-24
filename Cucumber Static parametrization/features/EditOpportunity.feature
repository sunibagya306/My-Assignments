Feature: EditOpportunity to salesForce Applications

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
Given Enter the value in the searchbar in Opportunity
And Click on the dropdown
And Click on the edit in dropdown
And Click on the Calendar symbol in close date
Then Select tomorrows date in calendar
And Click on the Stage Field
Then Select stage field as perception analysis
When Click on the deliver status in edit Opportunity
Then Select the deliver status as inprogress
Given Enter the description in edit opportunity
When Click on save button
And  Click on the Opportunity to verify
Then Verify the status as perception analysis