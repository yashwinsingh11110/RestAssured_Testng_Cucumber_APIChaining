package requests;

import static io.restassured.RestAssured.given;

import context.ApiContext;
import io.restassured.specification.RequestSpecification;

public class DeletingUserRequest {

    public ApiContext apiContext;
    public String id;
    public RequestSpecification request = given();

    public DeletingUserRequest(ApiContext apiContext){

        this.apiContext = apiContext;
    }

    public void getUserId(){

        id = apiContext.getId();
        
    }
    
    public void sendDelete(){

        apiContext.setResponse(request.delete(apiContext.baseURL+'/'+id));

    }
    
    public void verifyDeleteStatus(int statusCode){

        System.out.println(apiContext.getResponse().asPrettyString());
        request.then().statusCode(statusCode);

    }
    
}
