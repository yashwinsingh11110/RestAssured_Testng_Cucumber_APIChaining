package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import requests.UpdatingWithPatchRequests;

public class UpdatingWithPatchSteps {
    
    public UpdatingWithPatchRequests req;

    public UpdatingWithPatchSteps(UpdatingWithPatchRequests req){
        this.req = req;
    }

    @Given("^I have the updated age \"([^\"]*)\" of a user$")
    public void gettingAge(int age){
        req.getUserAge(age);
    }

    @When ("^I send a PATCH request to update the user's age$")
    public void sendingPatch(){
        req.sendPatch();
    }
    
    @Then ("^the user's age should be updated successfully with status code \"([^\"]*)\"$")
    public void varifyingPatchStatus(int statusCode){
        req.verifyPatchStatus(statusCode);
    }

}
