package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import requests.DeletingUserRequest;


public class DeletingUserSteps {

    public DeletingUserRequest req;

    public DeletingUserSteps(DeletingUserRequest req){
        this.req = req;
    }

    @Given("^I have the user's id$")
    public void gettingId(){
        req.getUserId();
    }
    
    @When ("^I send a DELETE request$")
    public void sendingDelete(){
        req.sendDelete();
    }
    
    @Then ("^the user should be deleted successfully with status code \"([^\"]*)\"$")
    public void varifyingDeleteStatus(int statusCode){
        req.verifyDeleteStatus(statusCode);
    }
    
}
