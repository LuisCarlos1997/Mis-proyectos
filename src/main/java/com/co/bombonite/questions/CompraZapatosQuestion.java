package com.co.bombonite.questions;

import com.co.bombonite.userinterfaces.CompraZapatosUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompraZapatosQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(CompraZapatosUserInterfaces.TXT_FINALIZAR).viewedBy(actor).asString();
    }
    public static CompraZapatosQuestion compraZapatosQuestion() {
        return new CompraZapatosQuestion();
    }
}
