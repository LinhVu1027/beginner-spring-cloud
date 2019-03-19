package com.cloud.name;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Slf4j
public class NameController {
    NameProperties nameProperties;

    @GetMapping
    public String getName() {
        log.info("Name: " + nameProperties.getName());
        return nameProperties.getName();
    }
}
