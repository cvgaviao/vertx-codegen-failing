package org.example.utils;

import java.time.ZonedDateTime;
import java.util.UUID;

import org.example.RunMode;

public class MyMappers {
    public static RunMode deserializeRunMode(String value) {
        return (value != null) ? RunMode.of(value) : null;
    }

    public static UUID deserializeUUID(String value) {
        return (value != null) ? UUID.fromString(value) : null;
    }

    public static String serializeRunMode(RunMode value) {
        return (value != null) ? value.getLongName() : null;
    }

    public static String serializeUUID(UUID value) {
        return (value != null) ? value.toString() : null;
    }
    public static ZonedDateTime deserializeZonedDateTime(String value) {
        return (value != null) ? ZonedDateTime.parse(value) : null;
    }

    public static String serializeZonedDateTime(ZonedDateTime value) {
        return (value != null) ? value.toString() : null;
    }

}
