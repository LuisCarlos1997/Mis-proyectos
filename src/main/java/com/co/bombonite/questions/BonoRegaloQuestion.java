package com.co.bombonite.questions;

import com.co.bombonite.userinterfaces.BonoRegaloUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class BonoRegaloQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(BonoRegaloUserInterface.TXT_DIRECCION).viewedBy(actor).asString();
    }
    public static BonoRegaloQuestion bono (){
        return new BonoRegaloQuestion();
    }
}
