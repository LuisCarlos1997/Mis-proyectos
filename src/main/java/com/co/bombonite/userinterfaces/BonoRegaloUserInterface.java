package com.co.bombonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BonoRegaloUserInterface {

    public static final Target BTN_MENU= Target.the("Dar clic en el boton de hamburguesa")
            .locatedBy("//*[@id='burger']");

    public static final Target BTN_BONOS_DE_REGALO= Target.the("Dar clic en el boton de hamburguesa")
            .locatedBy("(//*[text()='Bonos de regalo'])[1]");

    public static final Target CHECK_LIST = Target.the("Dar clic en el lista de las tallas")
            .locatedBy("//*[@id='pa_valor-bono-regalo']");
    public static final Target BTN_CARRITO = Target.the(" en el boton del carrito de compras")
            .locatedBy("//*[text()='Añadir al carrito']");

    public static final Target BTN_CANASTA = Target.the("Dar clic en el boton del carrito de compras")
            .locatedBy("//*[@class='cart-contents']");

    public static final Target BTN_FINALIZAR_COMPRA = Target.the("Dar clic en el boton finalizar compra")
            .locatedBy("//*[@class='checkout-button button alt wc-forward']");

    public static final Target TXT_DIRECCION = Target.the("Dar clic en el boton finalizar compra")
            .locatedBy("//*[text()='¿Enviar a una dirección diferente?']");


}
