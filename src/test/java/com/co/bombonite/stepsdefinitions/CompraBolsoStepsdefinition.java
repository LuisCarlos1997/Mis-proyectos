package com.co.bombonite.stepsdefinitions;

import com.co.bombonite.questions.CompraBolsoQuestion;
import com.co.bombonite.tasks.CompraBolsoTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import static com.co.bombonite.utils.Utilidades.BOLSO;

public class CompraBolsoStepsdefinition {
    @When("^I choose in bag to buy$")
    public void iChooseInBagToBuy() {
        OnStage.theActorInTheSpotlight().attemptsTo(CompraBolsoTask.bolso());
    }

    @Then("^I make the purchase of the bag successfully$")
    public void iMakeThePurchaseOfTheBagSuccessfully() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompraBolsoQuestion.BolsoQuestion(),
                Matchers.is(Matchers.equalTo(BOLSO))));

    }

}
