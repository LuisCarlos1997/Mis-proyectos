package com.co.bombonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CompraBolsoUserInterface {

    public static final Target BTN_BOLSO = Target.the("Dar clic en el boton bolso")
            .locatedBy("//*[@id='menu-item-8']");


    public static final Target RESPUESTA = Target.the("Dar clic en el boton bolso")
            .locatedBy("//*[@class='cart-contents-count']");
    public static final Target PROD_BOLSO = Target.the("Dar clic en el bolso a comprar")
            .locatedBy("(//*[contains(@href,'color-verde-esmeralda')]) [4]");

    public static final Target BTN_CARRITO = Target.the(" en el boton del carrito de compras")
            .locatedBy("//*[text()='Añadir al carrito']");

    public static final Target BTN_CANASTA = Target.the("Dar clic en el boton del carrito de compras")
            .locatedBy("//*[@class='cart-contents']");

    public static final Target BTN_FINALIZAR_COMPRA = Target.the("Dar clic en el boton finalizar compra")
            .locatedBy("//*[@class='checkout-button button alt wc-forward']");

    public static final Target TXT_FINALIZAR = Target.the("Dar clic en el boton finalizar compra")
            .locatedBy("(//*[text()='Finalizar compra']) [2]");

}
