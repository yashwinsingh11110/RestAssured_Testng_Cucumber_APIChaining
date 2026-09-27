package hooks;

import context.ApiContext;
import io.cucumber.java.After;

public class Hook {
    
    private ApiContext apiContext;

    public Hook(ApiContext apiContext) {
        
        this.apiContext = apiContext;

    }

    @After 
    public void setUserId(){
        apiContext.setId(apiContext.getResponse().jsonPath().getString("id"));
    }

}
