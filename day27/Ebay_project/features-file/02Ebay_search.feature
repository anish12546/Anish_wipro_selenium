Feature: check the user is able to search item
Scenario Outline:
: successful search item
Given search page is open 
When click on search bar
And enter the items <item>
Then search items successfully
Examples:
|item|
|book|
|watch|
|phone|

