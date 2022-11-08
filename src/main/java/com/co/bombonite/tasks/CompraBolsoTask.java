package com.co.bombonite.tasks;

import com.co.bombonite.userinterfaces.CompraBolsoUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class CompraBolsoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CompraBolsoUserInterface.BTN_BOLSO));
        System.out.println(CompraBolsoUserInterface.RESPUESTA);
        actor.attemptsTo(Click.on(CompraBolsoUserInterface.PROD_BOLSO));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(CompraBolsoUserInterface.BTN_CARRITO));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(CompraBolsoUserInterface.BTN_CANASTA));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(CompraBolsoUserInterface.BTN_FINALIZAR_COMPRA));
    }

    public static CompraBolsoTask bolso() {
        return Tasks.instrumented(CompraBolsoTask.class);
    }
}
