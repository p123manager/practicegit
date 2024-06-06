Feature: google title 
Scenario: verify title
 Given open "chrome" browser
 When   enter "abdul kalam" into search box
 And hit enter key
 Then page title should contain "abdul kalam"