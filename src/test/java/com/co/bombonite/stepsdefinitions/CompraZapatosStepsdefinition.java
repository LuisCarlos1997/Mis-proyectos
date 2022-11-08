package com.co.bombonite.stepsdefinitions;

import com.co.bombonite.questions.CompraZapatosQuestion;
import com.co.bombonite.tasks.CompraZapatosTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.bombonite.utils.Utilidades.ZAPATOS;

public class CompraZapatosStepsdefinition {
    @When("^I choose the shoe to buy$")
    public void iChooseTheShoeToBuy() {
        OnStage.theActorInTheSpotlight().attemptsTo(CompraZapatosTask.compra());
    }

    @Then("^I make the purchase of the shoes successfully$")
    public void iMakeThePurchaseOfTheShoesSuccessfully() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompraZapatosQuestion.compraZapatosQuestion(),
                Matchers.is(Matchers.equalTo(ZAPATOS))));
    }
}
