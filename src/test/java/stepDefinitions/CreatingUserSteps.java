package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import requests.CreatingUserRequest;

public class CreatingUserSteps {

    public CreatingUserRequest req;

    public CreatingUserSteps(CreatingUserRequest req){
        this.req = req;
    }

    @Given("^Create data for new user$")
    public void gettingData(){
        req.getUserData();
    }
    
    @When ("^I send a POST request to create the user$")
    public void sendingPost(){
        req.sendPost();
    }
    
    @Then ("^the user should be created successfully with status code \"([^\"]*)\"$")
    public void varifyingPostStatus(int statusCode){
        req.verifyPostStatus(statusCode);
    }

}
