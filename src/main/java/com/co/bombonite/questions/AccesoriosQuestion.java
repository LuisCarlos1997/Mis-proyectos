package com.co.bombonite.questions;

import com.co.bombonite.userinterfaces.AccesoriosUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AccesoriosQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(AccesoriosUserInterface.TXT_FINALIZAR).viewedBy(actor).asString();
    }
    public static AccesoriosQuestion accesoriosQuestion(){
        return new AccesoriosQuestion();
    }
}
