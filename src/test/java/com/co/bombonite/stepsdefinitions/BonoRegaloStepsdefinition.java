package com.co.bombonite.stepsdefinitions;

import com.co.bombonite.questions.BonoRegaloQuestion;
import com.co.bombonite.tasks.BonoRegaloTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.bombonite.utils.Utilidades.BONO;

public class BonoRegaloStepsdefinition {
    @When("^I choose the price I want to give away$")
    public void iChooseThePriceIWantToGiveAway() {
        OnStage.theActorInTheSpotlight().attemptsTo(BonoRegaloTask.bono());

    }

    @Then("^I make the purchase of the voucher successfully$")
    public void iMakeThePurchaseOfTheVoucherSuccessfully() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(BonoRegaloQuestion.bono(),
                Matchers.is(Matchers.equalTo(BONO))));
    }
}
