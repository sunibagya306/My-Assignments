Feature: ServiceTerritories to salesForce Applications

Scenario: Positive Login To Create Service Territories


Given Enter the username as 'suni.bhagya306@gmail.com'
Given Enter the password as 'Kishore@51'
When Click on the loginbutton
Then Verify the login
When Click on the togglemenu
And Click on the viewall button
And Click on the AppLauncher 'Service Territories'
When Click on the NewButton 'Service Territories'
Given Enter the 'Name' as 'Suneetha'
And Click on the Operating Hours
Then Select first option in operating hours
And Check on the Active field
Given Enter the City in City Field
Given Enter the State in State Field
Given Enter the Country in Country Field
Given Enter the PostalCode
When Click on save button
Then Verify the toasterMessage is 'Created' for 'Service Territories'



Scenario: Edit Service Territories


Given Enter the username as 'suni.bhagya306@gmail.com'
Given Enter the password as 'Kishore@51'
When Click on the loginbutton
Then Verify the login
When Click on the togglemenu
And Click on the viewall button
And Click on the AppLauncher 'Service Territories'
Given Enter value in the searchbar as 'Suneetha'
And Click on the dropdown
And Click on the edit in dropdown
Then Verify the System Information Created By
Then Verify the System Information LastModified By
Then Verify the Owner
Then Verify Owner, Created By and Modified By are matches
Given Change the Country Name
When Click on save button
Then Verify the toasterMessage is 'Updated' for 'Service Territories'
Then Verify Last Modified date
