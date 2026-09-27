Feature: Create User Functionality
    We will check if a new user is getting created successfully.

    Scenario: Successfully create a new user
        Given Create data for new user
        When I send a POST request to create the user
        Then the user should be created successfully with status code "201"