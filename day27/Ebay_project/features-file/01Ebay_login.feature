Feature: check user is able to login with valid credetials
Scenario: successful log into account 
Given login page should be open in default browsers
When click on username button and enter username
And click on continue button
And enter the password
And click on signin button
Then login successfully 