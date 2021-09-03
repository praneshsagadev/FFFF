Feature: Login Function

Scenario: Checking timesheet for the user
Given I load the "https://opensource-demo.orangehrmlive.com/"
Then I enter username and password into the respective fields
|username|password|
|Admin|admin123|
Then I click the element "//*[@id='btnLogin']"
Then I click element "//span[contains(text(),'Timesheets')]"
Then I enter "Cecil Bonaparte" into element "employee"
And I clk element "//*[@id='btnView']"
