
package org.example;

import java.util.UUID;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true)
public class ConfigDO {

    private UUID id;

    public ConfigDO() {
    }

    // Mandatory for data objects
    public ConfigDO(JsonObject jsonObject) {
        ConfigDOConverter.fromJson(jsonObject, this);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID pId) {
        id = pId;
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        ConfigDOConverter.toJson(this, json);
        return json;
    }

}
