package com.co.bombonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CinturonUserInterface {

    public static final Target BTN_CARRO= Target.the("Dar clic en el boton cinturon")
            .locatedBy("//*[@class='cart-contents-count']");

    //*[@class="cart-contents-count"]
    public static final Target BTN_CINTURON= Target.the("Dar clic en el boton cinturon")
            .locatedBy("//*[@id='menu-item-9']");

    public static final Target SEGUNDA_PAGINA = Target.the("Dar clic  en la segunda pagina")
            .locatedBy("(//*[contains(@href,'cinturones-mujer/page/2/')]) [3]");

    public static final Target PROD_CINTURON = Target.the("Dar clic  el cinturon")
            .locatedBy("(//*[contains(@href,'achiote')]) [2]");

    public static final Target TALLA = Target.the("Dar clic  en la talla del cinturon")
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
