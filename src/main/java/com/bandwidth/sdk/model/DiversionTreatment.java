package com.bandwidth.sdk.model;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import java.util.Map;
import lombok.Getter;

@Getter
public enum DiversionTreatment {
    NONE("none"),
    PROPAGATE("propagate"),
    STACK("stack"),
    ;

    private static final Map<String, DiversionTreatment> DESERIALIZATION_MAP =
            Arrays.stream(values())
                    .collect(toMap(v -> v.name, identity()));

    private final String name;

    DiversionTreatment(String name) {
        this.name = name;
    }

    @JsonCreator
    public static DiversionTreatment resolve(String name) {
        return DESERIALIZATION_MAP.get(name.toLowerCase());
    }

    @Override
    public String toString() {
        return name;
    }
}
