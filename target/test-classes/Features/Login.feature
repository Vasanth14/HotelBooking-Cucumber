@BookingLogin
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Login to the web
    Given user is on the login page
    When user enters <user> and <pass>
    And home page is populated

    #And user selects hotel by <location>,<hotel>,<room type>
    #Then user confirms the hotel <firstname>,<lastname>,<addr>,<cardno>,<cardtype>,<cvv>
    Examples: 
      | user       | pass   |
      | elonmusk14 | 62G9IH |
      #| vasanth    | 12345g |
