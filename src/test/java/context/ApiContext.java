package context;

import io.restassured.response.Response;

public class ApiContext {

    public static String baseURL = "http://localhost:3000/students";
    private static Response response;
    public static String id = null;
    
    public static void setResponse(Response res){

        response = res;

    }
    
    public static Response getResponse(){

        return response;

    }

    public static void setId(String userId){

        id = userId;

    }
    
    public static String getId(){

        return id;

    }
}
