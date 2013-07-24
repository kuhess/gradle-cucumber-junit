package io.github.kuhess.cucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
        format = {"pretty"},
        glue = {"io.github.kuhess.cucumber"},
        features = {"src/test/resources/greetings.feature"},
        tags = "@done"
)
public class GreetingsRunner {
}
