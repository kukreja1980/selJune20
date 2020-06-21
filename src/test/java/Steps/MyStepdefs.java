package Steps;

import classes.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import java.io.IOException;


public class MyStepdefs {

    @Given("^User is on Login page$")
    public void userIsOnLoginPage() throws IOException {
        System.out.println("Hello World");
        LoginPage loginPage = new LoginPage();
        loginPage.basePageNavigation();

    }

    @And("^User click on login button$")
    public void userClickOnLoginButton() {
    }

    @Then("^User is able to login$")
    public void userIsAbleToLogin() {
    }

    @And("^User is on Home Page of AEP$")
    public void userIsOnHomePageOfAEP() {
    }


    @Then("^User is able to not able to login$")
    public void userIsAbleToNotAbleToLogin() {
    }

    @And("^User is displayed an error message$")
    public void userIsDisplayedAnErrorMessage() {
    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String arg0, String arg1) {
        System.out.println(arg0 + " and " + arg1);
    }


    @When("User enters following username and password")
    public void userEntersFollowingUsernameAndPassword(DataTable table) {
        System.out.println("Username is " + table.cells().get(1).get(0));
        System.out.println(table.row(1).get(0));
        System.out.println(table.column(0).get(1));
    }

    @Given("This is the setup Step")
    public void thisIsTheSetupStep() {
        System.out.println("I am in background test");
    }
}
