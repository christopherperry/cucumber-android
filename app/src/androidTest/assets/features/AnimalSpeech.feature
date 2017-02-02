Feature: Animal Speech

  Scenario: Dog
    Given I have a MainActivity
      And The animal is a dog
    When I click the speak button
    Then I should see bork!

  Scenario: Cat
    Given I have a MainActivity
      And The animal is a cat
    When I click the speak button
    Then I should see Mow!