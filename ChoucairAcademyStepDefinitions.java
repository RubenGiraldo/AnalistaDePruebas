package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.fluentlenium.core.search.Search;
import tasks.Login;
import tasks.OpenUp;

import java.awt.*;

public class ChoucairAcademyStepDefinitions {

    public ChoucairAcademyStepDefinitions() {
    }

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}

    @Given("^than ruben wants to learn automation at the academy Choucair$")
    public void thanRubenWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorCalled("Ruben").wasAbleTo(OpenUp.thePage(), Login.
                        onThePage(academyChoucairData.get(0).getStrUser(), academyChoucairData.get(0).getDStrPassword()));
    }

    @When("^he search for the course (.*) on the choucair academy platfrom$")
    public static void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform
            (List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia(List<AcademyChoucairData> academyChoucairData)
            throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(academyChoucairData.get(0).getStrCourse()));
    }
}
