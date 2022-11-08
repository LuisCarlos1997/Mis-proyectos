package com.co.bombonite.tasks;

import com.co.bombonite.userinterfaces.AccesoriosUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

public class AccesoriosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(AccesoriosUserInterface.BTN_ACCESORIOS));
        actor.attemptsTo(Click.on(AccesoriosUserInterface.IMG_PRODUCTO));
        actor.attemptsTo(Scroll.to(AccesoriosUserInterface.BTN_CARRITO));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(AccesoriosUserInterface.BTN_CARRITO));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(AccesoriosUserInterface.BTN_CANASTA));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(AccesoriosUserInterface.BTN_FINALIZAR_COMPRA));
    }

    public static AccesoriosTask accesoriosTask() {
        return Tasks.instrumented(AccesoriosTask.class);
    }
}