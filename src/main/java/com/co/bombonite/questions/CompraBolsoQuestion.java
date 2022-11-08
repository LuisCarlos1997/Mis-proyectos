package com.co.bombonite.questions;

import com.co.bombonite.userinterfaces.CompraBolsoUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompraBolsoQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(CompraBolsoUserInterface.TXT_FINALIZAR).viewedBy(actor).asString();
    }
    public static CompraBolsoQuestion BolsoQuestion(){
        return new CompraBolsoQuestion();
    }
}
