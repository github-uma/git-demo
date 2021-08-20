Feature: Application Login

Scenario Outline:  Navigation to home page after succesfull login
  Given User is on landing page
  When User logins into application with <user> and <password>
  Then User navigates to home page
  And banking information displayed <status>

 Examples:
  | user  | password  | status |
  | user1 | password1 | true   |
  | user2 | password2 | false  |