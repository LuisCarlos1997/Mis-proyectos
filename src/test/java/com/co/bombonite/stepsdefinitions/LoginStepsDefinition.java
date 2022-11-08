package com.co.bombonite.stepsdefinitions;

import com.co.bombonite.models.LoginModel;
import com.co.bombonite.tasks.LoginTask;
import com.co.bombonite.tasks.LoginTask1;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.co.bombonite.utils.Utilidades.ENDPOINT;


public class LoginStepsDefinition {

    @Managed
    WebDriver hisdriver;
    private EnvironmentVariables environmentVariables;

    @Before
    public void Open() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Luis Carlos");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisdriver));
    }

    @Given("^Luis open pages$")
    public void luisOpenPages() {
        String webServiceEndpoint = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty(ENDPOINT);
        String URL = webServiceEndpoint.toString();
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask1.loginTask1());
    }

    @When("^I write my credencials$")
    public void iWriteMyCredencials(List<LoginModel> loginModelList) {

        LoginModel loginModel;
        loginModel = loginModelList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.ingresar(loginModel));

    }

    @Then("^I successfully entered the page$")
    public void iSuccessfullyEnteredThePage() {

    }

}
