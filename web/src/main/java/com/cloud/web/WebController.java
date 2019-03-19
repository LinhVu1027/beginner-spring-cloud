package com.cloud.web;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Slf4j
public class WebController {
    NameService nameService;
    GreetingService greetingService;

    @GetMapping
    public String index(HttpServletRequest request) {
        String locale = RequestContextUtils.getLocaleResolver(request).resolveLocale(request).toLanguageTag();
        String greeting = new StringBuilder().append(greetingService.getGreeting(locale))
                .append(" ").append(nameService.getName()).toString();
        log.info("Greeting: " + greeting);
        log.info("Locale: " + locale);
        return greeting;
    }
}
