package org.example;

public enum RunMode {

    DEV("dev", "development"), ITEST("itest", "integration-test"), MOCK("mock",
            "mock"), PRODUCTION("prod", "production"), STAGE("stage", "stage");

    public static RunMode of(String pName) {
        for (RunMode item : RunMode.values()) {
            if (item.names[0].equalsIgnoreCase(pName)
                    || item.names[1].equalsIgnoreCase(pName)
                    || pName.equalsIgnoreCase(item.name())) {
                return item;
            }
        }
        return DEV;
    }

    private String[] names = new String[2];

    RunMode(String pShortName, String pLongName) {
        names[0] = pShortName;
        names[1] = pLongName;
    }

    public String getLongName() {
        return names[1];
    }

    public String getShortName() {
        return names[0];
    }

    public boolean isDevMode() {
        return name().equals(DEV.name());
    }

    public boolean isMockMode() {
        return name().equals(MOCK.name());
    }

    public boolean isProduction() {
        return name().equals(PRODUCTION.name());
    }

    public boolean isProductionOrStage() {
        return name().equals(PRODUCTION.name()) || name().equals(STAGE.name());
    }

    public boolean isStage() {
        return name().equals(STAGE.name());
    }
}