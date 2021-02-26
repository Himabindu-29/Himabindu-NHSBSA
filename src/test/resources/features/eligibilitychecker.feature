Feature: Wales Test Ticket 
Scenario: verify the functionality of eligibility checker
Given I am a person from Wales 
When I put my circumstances into the Checker tool
|day                    |12|
|month                  |08|
|year                   |1987|
|live with partner      |yes|
|tax credits            |yes|
|get universal credit   |yes|
|joint universal credit |yes|
|homepay of £935 or less|yes|

Then I should get a result of whether I will get help or not

