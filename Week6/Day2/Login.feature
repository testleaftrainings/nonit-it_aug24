Feature: Login functionality of Leaftaps application

Scenario: Login with valid credentials
Given Launch the browser
And Load the url
When Enter the username as 'DemoCSR'
And Enter the password as crmsfa
And Click on the login button
Then It should navigate to the next page

Scenario: Login with Invalid Credentials
Given Launch the browser
And Load the url
When Enter the username as 'Demo'
And Enter the password as crmsfa
And Click on the login button
But It should throw error message

