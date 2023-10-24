Feature: DeleteOpportunity to salesForce Applications

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
And Click on the Delete in the dropdown in opportunity
And Click on the Delete in opportunity
Then Verify the opportunity is deleted
