package requests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import context.ApiContext;
import io.restassured.specification.RequestSpecification;

public class GettingUserRequest {
    
    public ApiContext apiContext;
    public String id;
    public RequestSpecification request = given();

    public GettingUserRequest(ApiContext apiContext){

        this.apiContext = apiContext;
    }

    public void getUserId(){

        id = apiContext.getId();
        
    }
    
    public void sendGet(){

        apiContext.setResponse(request.get(apiContext.baseURL+'/'+id));

    }
    
    public void verifyGetStatus(int statusCode){

        System.out.println(apiContext.getResponse().asPrettyString());
        request.then().statusCode(statusCode).body("Name", equalTo("Groot"));

    }

}
