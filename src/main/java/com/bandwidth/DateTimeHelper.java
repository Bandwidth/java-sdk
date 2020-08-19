/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * This is a utility class for DateTime operations.
 */
public class DateTimeHelper {
    /**
     * Match the pattern for a datetime string in Rfc1123 format
     */
    private static final DateTimeFormatter RFC1123_DATE_TIME_FORMATTER = 
            DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss z");

    /**
     * Parse a Unix Timestamp to a DateTime object
     * @param date The Unix Timestamp
     * @return The DateTime object
     */
    public static LocalDateTime fromUnixTimestamp(Long date) {
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(date), ZoneId.systemDefault());
    }

    /**
     * Parse a Unix Timestamp string to a DateTime object
     * @param date The Unix Timestamp as a String
     * @return The parsed DateTime object
     */
    public static LocalDateTime fromUnixTimestamp(String date) {
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(Long.parseLong(date)), ZoneId.systemDefault());
    }

    /**
     * Convert a DateTime object to a Unix Timestamp string
     * @param value The DateTime object to convert
     * @return The converted String
     */
    public static String toUnixTimestamp(LocalDateTime value) {
        return Long.toString(value.toEpochSecond(java.time.ZoneOffset.UTC));
    }

    /**
     * Convert a List of DateTime objects to Unix Timestamp strings
     * @param value The List of DateTime objects to convert
     * @return The list of converted Strings
     */
    public static List<String> toUnixTimestamp(List<LocalDateTime> values) {
        if(values == null)
            return null;

        List<String> valuesAsString = new ArrayList<>();
        for (LocalDateTime value: values) {
            valuesAsString.add(toUnixTimestamp(value));
        }
        return valuesAsString;
    }

    /**
     * Parse a datetime string in Rfc1123 format to a DateTime object
     * @param date The datetime string in Rfc1123 format
     * @return The parsed DateTime object
     */
    public static LocalDateTime fromRfc1123DateTime(String date) {
        return LocalDateTime.parse(date, RFC1123_DATE_TIME_FORMATTER);
    }

    /**
     * Convert a DateTime object to a Rfc1123 formatted string
     * @param value The DateTime object to convert
     * @return The converted String
     */
    public static String toRfc1123DateTime(LocalDateTime value) {
        return RFC1123_DATE_TIME_FORMATTER.format(value.atZone(ZoneId.of("GMT")));
    }

    /**
     * Convert a List of DateTime objects to Rfc1123 formatted strings
     * @param value The List of DateTime objects to convert
     * @return The List of converted Strings
     */
    public static List<String> toRfc1123DateTime(List<LocalDateTime> values) {
        if(values == null)
            return null;

        List<String> valuesAsString = new ArrayList<>();
        for (LocalDateTime value: values) {
            valuesAsString.add(toRfc1123DateTime(value));
        }
        return valuesAsString;
    }

    /**
     * Parse a datetime string in Rfc8601(Rfc3339) format to a DateTime object
     * @param date The datetime string in Rfc8601(Rfc3339) format
     * @return The parsed DateTime object
     */
    public static LocalDateTime fromRfc8601DateTime(String date) {
        Pattern pattern = Pattern.compile("(Z|([+-])(\\d{2}:\\d{2}))$");
        Matcher patternMatcher = pattern.matcher(date);
        if (patternMatcher.find()) {
            OffsetDateTime parsed = OffsetDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);
            return LocalDateTime.from(parsed.withOffsetSameInstant(ZoneOffset.UTC));
        } else {
            return LocalDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);
        }
    }

    /**
     * Convert a DateTime object to a Rfc8601(Rfc3339) formatted string
     * @param value The DateTime object to convert
     * @return The converted String
     */
    public static String toRfc8601DateTime(LocalDateTime value) {
        return value.toString() + "Z";
    }

    /**
     * Convert a List of DateTime objects to Rfc8601(Rfc3339) formatted strings
     * @param value The List of DateTime objects to convert
     * @return The List of converted Strings
     */
    public static List<String> toRfc8601DateTime(List<LocalDateTime> values) {
        if(values == null)
            return null;

        List<String> valuesAsString = new ArrayList<>();
        for (LocalDateTime value: values) {
            valuesAsString.add(toRfc8601DateTime(value));
        }
        return valuesAsString;
    }

    /**
     * Parse a simple date string to a LocalDate object
     * @param date The date string
     * @return The parsed LocalDate object
     */
    public static LocalDate fromSimpleDate(String date) {
        return LocalDate.parse(date);
    }
    
    /**
     * Convert a LocalDate object to a string
     * @param value The LocalDate object to convert
     * @return The converted Strings
     */
    public static String toSimpleDate(LocalDate value) {
        return value.toString();
    }

    /**
     * Convert a List of LocalDate objects to strings
     * @param value The List of LocalDate objects to convert
     * @return The List of converted Strings
     */
    public static List<String> toSimpleDate(List<LocalDate> values) {
        if(values == null)
            return null;
        
        List<String> valuesAsString = new ArrayList<>();
        for (LocalDate value: values) {
            valuesAsString.add(toSimpleDate(value));
        }
        return valuesAsString;
    }

    /**
     * A class to handle deserialization of DateTime objects to Unix Timestamps
     */
    public static class UnixTimestampDeserializer extends JsonDeserializer<LocalDateTime> {
        @Override
        public LocalDateTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return fromUnixTimestamp(jp.getValueAsString());
        }
    }

    /**
     * A class to handle serialization of Unix Timestamps to DateTime objects
     */
    public static class UnixTimestampSerializer extends JsonSerializer<LocalDateTime> {
        @Override
        public void serialize(LocalDateTime value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            jgen.writeNumber(toUnixTimestamp(value));
        }
    }

    /**
     * A class to handle deserialization of DateTime objects to Rfc1123 format strings
     */
    public static class Rfc1123DateTimeDeserializer extends JsonDeserializer<LocalDateTime> {
        @Override
        public LocalDateTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return fromRfc1123DateTime(jp.getValueAsString());
        }
    }

    /**
     * A class to handle serialization of Rfc1123 format strings to DateTime objects 
     */
    public static class Rfc1123DateTimeSerializer extends JsonSerializer<LocalDateTime> {
        @Override
        public void serialize(LocalDateTime value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            jgen.writeString(toRfc1123DateTime(value));
        }
    }

    /**
     * A class to handle deserialization of DateTime objects to Rfc8601(Rfc3339) format strings
     */
    public static class Rfc8601DateTimeDeserializer extends JsonDeserializer<LocalDateTime> {
        @Override
        public LocalDateTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return fromRfc8601DateTime(jp.getValueAsString());
        }
    }

    /**
     * A class to handle serialization of Rfc8601(Rfc3339) format strings to DateTime objects 
     */
    public static class Rfc8601DateTimeSerializer extends JsonSerializer<LocalDateTime> {
        @Override
        public void serialize(LocalDateTime value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            jgen.writeString(toRfc8601DateTime(value));
        }
    }
    
    /**
     * A class to handle deserialization of date strings to LocalDate objects 
     */
    public static class SimpleDateDeserializer extends JsonDeserializer<LocalDate> {
        @Override
        public LocalDate deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return fromSimpleDate(jp.getValueAsString());
        }
    }
    
    /**
     * A class to handle serialization of LocalDate objects to date strings  
     */
    public static class SimpleDateSerializer extends JsonSerializer<LocalDate> {
        @Override
        public void serialize(LocalDate value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            jgen.writeString(toSimpleDate(value));
        }
    }
}