Feature: Get User Functionality
    We will check if we are getting the correct user's information.

    Scenario: Successfully get a user's details
        Given I have the id of a newly created user
        When I send a GET request to get the user's details
        Then the user's details should be retrieved successfully with response "200"