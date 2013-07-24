package io.github.kuhess.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

public class GreetingsSteps {

    @Inject
    private GreetingFactory greetingFactory;

    private Greeting greeting;
    private String message;

    @Given("^I speak \"([^\"]*)\"$")
    public void I_speak(String language) throws Throwable {
        switch (language) {
            case "french":
                this.greeting = greetingFactory.frenchGreeting();
                break;
            case "english":
                this.greeting = greetingFactory.englishGreeting();
                break;
            default:
                this.greeting = greetingFactory.defaultGreeting();
        }
    }

    @When("^I greet \"([^\"]*)\"$")
    public void I_greet(String name) throws Throwable {
        this.message = this.greeting.sayHello(name);
    }

    @Then("^I say \"([^\"]*)\"$")
    public void I_say(String expectedMessage) throws Throwable {
        assertEquals(expectedMessage, this.message);
    }
}
