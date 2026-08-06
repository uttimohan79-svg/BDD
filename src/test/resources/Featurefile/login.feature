Feature: hyr tutorials Login

Scenario Outline: Valid Login

Given User launches HYRtutorials
When User enters username "<Username>"
And User enters password "<password>"
Then  user open another page
And user entrees firstname "<fname>"
And  user entrees lastname "<lname>"
Then Close browser


Examples:
|Username|password|fname|lname|
|mohan   |moni    |utti|changala|
|chinna  |chinnu  |love|lovers|
|lover   |loving  |fix|marriage|