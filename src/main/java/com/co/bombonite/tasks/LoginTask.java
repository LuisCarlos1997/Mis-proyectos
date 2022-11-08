package com.co.bombonite.tasks;

import com.co.bombonite.interaction.Time;
import com.co.bombonite.models.LoginModel;
import com.co.bombonite.userinterfaces.LoginUserInteface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask implements Task {
    LoginModel loginModel;

    public LoginTask(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.keyValues(loginModel.getCedula()).into(LoginUserInteface.TXT_CEDULA));
        actor.attemptsTo(Enter.keyValues(loginModel.getContrasena()).into(LoginUserInteface.TXT_CONTRASENA));
        actor.attemptsTo(Click.on(LoginUserInteface.BTN_ACCEDER));
        Time.sleep(3000);
    }
    public static LoginTask ingresar(LoginModel loginModel){
        return Tasks.instrumented(LoginTask.class,loginModel);
    }
}
