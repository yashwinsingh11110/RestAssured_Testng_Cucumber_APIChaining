package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import requests.UpdatingWithPutRequests;

public class UpdatingWithPutSteps {
    
    public UpdatingWithPutRequests req;

    public UpdatingWithPutSteps(UpdatingWithPutRequests req){
        this.req = req;
    }

    @Given("^I have the previous complete detail of a user with the updated grade \"([^\"]*)\"$")
    public void updattingData(String grade){
        req.updateUserData(grade);
    }

    @When ("^I send a PUT request to update the user's subject$")
    public void sendingPut(){
        req.sendPut();
    }
    
    @Then ("^the user's subject should be updated successfully with status code \"([^\"]*)\"$")
    public void varifyingPutStatus(int statusCode){
        req.verifyPutStatus(statusCode);
    }

}
