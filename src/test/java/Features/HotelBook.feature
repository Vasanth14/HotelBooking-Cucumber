@HotelBooking
Feature: I want to book an hotel

  Scenario Outline: Login to the web and book a hotel
    Given user is on the login page
    When user enters <user> and <pass>
    Then user selects <location> and <hotelname> and <roomtype> and 1
    And user searches for hotel
    Then user confirms the hotel with <firstname> and <lastname> and <billingaddr>

    Examples: 
      | user       | pass   | location | hotelname      | roomtype | firstname | lastname | billingaddr | cardtype | expirydate |
      | elonmusk14 | 62G9IH | Sydney   | Hotel Sunshine | Standard | elon      | musk     | madurai     | VISA     | May        |
