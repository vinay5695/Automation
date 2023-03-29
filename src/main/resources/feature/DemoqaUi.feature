Feature: UI testing of demoqa webpage

@ui
Scenario: verify the elements in Demoqa 
Given User should open the url
When User should click the element button
And User should click the text box and enter all the details
And User should click the submit button

@ui
Scenario: verify the checkbox in Demoqa 
Given User should open the url
When User should click the element button
And User should click the check box
And User should click the home  button and click workfile.doc

@ui
Scenario: verify the radiobutton in Demoqa 
Given User should open the url
When User should click the element button
And User should click the radiobutton option
And User should click the yes for the answer

@ui
Scenario: verify the buttonn in Demoqa 
Given User should open the url
When User should click the element button
And User should click the button option
And User should click the double click

@ui
Scenario: verify the webtable and edit in Demoqa 
Given User should open the url
When User should click the element button
And User should click the webtable option
And User should click the edit option and submit