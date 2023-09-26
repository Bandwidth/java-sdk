package com.bandwidth.sdk.model;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import java.util.Map;
import lombok.Getter;

@Getter
public enum DiversionReason {
    AWAY("away"),
    DEFLECTION("deflection"),
    DO_NOT_DISTURB("do-not-disturb"),
    FOLLOW_ME("follow-me"),
    NO_ANSWER("no-answer"),
    OUT_OF_SERVICE("out-of-service"),
    TIME_OF_DAY("time-of-day"),
    UNAVAILABLE("unavailable"),
    UNCONDITIONAL("unconditional"),
    UNKNOWN("unknown"),
    USER_BUSY("user-busy"),
    ;

    private static final Map<String, DiversionReason> DESERIALIZATION_MAP =
            Arrays.stream(values())
                    .collect(toMap(v -> v.name, identity()));

    private final String name;

    DiversionReason(String name) {
        this.name = name;
    }

    @JsonCreator
    public static DiversionReason resolve(String name) {
        return DESERIALIZATION_MAP.get(name.toLowerCase());
    }

    @Override
    public String toString() {
        return name;
    }
}
