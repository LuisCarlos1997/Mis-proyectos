package com.co.bombonite.tasks;

import com.co.bombonite.interaction.Robot;
import com.co.bombonite.interaction.Time;
import com.co.bombonite.userinterfaces.CompraZapatosUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

public class CompraZapatosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CompraZapatosUserInterfaces.BTN_ZAPATOS));
        actor.attemptsTo(Click.on(CompraZapatosUserInterfaces.BTN_TENIS));
        actor.attemptsTo(Click.on(CompraZapatosUserInterfaces.PROD_TENIS));
        actor.attemptsTo(Scroll.to(CompraZapatosUserInterfaces.CHECK_LIST));
        actor.attemptsTo(Click.on(CompraZapatosUserInterfaces.CHECK_LIST));
        Robot.robots();
        actor.attemptsTo(Hit.the(Keys.ENTER).into(CompraZapatosUserInterfaces.BTN_CARRITO));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(CompraZapatosUserInterfaces.BTN_CANASTA));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(CompraZapatosUserInterfaces.BTN_FINALIZAR_COMPRA));
        Time.sleep(5000);
    }
    public static CompraZapatosTask compra(){
        return Tasks.instrumented(CompraZapatosTask.class);
    }
}
