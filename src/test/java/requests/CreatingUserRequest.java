package requests;

import static io.restassured.RestAssured.given;

import context.ApiContext;
import data.Data;
import io.restassured.specification.RequestSpecification;

public class CreatingUserRequest {
    
    public ApiContext apiContext;
    public Data userData;
    public String data;
    public RequestSpecification request = given();

    public CreatingUserRequest(ApiContext apiContext, Data userData){

        this.apiContext = apiContext;
        this.userData = userData;
    }

    public void getUserData(){

        data = userData.getData();
        
    }
    
    public void sendPost(){

        apiContext.setResponse(request.contentType("application/json").body(data).post(apiContext.baseURL));

    }
    
    public void verifyPostStatus(int statusCode){

        request.then().statusCode(statusCode);

    }

}
