package com.co.bombonite.tasks;

import com.co.bombonite.userinterfaces.LoginUserInteface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class LoginTask1 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginUserInteface.BTN_LOGIN));
        //actor.attemptsTo(Hit.the(Keys.ENTER).into(LoginUserInteface.BTN_LOGIN));
    }

    public static LoginTask1 loginTask1() {
        return Tasks.instrumented(LoginTask1.class);
    }
}
