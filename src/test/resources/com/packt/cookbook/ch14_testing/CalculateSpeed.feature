Feature: Vehicle speed calculation
   The calculations should be made based on the assumption
   that a vehicle starts moving, and driving conditions are
   always the same.

Scenario: Calculate speed of a truck
   This the happy path that demonstrates the main case

    Given the vehicle has 246 hp engine and weighs 4000 pounds
    When the application calculates its speed after 10.0 sec
    Then the result should be 117.0 mph