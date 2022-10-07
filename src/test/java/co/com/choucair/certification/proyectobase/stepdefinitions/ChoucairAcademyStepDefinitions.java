package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.ChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answerr;
import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^there is a form to enroll information$")
    public void thereIsAFormToEnrollInformation(List<ChoucairData> choucairData) throws Exception {
        OnStage.theActorCalled("Cristhian").wasAbleTo(OpenUp.thePAge(),  JoinToday.onThePage(choucairData.get(0).getFirstName(),choucairData.get(0).getLastNname()));
    }
    @When("^to write in the form correct values$")
    public void toWriteInTheFormCorrectValues(List<ChoucairData> choucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(choucairData.get(0).getStrCourse(), choucairData.get(0).getZipCode()));
        OnStage.theActorInTheSpotlight().attemptsTo(Divices.theDivices(choucairData.get(0).getStrCourse()));
        OnStage.theActorInTheSpotlight().attemptsTo(LastStep.theLastStep(choucairData.get(0).getPassword(), choucairData.get(0).getConfirmPassword()));
        OnStage.theActorInTheSpotlight().attemptsTo(WelcomeFinish.welcome(choucairData.get(0).getStrCourse()));
    }
    @Then("^the page welcomes us (.*)$")
    public void thePageAllowsACorrectRegistration(String finishText) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answerr.toThe(finishText)));
    }
}
