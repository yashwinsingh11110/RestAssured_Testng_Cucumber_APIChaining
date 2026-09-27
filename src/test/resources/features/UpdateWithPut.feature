Feature: Update User Grade Functionality
    We will check if a user's subject is updated successfully.

    Scenario: Successfully update a user's grade
        Given I have the previous complete detail of a user with the updated grade "MCA"
        When I send a PUT request to update the user's subject
        Then the user's subject should be updated successfully with status code "200"