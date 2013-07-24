package io.github.kuhess.cucumber;

public class GreetingFactory {
    public Greeting frenchGreeting() {
        return new Greeting(Greeting.Language.FRENCH);
    }

    public Greeting englishGreeting() {
        return new Greeting(Greeting.Language.ENGLISH);
    }

    public Greeting defaultGreeting() {
        return new Greeting(Greeting.Language.ENGLISH);
    }
}
