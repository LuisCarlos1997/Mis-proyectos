package com.co.bombonite.tasks;

import com.co.bombonite.interaction.Robot;
import com.co.bombonite.interaction.Time;
import com.co.bombonite.userinterfaces.CinturonUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;


public class CinturonTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CinturonUserInterface.BTN_CINTURON));
        actor.attemptsTo(Click.on(CinturonUserInterface.SEGUNDA_PAGINA));
        actor.attemptsTo(Click.on(CinturonUserInterface.PROD_CINTURON));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(CinturonUserInterface.TALLA));
        Robot.robots();
        actor.attemptsTo(Hit.the(Keys.ENTER).into(CinturonUserInterface.BTN_CARRITO));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(CinturonUserInterface.BTN_CANASTA));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(CinturonUserInterface.BTN_FINALIZAR_COMPRA));
        Time.sleep(5000);
    }

    public static CinturonTask cinturon() {
        return Tasks.instrumented(CinturonTask.class);
    }
}
