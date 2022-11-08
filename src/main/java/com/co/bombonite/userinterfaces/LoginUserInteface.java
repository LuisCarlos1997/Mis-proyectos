package com.co.bombonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUserInteface {
    public static final Target BTN_LOGIN = Target.the("Dar clic en el boton login")
            .locatedBy("//*[@class='myaccount']");

    public static final Target TXT_CEDULA = Target.the("ingresa su cedula")
            .locatedBy("//*[@id='username']");

    public static final Target TXT_CONTRASENA = Target.the("ingresa su contraseña")
            .locatedBy("//*[@id='password']");

    public static final Target BTN_ACCEDER= Target.the("Dar clic en el boton Acceder")
            .locatedBy("//*[@name='login']");
}
