Feature: Flight Reservation
  As a web user
  I want to choose a flight

  Scenario: Flight Reservation

    Given That the user wants to buy a ticket
    When The user select the flight options
      | fromCity | toCity |
      | BOG      | MDE    |
    Then The user can see the rate selection