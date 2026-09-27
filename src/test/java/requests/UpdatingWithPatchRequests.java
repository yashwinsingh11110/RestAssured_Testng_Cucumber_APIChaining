package requests;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;

import context.ApiContext;
import io.restassured.specification.RequestSpecification;

public class UpdatingWithPatchRequests {
    
    public ApiContext apiContext;
    public JSONObject userAge = new JSONObject();
    public RequestSpecification request = given();
    public int age;

    public UpdatingWithPatchRequests(ApiContext apiContext){

        this.apiContext = apiContext;
    }

    public void getUserAge(int age){

        userAge.put("Age", age);
        this.age = age;
        
    }
    
    public void sendPatch(){

        apiContext.setResponse(request.contentType("application/json").body(userAge.toString()).patch(apiContext.baseURL+"/"+apiContext.getId()));

    }
    
    public void verifyPatchStatus(int statusCode){

        System.out.println(apiContext.getResponse().asPrettyString());
        Assert.assertEquals(apiContext.getResponse().jsonPath().getInt("Age"),age);
        request.then().statusCode(statusCode);

    }

}
