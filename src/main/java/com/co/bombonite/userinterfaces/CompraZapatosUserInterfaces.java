package com.co.bombonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CompraZapatosUserInterfaces {


    public static final Target BTN_ZAPATOS = Target.the("Dar clic en el boton del zapato")
            .locatedBy("//*[@id='menu-item-10']");

     public static final Target BTN_TENIS = Target.the("Dar clic en el boton del zapato")
            .locatedBy(" (//*[contains(@href,'zapatos-mujer/tenis/')]) [2]");

    public static final Target PROD_TENIS = Target.the("Dar clic en el boton del zapato")
            .locatedBy("(//*[contains(@href,'color-blanco-crema')]) [2]");

    public static final Target CHECK_LIST = Target.the("Dar clic en el lista de las tallas")
            .locatedBy("//*[@id='pa_talla']");

    public static final Target BTN_CARRITO = Target.the(" en el boton del carrito de compras")
            .locatedBy("//*[text()='Añadir al carrito']");

    public static final Target BTN_CANASTA = Target.the("Dar clic en el boton del carrito de compras")
            .locatedBy("//*[@class='cart-contents']");


    public static final Target BTN_FINALIZAR_COMPRA = Target.the("Dar clic en el boton finalizar compra")
            .locatedBy("//*[@class='checkout-button button alt wc-forward']");

    public static final Target TXT_FINALIZAR = Target.the("Dar clic en el boton finalizar compra")
            .locatedBy("(//*[text()='Finalizar compra']) [2]");

}