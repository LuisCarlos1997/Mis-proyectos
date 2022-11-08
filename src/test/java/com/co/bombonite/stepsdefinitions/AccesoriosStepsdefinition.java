package com.co.bombonite.stepsdefinitions;

import com.co.bombonite.questions.AccesoriosQuestion;
import com.co.bombonite.tasks.AccesoriosTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.bombonite.utils.Utilidades.ACCESORIOS;

public class AccesoriosStepsdefinition {
    @When("^I choose the accessory that I want to compare$")
    public void iChooseTheAccessoryThatIWantToCompare() {
        OnStage.theActorInTheSpotlight().attemptsTo(AccesoriosTask.accesoriosTask());
    }

    @Then("^the purchase of the accessory is successful$")
    public void thePurchaseOfTheAccessoryIsSuccessful() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AccesoriosQuestion.accesoriosQuestion(),
                Matchers.is(Matchers.equalTo(ACCESORIOS))));
    }

}
