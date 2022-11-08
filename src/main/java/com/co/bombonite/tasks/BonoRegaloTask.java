package com.co.bombonite.tasks;

import com.co.bombonite.interaction.Robot;
import com.co.bombonite.interaction.Time;
import com.co.bombonite.userinterfaces.BonoRegaloUserInterface;
import com.co.bombonite.userinterfaces.CompraBolsoUserInterface;
import com.co.bombonite.userinterfaces.CompraZapatosUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class BonoRegaloTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BonoRegaloUserInterface.BTN_MENU));
        actor.attemptsTo(Click.on(BonoRegaloUserInterface.BTN_BONOS_DE_REGALO));
        actor.attemptsTo(Click.on(BonoRegaloUserInterface.CHECK_LIST));
        Robot.robots();
        Time.sleep(5000);
        actor.attemptsTo(Hit.the(Keys.ENTER).into(BonoRegaloUserInterface.BTN_CARRITO));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(BonoRegaloUserInterface.BTN_CANASTA));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(BonoRegaloUserInterface.BTN_FINALIZAR_COMPRA));
        Time.sleep(5000);

    }

    public static BonoRegaloTask bono() {
        return Tasks.instrumented(BonoRegaloTask.class);

    }
}
