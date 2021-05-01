Feature: Application Login

Scenario: Homepage default Login
Given User is on Netbanking landing page
When User login into application with  Username "jags" and Password "12345"
Then Homepage is populated
And Cards are Displayed "true"

Scenario: Homepage default Login
Given User is on Netbanking landing page
When User login into application with  Username "deepu" and Password "45678"
Then Homepage is populated
And Cards are Displayed "False"





