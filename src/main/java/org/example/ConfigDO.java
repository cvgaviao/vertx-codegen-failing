
package org.example;

import java.time.ZonedDateTime;
import java.util.UUID;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true)
public class ConfigDO {

    private RunMode mode;

    private ZonedDateTime date;

    private UUID id;

    private String name;

    public ConfigDO() {
    }

    // Mandatory for data objects
    public ConfigDO(JsonObject jsonObject) {
        ConfigDOConverter.fromJson(jsonObject, this);
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public void setId(UUID pId) {
        id = pId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        ConfigDOConverter.toJson(this, json);
        return json;
    }

    public RunMode getMode() {
        return mode;
    }

    public void setMode(RunMode mode) {
        this.mode = mode;
    }

}
