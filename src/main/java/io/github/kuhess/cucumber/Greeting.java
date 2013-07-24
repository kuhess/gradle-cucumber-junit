package io.github.kuhess.cucumber;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;

import java.text.MessageFormat;
import java.util.Map;

public class Greeting {

    enum Language {
        FRENCH, ENGLISH
    }

    private final static Map<Language, String> greetings = ImmutableMap.of(
            Language.FRENCH, "Bonjour {0} !",
            Language.ENGLISH, "Hello {0}!"
    );
    private final Language language;

    public Greeting(Language language) {
        this.language = language;
    }

    public String sayHello(String name) {
        String pattern = greetings.get(this.language);
        if (Strings.isNullOrEmpty(pattern)) {
            return null;
        }
        return MessageFormat.format(pattern, name);
    }
}
