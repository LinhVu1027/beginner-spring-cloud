package com.cloud.greeting;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;


@ConfigurationProperties
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GreetingProperties {
    String greeting;
    Map<String, String> greetings;
}
