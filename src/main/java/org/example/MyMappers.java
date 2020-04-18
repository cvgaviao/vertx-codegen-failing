package org.example;

import java.util.UUID;

public class MyMappers {

    public static UUID deserializeUUID(String value) {
        return (value != null) ? UUID.fromString(value) : null;
    }

    public static String serializeUUID(UUID value) {
        return (value != null) ? value.toString() : null;
    }

}
