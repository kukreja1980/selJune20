package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class cucumberHooks {

    @Before
    public void initializeTests(){
        System.out.println("I am Before Method");
    }
    @BeforeStep
    public void startStep(){
        System.out.println("I am BeforeStep");
    }
    @AfterStep
    public void endStep(){
        System.out.println("I am AfterStep");
    }
    @After
    public void teardownTests(){
        System.out.println("I am After Method");
    }
}
