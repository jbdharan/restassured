Feature: getting the city temperature
Scenario:  USer get the temperature for the city
Given: The city exists
  When: the user retrieves the temperature by city
  Then: the status is 200
  And: the response includes following
  | Humidity |
  | WindSpeed |
