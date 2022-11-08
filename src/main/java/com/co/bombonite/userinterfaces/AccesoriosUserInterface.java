package com.co.bombonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccesoriosUserInterface {
    public static final Target BTN_ACCESORIOS = Target.the("Dar clic en el boton accesorio")
            .locatedBy("//*[@id='menu-item-7']");
    public static final Target IMG_PRODUCTO = Target.the("Dar clic en el producto a comprar")
            .locatedBy("(//*[contains (@href, 'esmeralda')]) [2]");

    public static final Target BTN_CARRITO = Target.the(" en el boton del carrito de compras")
            .locatedBy("//*[text()='Añadir al carrito']");

    public static final Target BTN_CANASTA = Target.the("Dar clic en el boton del carrito de compras")
            .locatedBy("//*[@class='cart-contents']");

    public static final Target BTN_FINALIZAR_COMPRA = Target.the("Dar clic en el boton finalizar compra")
            .locatedBy("//*[@class='checkout-button button alt wc-forward']");

    public static final Target TXT_FINALIZAR = Target.the("Dar clic en el boton finalizar compra")
            .locatedBy("(//*[text()='Finalizar compra']) [2]");

}
