package requests;

import org.json.JSONObject;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

import context.ApiContext;
import io.restassured.specification.RequestSpecification;

public class UpdatingWithPutRequests {
    
    public ApiContext apiContext;
    public JSONObject userUpdate = new JSONObject();
    public RequestSpecification request = given();
    public String grade;

    public UpdatingWithPutRequests(ApiContext apiContext){

        this.apiContext = apiContext;
    }

    public void updateUserData(String grade){

        this.grade = grade;

        userUpdate.put("Name", apiContext.getResponse().jsonPath().getString("Name"));
        userUpdate.put("Age", apiContext.getResponse().jsonPath().getString("Age"));
        userUpdate.put("Course", grade);
        userUpdate.put("Subject", apiContext.getResponse().jsonPath().getString("Subject"));
        
    }
    
    public void sendPut(){

        apiContext.setResponse(request.contentType("application/json").body(userUpdate.toString()).put(apiContext.baseURL+"/"+apiContext.getId()));

    }
    
    public void verifyPutStatus(int statusCode){

        System.out.println(apiContext.getResponse().asPrettyString());
        Assert.assertEquals(apiContext.getResponse().jsonPath().getString("Course"),grade);
        request.then().statusCode(statusCode);

    }

}
