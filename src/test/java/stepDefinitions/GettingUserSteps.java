package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import requests.GettingUserRequest;

public class GettingUserSteps {
    
    public GettingUserRequest req;

    public GettingUserSteps(GettingUserRequest req){
        this.req = req;
    }

    @Given("^I have the id of a newly created user$")
    public void gettingId(){
        req.getUserId();
    }
    
    @When ("^I send a GET request to get the user's details$")
    public void sendingGet(){
        req.sendGet();
    }
    
    @Then ("^the user's details should be retrieved successfully with response \"([^\"]*)\"$")
    public void varifyingGetStatus(int statusCode){
        req.verifyGetStatus(statusCode);
    }

}
