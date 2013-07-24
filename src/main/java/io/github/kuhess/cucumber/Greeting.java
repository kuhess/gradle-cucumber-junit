package io.github.kuhess.cucumber;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;

import java.text.MessageFormat;
import java.util.Map;

public class Greeting {

    private final static Map<String, String> greetings = ImmutableMap.of(
            "french", "Bonjour {0} !",
            "english", "Hello {0}!"
    );
    private final String language;

    public Greeting(String language) {
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
