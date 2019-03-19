package com.cloud.greeting;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class GreetingController {
    GreetingProperties greetingProperties;

    @GetMapping(value = "/{languageCode}")
    public String getGreeting(@PathVariable String languageCode) {
        log.info("Language Code: " + languageCode);
        log.info("Greeting: " + greetingProperties.getGreetings().get(languageCode.toUpperCase()));
        return greetingProperties.getGreetings().getOrDefault(languageCode.toUpperCase(), greetingProperties.getGreeting());
    }

    @GetMapping(value = "/")
    public String getGreeting() {
        log.info("Greeting: " + greetingProperties.getGreeting());
        return greetingProperties.getGreeting();
    }
}
