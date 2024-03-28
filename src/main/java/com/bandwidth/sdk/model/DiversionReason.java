package com.bandwidth.sdk.model;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import java.util.Map;
import lombok.Getter;

@Getter
public enum DiversionReason {
    away("away"),
    deflection("deflection"),
    do_not_disturb("do-not-disturb"),
    follow_me("follow-me"),
    no_answer("no-answer"),
    out_of_service("out-of-service"),
    time_of_day("time-of-day"),
    unavailable("unavailable"),
    unconditional("unconditional"),
    unknown("unknown"),
    user_busy("user-busy"),
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
