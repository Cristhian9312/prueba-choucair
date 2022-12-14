package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLastStepPage;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairWelcomeFinishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answerr implements Question<Boolean> {
    private String question;
    public Answerr(String question){
        this.question = question;
    }
    public static Answerr toThe(String question){
        return new Answerr(question);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(ChoucairWelcomeFinishPage.NAME_CURSE).viewedBy(actor).asString();
        if (question.equals(nameCourse)){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
}