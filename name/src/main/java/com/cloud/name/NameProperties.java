package com.cloud.name;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NameProperties {
    String name;
}
