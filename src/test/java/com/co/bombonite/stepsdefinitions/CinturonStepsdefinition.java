package com.co.bombonite.stepsdefinitions;

import com.co.bombonite.tasks.CinturonTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class CinturonStepsdefinition {
    @When("^I choose the belt I want to buy$")
    public void iChooseTheBeltIWantToBuy() {
        OnStage.theActorInTheSpotlight().attemptsTo(CinturonTask.cinturon());
    }

    @Then("^the purchase of the belt is successful$")
    public void thePurchaseOfTheBeltIsSuccessful() {

    }
}
