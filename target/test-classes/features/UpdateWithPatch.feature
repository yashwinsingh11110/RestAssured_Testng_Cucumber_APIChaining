Feature: Update User Age Functionality
    We will check if a user's age is updated successfully.

    Scenario: Successfully update a user's age
        Given I have the updated age "50" of a user
        When I send a PATCH request to update the user's age
        Then the user's age should be updated successfully with status code "200"